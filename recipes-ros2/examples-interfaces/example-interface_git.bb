# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
inherit setuptools

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

DEPENDS += "rosidl rosidl-typesupport ament-cmake"

SRC_URI = "git://github.com/ros2/example_interfaces.git;protocol=https"
SRCREV = "dfcbbd8ead5fc254daee76166710fdd254b902f5"

S = "${WORKDIR}/git"

inherit ament
