# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"

SRC_URI = "https://github.com/ros2/ros2cli/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "719ef41a37a46622c83aae6ede955b26"
SRC_URI[sha256sum] = "e446892b8f2cf00491b1aee29fd5b15a584430fc035d940dac56c6410ba23a07"

DEPENDS = "ament-python"

S = "${WORKDIR}/ros2cli-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"


