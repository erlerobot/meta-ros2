# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"

SRC_URI = "https://github.com/ros2/ros2cli/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "e933ace8cc68c471652eabcc15cff812"
SRC_URI[sha256sum] = "21b98e4a4603b203d31f25d55c1a689776914bbf1a1a34c26f44eb44988257f9"

DEPENDS = ""

S = "${WORKDIR}/ros2cli-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
