# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

#DEPENDS = "ament-tools"

SRC_URI = "https://github.com/ament/ament_lint/archive/release-beta1.tar.gz";downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "f7bf77e2694b18bc0737dd07ed3dc6db"
SRC_URI[sha256sum] = "7f5e59b532dbbb0576b200c622bbfd48d8ea03a61fd1bbbe09664d6a195722f5"

S = "${WORKDIR}/ament_lint-${PV}"
inherit ament

#FILES_${PN} += "/opt/ros2"
