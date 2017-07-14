# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/sros2/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "7f3d9dabcec877ae9787aea67a6d1b1f"
SRC_URI[sha256sum] = "22ce9133aa971d8fe80bad6fc24c8f1b858be015a311b2d8f22fef0bd17b6955"

S = "${WORKDIR}/rmw_opensplice-${PV}"

DEPENDS += "openssl rmw"

inherit ament

FILES_${PN} += "/opt/ros2/"
