# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw_fastrtps/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "e6b3c554d0d7ba56ba05a403dc895b8b"
SRC_URI[sha256sum] = "6b3f1b28775fc97422567adccaadc89c1ba9446492b8b2ee1000d7bf2d479732"

S = "${WORKDIR}/rmw_fastrtps-${PV}"

DEPENDS += "rmw Fast-RTPS Fast-CDR"

inherit ament

FILES_${PN} += "/opt/ros2/"
