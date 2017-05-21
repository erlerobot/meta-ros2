# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rclcpp/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "26a8be48ff60296ea1bc698bb58fa7bc"
SRC_URI[sha256sum] = "4079dbb3df665ed428194f0d5924cb69a12284b6a0832ecf6515c87e9779e186"

S = "${WORKDIR}/ament_cmake-${PV}"

# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# Specify compilation commands here
	:
}

do_install () {
	# Specify install commands here
	:
}

