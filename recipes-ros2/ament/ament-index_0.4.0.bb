# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "ament-tools ament-cmake"

SRC_URI = "https://github.com/ament/ament_index/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "555ff6e1335ca48ba179dc702cfeede5"
SRC_URI[sha256sum] = "bba8fa8f8478ebc9f7ccf98e2cc8c4e6dc49bd0fd858999eb2c63b92d6cbcb10"

S = "${WORKDIR}/ament_index-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
