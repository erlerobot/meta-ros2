# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "9273072ed61653bbe4192d0b8f12701f"
SRC_URI[sha256sum] = "534a18cc3f35c8ede94e0c47175ca89ac425c8dd71b2a54488bfa2c19dbffcdf"

S = "${WORKDIR}/rmw-${PV}"

DEPENDS+="ament-cmake-ros rcutils"

inherit ament

FILES_${PN} += "/opt/ros2/"
