# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rclcpp/archive/${PV}.tar.gz \
          file://0001.Fix_c++14_not_found.patch \
          file://0002.Fix_c++14_not_found.patch"
SRC_URI[md5sum] = "9ec567a8033a32e8150f5f0eae8263f1"
SRC_URI[sha256sum] = "5ff820382f13d3a157bea566a53e02f1235c29716f2c45039f904e588cbe86f6"

S = "${WORKDIR}/rclcpp-${PV}"

DEPENDS = "rcl common-interfaces ament-cmake"

inherit ament

FILES_${PN} += "/opt/ros2/"
