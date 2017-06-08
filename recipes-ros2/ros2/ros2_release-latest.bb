#
# (C) 2017 Erle Robotics - Asier Bilbao <asier@erlerobotics.com>
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!

inherit externalsrc

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "\
	file://fix-local-setup-path.patch \
	file://fix-setup-path.patch"
SRC_URI[md5sum] = "55018e99fd650d82972da67dc114c14a"
SRC_URI[sha256sum] = "9ba04c750022a54fddf49db2b3acf358e1bf18ac8e548d45dd04ef1683498022"
INSANE_SKIP_${PN} = "arch dev-so dev-deps staticdev ldflags rpaths compile-host-path compile-host-path"
INSANE_SKIP_${PN}-dev = "ldflags staticdev libdir dev-elf ldflags rpaths compile-host-path"
INSANE_SKIP_${PN}-dbg += "arch"
FILES_${PN} += "/opt/ros2/"

DEPENDS = "libeigen opencv python3-nose python3-argparse \
					 ament-tools"

#DEPENDS = "python3 ament-tools ament-index ament-lint ament-package class-loader common-interfaces console-bridge demos examples geometry2 gmock-vendor gtest-vendor launch osrf-pycommon poco-vendor rcl-interfaces rcl \
#	rclcpp rclpy realtime-support rmw-connext rmw-fastrtps rmw-implementation rmw-opensplice rmw ros1-bridge rosidl system-tests tlsf rosidl-typesupport uncrustify"


S = "${WORKDIR}/git"

EXTRA_OECMAKE = " -DASIO_INCLUDE_DIR=/usr/include/asio"

do_clean() {
	rm -rf ${S}/*
	:
}

do_fetch () {
	cd ${S}
        wget -O ros2.repos https://raw.githubusercontent.com/ros2/ros2/master/ros2.repos
	# Remove not working repos
	wget -O remove-not-working-repos.patch https://gist.githubusercontent.com/abilbaotm/6da34f71e9c368f7779c84f1c50fe6ce/raw/e4d4b90c85275e98cf78a03d764c33cc5ebd04f7/remove-not-working-repos.patch
	patch -t -p0 < remove-not-working-repos.patch

	mkdir src
	vcs import src < ros2.repos
	:
}

do_configure () {
	:
}


do_install () {
        install -d ${D}/opt/ros2/
        cp -r ${S}/install/* ${D}/opt/ros2/
	#TODO: Patch source files
	## patch
	cd ${D}/opt/ros2/
	pwd
	wget -O fix-path-setup.patch https://gist.githubusercontent.com/abilbaotm/e769d1e5b8f43b085f219f6d28244640/raw/2126502b0b72ce09472cce9e7a8a285b6954e40f/fix-setup-path.patch
	patch -t -p0 < fix-path-setup.patch
	rm fix-path-setup.patch

	wget -O fix-path-local-setup.patch https://gist.githubusercontent.com/abilbaotm/e769d1e5b8f43b085f219f6d28244640/raw/2126502b0b72ce09472cce9e7a8a285b6954e40f/fix-local-setup-path.patch
	patch -t -p0 < fix-path-local-setup.patch
	rm fix-path-local-setup.patch
	:
}
