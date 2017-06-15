# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rcl/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "12b9df6d2acf374c38b2d3d0225d1866"
SRC_URI[sha256sum] = "bc2ed3e8c3addf063b7f9451df2ffcc1ebdf512b84e80602db28facd8f966d59"

DEPENDS = "rcl-interfaces"

S = "${WORKDIR}/rcl-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
