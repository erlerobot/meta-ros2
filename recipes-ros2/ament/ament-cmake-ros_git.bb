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
SRCREV = "85f37bee18a7e139e62a84909b5677dc44281387"

DEPENDS = "ament-cmake"

S = "${WORKDIR}/git"

inherit ament
