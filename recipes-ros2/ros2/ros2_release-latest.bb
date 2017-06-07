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

SRC_URI = "https://github.com/ros2/ros2/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "55018e99fd650d82972da67dc114c14a"
SRC_URI[sha256sum] = "9ba04c750022a54fddf49db2b3acf358e1bf18ac8e548d45dd04ef1683498022"
INSANE_SKIP_${PN} = "arch dev-so dev-deps staticdev ldflags rpaths compile-host-path compile-host-path"
INSANE_SKIP_${PN}-dev = "ldflags staticdev libdir dev-elf ldflags rpaths compile-host-path"
INSANE_SKIP_${PN}-dbg += "arch"
FILES_${PN} += "/opt/ros2/"

DEPENDS = "libeigen opencv python3-nose python3-argparse"

#DEPENDS = "python3 ament-tools ament-index ament-lint ament-package class-loader common-interfaces console-bridge demos examples geometry2 gmock-vendor gtest-vendor launch osrf-pycommon poco-vendor rcl-interfaces rcl \
#	rclcpp rclpy realtime-support rmw-connext rmw-fastrtps rmw-implementation rmw-opensplice rmw ros1-bridge rosidl system-tests tlsf rosidl-typesupport uncrustify"


S = "${WORKDIR}/git"

EXTRA_OECMAKE = " -DASIO_INCLUDE_DIR=/usr/include/asio"


do_fetch () {
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

        pwd
	rm -rf src
        mkdir src
        wget https://raw.githubusercontent.com/ros2/ros2/master/ros2.repos
        vcs import src < ros2.repos
	
	# do_patch
	wget https://gist.githubusercontent.com/abilbaotm/c5edce7c3d08771158543f7e3f99a4d3/raw/831481c9a08d006ded5f394f30ccd17a4fe7dd88/0001_Find-Eigen-instead-of-Eigen3.patch
	patch -t -p0 < 0001_Find-Eigen-instead-of-Eigen3.patch
	
	#Remove opencv not working
	rm -rf src/ros2/demos/image_tools
	rm -rf src/ros2/demos/intra_process_demo

        src/ament/ament_tools/scripts/ament.py build --cmake-args -DCMAKE_LIBRARY_PATH=/home/build/poky/build/tmp/sysroots/zynqberry/usr/lib/ \
        -DCMAKE_INSTALL_INCLUDEDIR=/home/build/poky/build/tmp/sysroots/zynqberry/usr/include/ -DCMAKE_LINKER=/home/build/poky/build/tmp/sysroots/x86_64-linux/usr/bin/arm-poky-linux-gnueabi/arm-poky-linux-gnueabi-ld.bfd -DCMAKE_CROSSCOMPILING=1 -DCOMPILE_EXAMPLES=OFF \
        -DEIGEN3_INCLUDE_DIR=/home/build/poky/build/tmp/work/cortexa9hf-neon-poky-linux-gnueabi/libeigen/3.2.8-r0/image/usr/include/eigen3
	:
}

do_install () {
        install -d ${D}/opt/ros2/
        cp -r ${S}/* ${D}/opt/ros2/

	echo "Source: "
	echo ${S}
	echo "Dest: "
	echo ${D}/opt/ros2/
	:
}
