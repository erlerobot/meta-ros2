# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

#DEPENDS = "ament-tools"

SRC_URI = "https://github.com/ament/ament_index/archive/release-beta1.tar.gz"
SRC_URI[md5sum] = "88cc9c6da2ce89f6a7b3ac8e8da44795"
SRC_URI[sha256sum] = "d8f35dca26c02c6562e3fe036aec7e613fd6ad8c79fcfcf7a0778cc6b3d4b783"

S = "${WORKDIR}/ament_index-${PV}"
inherit ament

#FILES_${PN} += "/opt/ros2/"
