# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw_implementation/archive/${PV}.tar.gz";downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "9802411367fa0e19bcba62b41ab350d3"
SRC_URI[sha256sum] = "7c82174f52ace42e36628882a7e983e2eeaa1fa788918d1c5046cb9f1dd21fff"

S = "${WORKDIR}/rmw_implementation-${PV}"

DEPENDS += "rmw rmw-fastrtps"

inherit ament

FILES_${PN} += "/opt/ros2/"
