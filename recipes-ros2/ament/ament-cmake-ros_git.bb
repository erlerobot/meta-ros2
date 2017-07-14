# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
inherit setuptools

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/ros2/ament_cmake_ros.git;protocol=https"
SRCREV = "0e8f0152717159bfac572745cbd143f326cbee35"

S = "${WORKDIR}/git"

inherit ament
