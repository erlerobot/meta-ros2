# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw_fastrtps/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "68c0923b37e76c85386570c1e16cc51a"
SRC_URI[sha256sum] = "ce43c039b636e0e4d448981264de2a27e2b9735da948dbbd687b41126570282c"

S = "${WORKDIR}/rmw_fastrtps-${PV}"

DEPENDS += "rmw Fast-RTPS"

inherit ament

FILES_${PN} += "/opt/ros2/"
