# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
inherit setuptools

LICENSE = "CLOSED"

SRC_URI = "git://github.com/ros2/urdfdom_headers.git;protocol=https;branch=ros2"
SRCREV = "acb0c4bd3879a4e2ae5bd7d3551d8e7cc1037fa8"

S = "${WORKDIR}/git"

inherit ament
