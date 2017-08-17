# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/examples/archive/${PV}.tar.gz";downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "7f39925caf3ebe00a83ea369f12554f4"
SRC_URI[sha256sum] = "8285c7b8b501865d3be2527a966e80d5e9feff4d87255d442000403cd5c518ba"

DEPENDS = "ament-cmake rclcpp poco-vendor rosidl"

S = "${WORKDIR}/examples-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
