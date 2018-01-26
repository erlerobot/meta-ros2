# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "9a2e68ae54bae3fb29e6d4bed5d987ca"
SRC_URI[sha256sum] = "af160262845c4d71e8c6ef113a29c014c5126af2cca607158d2ff838b1d47d90"

S = "${WORKDIR}/rmw-${PV}"

DEPENDS+="ament-cmake-ros rcutils"

inherit ament

FILES_${PN} += "/opt/ros2/"
