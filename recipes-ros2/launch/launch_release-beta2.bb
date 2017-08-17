# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "ament-tools"

SRC_URI = "https://github.com/ros2/launch/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "5ea7ae8bb40803ce6228ca804707db08"
SRC_URI[sha256sum] = "6d8ae83b26736a9930a491260cb763567ba47951097330d6f9096758587dfba7"

S = "${WORKDIR}/launch-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
