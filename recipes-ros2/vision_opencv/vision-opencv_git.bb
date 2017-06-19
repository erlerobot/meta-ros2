# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
inherit setuptools

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

DEPENDS += "ament-cmake-ros"

SRC_URI = "git://github.com/ros2/vision_opencv.git;branch=ros2;protocol=https"
SRCREV = "bce4a55313c022bfd9ab9b7b13996447f3906e04"

S = "${WORKDIR}/git"

inherit ament
