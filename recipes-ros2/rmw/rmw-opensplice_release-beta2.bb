# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw_opensplice/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "bcb4b1d6c4a003f6923089d2546ee704"
SRC_URI[sha256sum] = "96e045a2202f2f0160306b23d59a907cc04a1fbb95f4eace50f07e811fb606e2"

S = "${WORKDIR}/rmw_opensplice-${PV}"

DEPENDS += "rmw"

inherit ament

FILES_${PN} += "/opt/ros2/"
