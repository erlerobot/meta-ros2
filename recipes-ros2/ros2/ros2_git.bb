# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
#require ament-tools.inc

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/ros2/ros2;protocol=https"

DEPENDS = "poco"

#DEPENDS = "python3 ament-tools ament-index ament-lint ament-package class-loader common-interfaces console-bridge demos examples geometry2 gmock-vendor gtest-vendor launch osrf-pycommon poco-vendor rcl-interfaces rcl \
#	rclcpp rclpy realtime-support rmw-connext rmw-fastrtps rmw-implementation rmw-opensplice rmw ros1-bridge rosidl system-tests tlsf rosidl-typesupport uncrustify"
inherit cmake
inherit pythonnative python-dir python3native
inherit autotools setuptools3

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

# NOTE: no Makefile found, unable to determine what needs to be done
#EXTRA_OECMAKE = " -DBOOST_LIBRARYDIR=/usr/lib/"
do_fetch () {
#	pwd
#        mkdir src
#       wget https://raw.githubusercontent.com/ros2/ros2/release-latest/ros2.repos
#	wget https://raw.githubusercontent.com/ros2/ros2/master/ros2.repos
#        vcs import src < ros2.repos
	:
}
do_configure () {
	# Specify any needed configure commands here
	echo ${WORKDIR}

}

do_compile () {
	# Specify compilation commands here
#       cd /home/build/common/opt/ros2/
#	echo "GO TO SRC"
	export BUILD_SYS
	export HOST_SYS
	export STAGING_INCDIR
	export STAGING_LIBDIR

python - <<EOF
	
import platform

print(platform.architecture())
EOF


        pwd
        mkdir src
#       wget https://raw.githubusercontent.com/ros2/ros2/release-latest/ros2.repos
        wget https://raw.githubusercontent.com/ros2/ros2/master/ros2.repos
        vcs import src < ros2.repos
	export LD_LIBRARY_PATH=/home/build/poky/build/tmp/sysroots/zynqberry/usr/lib
	echo $LD_LIBRARY_PATH
	src/ament/ament_tools/scripts/ament.py build --build-tests --symlink-install

	:
}

do_install () {
        install -d ${D}/opt/ros2/
        cp -r ${S}/* ${D}/opt/ros2/
}


FILES_${PN} += "/opt/ros2/"


#
