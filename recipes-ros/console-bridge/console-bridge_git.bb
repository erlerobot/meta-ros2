# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://src/console.cpp;md5=2391cb1aafb648f6fb0f7f0f7bcd03ee"

SRC_URI = "git://github.com/ros/console_bridge.git;protocol=https"
SRCREV = "c227ae01ce16d73facb477644d9c25a5ddb166fa"


S = "${WORKDIR}/git"

inherit ament
