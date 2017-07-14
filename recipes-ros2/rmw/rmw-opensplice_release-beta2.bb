# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw_opensplice/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "c781996a8d5584803773e3b41f34c797"
SRC_URI[sha256sum] = "9e92891c0892ab3f87df7e2f37dae8ac126392a9e8ce92a78de2d978c4a5249b"

S = "${WORKDIR}/rmw_opensplice-${PV}"

DEPENDS += "rmw"

inherit ament

FILES_${PN} += "/opt/ros2/"
