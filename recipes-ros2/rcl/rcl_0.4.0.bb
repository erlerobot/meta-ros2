# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rcl/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "38b5584022f70e67c34de7a250adaf01"
SRC_URI[sha256sum] = "a10c51b2dfc153779cc5ebb16d13b9888458d49117400db0b6afd652346c27d7"

DEPENDS = "rcl-interfaces rmw-implementation"

S = "${WORKDIR}/rcl-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
