#
# (C) 2017 Erle Robotics - Asier Bilbao <asier@erlerobotics.com>
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
ros2_dir = "/home/build/poky/build/tmp/sysroots/zynqberry/opt/ros2"


DEPENDS += "ament-cmake \
						gmock-vendor \
						gtest-vendor \
						osrf-pycommon \
						uncrustify \
						Fast-CDR \
						Fast-RTPS \
						class-loader \
						geometry2 \
						common-interfaces \
						demos \
						examples \
						launch \
						poco-vendor \
						rcl \
						rcl-interfaces \
						rclcpp \
						rclpy \
						realtime-support \
						rmw \
						rmw-connext \
						rmw-fastrtps \
						rmw-implementation \
						rmw-opensplice \
						ros1-bridge \
						rosidl \
						rosidl-dds \
						rosidl-typesupport \
						system-tests \
						tlsf \
						console-bridge \
						"

do_install () {
	mkdir -p ${D}/opt/ros2/
	cp -R ${ros2_dir}/* ${D}/opt/ros2/

	cd ${D}/opt/ros2/
	wget -O fix-path-setup.patch https://gist.githubusercontent.com/abilbaotm/e769d1e5b8f43b085f219f6d28244640/raw/d4579f0a2c7ad9812bbba8d918d6ad5875291c4d/fix-setup-path.patch
	patch -t -p0 < fix-path-setup.patch
	rm fix-path-setup.patch

	wget -O fix-path-local-setup.patch https://gist.githubusercontent.com/abilbaotm/e769d1e5b8f43b085f219f6d28244640/raw/d4579f0a2c7ad9812bbba8d918d6ad5875291c4d/fix-local-setup-path.patch
	patch -t -p0 < fix-path-local-setup.patch
	rm fix-path-local-setup.patch
}

FILES_${PN} += "/opt/ros2"
INSANE_SKIP_${PN} = "arch dev-so dev-deps staticdev ldflags rpaths compile-host-path compile-host-path"
INSANE_SKIP_${PN}-dev = "ldflags staticdev libdir dev-elf ldflags rpaths compile-host-path"
