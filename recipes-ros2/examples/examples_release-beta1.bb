# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/examples/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "6285504b1a3b194c745b437383d95be4"
SRC_URI[sha256sum] = "85d08503bf27342e9fd279e5b6e226c9d899d379b3ad51a86cc8fff6b2238347"

DEPENDS = "ament-cmake rclcpp poco-vendor rosidl"

S = "${WORKDIR}/examples-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
