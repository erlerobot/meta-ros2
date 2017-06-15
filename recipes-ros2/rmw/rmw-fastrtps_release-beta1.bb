# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw_fastrtps/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "ada93e0725f8ed917f33f1c42167ec58"
SRC_URI[sha256sum] = "2a8ae81e53067ec9c31fcdd8b72c3700cc5f1cbe946fa831769bcbd0164d99f6"

S = "${WORKDIR}/rmw_fastrtps-${PV}"

DEPENDS += "rmw Fast-RTPS"

inherit ament

FILES_${PN} += "/opt/ros2/"
