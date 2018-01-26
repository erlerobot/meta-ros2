# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw_opensplice/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "7b17007f218b0226d9c68fd266aa9ec0"
SRC_URI[sha256sum] = "62c9dac2354bafacabcc94f728e9c8b88c72fccfa2e413c65795c1116f9b0dd0"

S = "${WORKDIR}/rmw_opensplice-${PV}"

DEPENDS += "rmw"

#inherit ament

FILES_${PN} += "/opt/ros2/"
