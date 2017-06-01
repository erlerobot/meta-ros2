#
# (C) 2017 Erle Robotics - Asier Bilbao <asier@erlerobotics.com>
#
# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
#require ament-tools.inc
inherit externalsrc

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "https://github.com/ros2/ros2/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "55018e99fd650d82972da67dc114c14a"
SRC_URI[sha256sum] = "9ba04c750022a54fddf49db2b3acf358e1bf18ac8e548d45dd04ef1683498022"
INSANE_SKIP_${PN} = "arch"
INSANE_SKIP_${PN}-dbg += "arch"

DEPENDS = "opencv python3-nose"

#DEPENDS = "python3 poco asio libtinyxml2"

#DEPENDS = "python3 ament-tools ament-index ament-lint ament-package class-loader common-interfaces console-bridge demos examples geometry2 gmock-vendor gtest-vendor launch osrf-pycommon poco-vendor rcl-interfaces rcl \
#	rclcpp rclpy realtime-support rmw-connext rmw-fastrtps rmw-implementation rmw-opensplice rmw ros1-bridge rosidl system-tests tlsf rosidl-typesupport uncrustify"

#inherit crosssdk
#inherit cmake
#inherit python python-dir python3 python3-dir
#inherit autotools setuptools3 python3 python3-dir
###inherit cross
#inherit setuptools
##inherit cross
#inherit bin_package
#inherit distutils3
#inherit ros2
#inherit waf

# Modify these as desired
#PV = "1.0+git${SRCPV}"
#SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

# NOTE: no Makefile found, unable to determine what needs to be done
EXTRA_OECMAKE = " -DASIO_INCLUDE_DIR=/usr/include/asio"


do_fetch () {
#	pwd
#       mkdir src
#       wget https://raw.githubusercontent.com/ros2/ros2/release-latest/ros2.repos
#	wget https://raw.githubusercontent.com/ros2/ros2/master/ros2.repos
#       vcs import src < ros2.repos
	:
}
do_configure () {
	# Specify any needed configure commands here
	echo ${WORKDIR}

}

do_compile () {
	echo "TEST PATH"
	echo ${exec_prefix}/lib/${CROSS_TARGET_SYS_DIR}

	echo ${libdir} ${base_libdir}

#	exit 1
	# Specify compilation commands here

        pwd
	rm -rf src
        mkdir src
        wget https://raw.githubusercontent.com/ros2/ros2/master/ros2.repos
        vcs import src < ros2.repos
#	export LD_LIBRARY_PATH=/home/build/poky/build/tmp/sysroots/zynqberry/usr/lib
#	echo $LD_LIBRARY_PATH


	src/ament/ament_tools/scripts/ament.py build --cmake-args -DCMAKE_LIBRARY_PATH=/home/build/poky/build/tmp/sysroots/zynqberry/usr/lib/ \
	-DCMAKE_INSTALL_INCLUDEDIR=/home/build/poky/build/tmp/sysroots/zynqberry/usr/include/ -DCMAKE_LINKER=/home/build/poky/build/tmp/sysroots/x86_64-linux/usr/bin/arm-poky-linux-gnueabi/arm-poky-linux-gnueabi-ld.bfd

#        src/ament/ament_tools/scripts/ament.py build --build-tests --symlink-install --cmake-args -DCMAKE_LIBRARY_PATH=/home/build/poky/build/tmp/sysroots/zynqberry/usr/lib/ \
#        -DCMAKE_INSTALL_INCLUDEDIR=/home/build/poky/build/tmp/sysroots/zynqberry/usr/include/ -DCMAKE_LINKER=/home/build/poky/build/tmp/sysroots/x86_64-linux/usr/bin/arm-poky-linux-gnueabi/arm-poky-linux-gnueabi-ld.bfd

#	src/ament/ament_tools/scripts/ament.py build --build-tests --symlink-install --cmake-args -DCMAKE_PREFIX_PATH=/home/build/poky/build/tmp/sysroots/zynqberry

#	src/ament/ament_tools/scripts/ament.py build --build-tests --symlink-install --cmake-args -DCMAKE_CXX_COMPILER=/home/build/poky/build/tmp/work/x86_64-linux/gcc-cross-arm/6.2.0-r0/sysroot-destdir/home/build/poky/build/tmp/sysroots/x86_64-linux/usr/bin/arm-poky-linux-gnueabi/arm-poky-linux-gnueabi-g++ -DCMAKE_C_COMPILER=/home/build/poky/build/tmp/work/x86_64-linux/gcc-cross-arm/6.2.0-r0/image/home/build/poky/build/tmp/sysroots/x86_64-linux/usr/libexec/arm-poky-linux-gnueabi/gcc/arm-poky-linux-gnueabi/6.2.0/arm-poky-linux-gnueabi-gcc \
#	-DCMAKE_LIBRARY_PATH=/home/build/poky/build/tmp/sysroots/zynqberry/usr/lib/

#	src/ament/ament_tools/scripts/ament.py build --build-tests --symlink-install \
#	--cmake-args -DCMAKE_LIBRARY_PATH=/home/build/poky/build/tmp/sysroots/zynqberry/usr/lib/

	:
}

do_install () {
        install -d ${D}/opt/ros2/
        cp -r ${S}/* ${D}/opt/ros2/

	echo "Source: "
	echo ${S}
	echo "Dest: "
	echo ${D}/opt/ros2/
#	exit 1
}


FILES_${PN} += "/opt/ros2/"



