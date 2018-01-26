# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rclcpp/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
#          file://0001.Fix_c++14_not_found.patch \
#          file://0002.Fix_c++14_not_found.patch"
SRC_URI[md5sum] = "9666bee84864a70cc8daa5243e72f521"
SRC_URI[sha256sum] = "fab4c5bb59d9c9d94717a982f526b9b3c6b4a4b532057964a0d989c9df2b21ee"

S = "${WORKDIR}/rclcpp-${PV}"

DEPENDS = "rcl common-interfaces ament-cmake"

inherit ament

FILES_${PN} += "/opt/ros2/"
