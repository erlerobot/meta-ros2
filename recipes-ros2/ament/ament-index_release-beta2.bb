# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

#DEPENDS = "ament-tools"

SRC_URI = "https://github.com/ament/ament_index/archive/release-beta2.tar.gz";downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "f86b7998539a65f6a74acc28b64d3904"
SRC_URI[sha256sum] = "fd32fbaf03e81a883d7fc29e1d69941165f8fe18bf8962d715ae0a4ef816e261"

S = "${WORKDIR}/ament_index-${PV}"
inherit ament

#FILES_${PN} += "/opt/ros2/"
