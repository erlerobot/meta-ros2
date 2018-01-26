#
# (C) 2017 Erle Robotics - Asier Bilbao <asier at erlerobotics dot com>
#                        - Lander Usategui <lander at erlerobotics dot com>
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"

SUMMARY = ""

DEPENDS = " \
	ament-cmake \
	ament-index \
	ament-lint \
	ament-package \
	ament-tools \
	googletest \
	osrf-pycommon \
	uncrustify \
	fast-cdr \
	fast-rtps \
	class-loader \
	console-bridge \
	pluginlib \
	resource-retriever \
	ament-cmake-ros \
	common-interfaces \
	demos \
	examples \
	example-interfaces \
	geometry2 \
	kdl-parser \
	launch \
	orocos-kinematics-dynamics \
	poco-vendor \
	rcl \
	rcl-interfaces \
	rclcpp \
	rclpy \
	rcutils \
	realtime-support \
	rmw \
	rmw-connext \
	rmw-fastrtps \
	rmw-implementation \
	rmw-opensplice \
	robot-state-publisher \
	ros1-bridge \
	ros2cli \
	rosidl \
	rosidl-dds \
	rosidl-typesupport \
	sros2 \
	system-tests \
	tinyxml2 \
	tlsf \
	urdf \
	urdfdom-headers \
	"
#	tinyxml-vendor \
#

do_install () {
	mkdir -p ${D}/opt/ros2/
	cp -R ${ROS2_DIR}/* ${D}/opt/ros2/

#	cd ${D}/opt/ros2/
#	echo ${D}
#	wget -O fix-path-setup.patch https://gist.githubusercontent.com/abilbaotm/e769d1e5b8f43b085f219f6d28244640/raw/d4579f0a2c7ad9812bbba8d918d6ad5875291c4d/fix-setup-path.patch
#	patch -f -t -p0 < fix-path-setup.patch
#	rm fix-path-setup.patch

#	wget -O fix-path-local-setup.patch https://gist.githubusercontent.com/abilbaotm/e769d1e5b8f43b085f219f6d28244640/raw/d4579f0a2c7ad9812bbba8d918d6ad5875291c4d/fix-local-setup-path.patch
#	patch -f -t -p0 < fix-path-local-setup.patch
#	rm fix-path-local-setup.patch
}

FILES_${PN} += "/opt/ros2"
INSANE_SKIP_${PN} = "arch dev-so dev-deps staticdev ldflags rpaths compile-host-path compile-host-path file-rdeps"
INSANE_SKIP_${PN}-dev = "ldflags staticdev libdir dev-elf ldflags rpaths compile-host-path"
