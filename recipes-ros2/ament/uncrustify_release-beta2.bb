# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = "ament-tools ament-cmake"

SRC_URI = "https://github.com/ament/uncrustify/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "3b290cbb9b5037b4b2d4aa2d6dc91f71"
SRC_URI[sha256sum] = "d7ad4df5b0f8aa4d07af43a1f1e7897fee908b95a8d4731998ee6be8bab59bce"

S = "${WORKDIR}/uncrustify-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2"
