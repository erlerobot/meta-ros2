# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;md5=95aa7c593d5862fa93efc3cda8f24666"

#HOMEPAGE = "http://osrf-pycommon.readthedocs.org/"
#SUMMARY = "Commonly needed Python modules, used by Python software developed at OSRF"

SRC_URI = "git://github.com/ros/class_loader.git;protocol=https;branch=ros2"
SRCREV = "a7e9af992f9fb3ba6b859203a322153ee82f4de5"

DEPENDS += "console-bridge"

S = "${WORKDIR}/git"

inherit ament
