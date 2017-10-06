# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "common-interfaces"

SRC_URI = "https://github.com/ros2/rosidl/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "bb5ae3849d68d56a9ef5536dd8aa0f75"
SRC_URI[sha256sum] = "11b6270ec565247b50c896a503d29f764c7a1d96c14cb6259a17eff1a4219990"

S = "${WORKDIR}/rosidl-${PV}"

inherit ament
