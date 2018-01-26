# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

#DEPENDS = "ament-tools"

SRC_URI = "https://github.com/ament/ament_index/archive/release-beta2.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "1f43f5279318ecb360041eba1d399f2d"
SRC_URI[sha256sum] = "9f9f15830d5e7767c54951ed9639a249d2291d274d9851f0ff75fe9d34f3145e"

S = "${WORKDIR}/ament_index-${PV}"
inherit ament

#FILES_${PN} += "/opt/ros2/"
