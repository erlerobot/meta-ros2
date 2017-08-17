# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rclcpp/archive/${PV}.tar.gz";downloadfilename=ros2_${PN}_${PV}.tar.gz"
#          file://0001.Fix_c++14_not_found.patch \
#          file://0002.Fix_c++14_not_found.patch"
SRC_URI[md5sum] = "52609924e50ce32c1fd399d3366ad84a"
SRC_URI[sha256sum] = "11d156f3cb736fb98d9d8bb76be5f8f563cd07171286e9120c30f8ee8d4e08af"

S = "${WORKDIR}/rclcpp-${PV}"

DEPENDS = "rcl common-interfaces ament-cmake"

inherit ament

FILES_${PN} += "/opt/ros2/"
