# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw_opensplice/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "7e3ece4608330b8d66120eabb5bc31a2"
SRC_URI[sha256sum] = "8c38cf168e1185782f3c7cf14f29ff88874121fd5c4bc8ab0a545763cd13dab5"

S = "${WORKDIR}/rmw_opensplice-${PV}"

DEPENDS += "rmw"

inherit ament

FILES_${PN} += "/opt/ros2/"
