# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/demos/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "31466bd19dba913b8ad251066bafce7c"
SRC_URI[sha256sum] = "99861a5ae6e9c0e63bf5808954ccdce360fba4663c3928d4b660385c1da7ccc6"

DEPENDS = "ament-tools rclcpp class-loader opencv"

S = "${WORKDIR}/demos-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
