# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
inherit setuptools

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

DEPENDS += "rosidl rosidl-typesupport ament-cmake rmw-fastrtps"

SRC_URI = "git://github.com/ros2/example_interfaces.git;protocol=https"
SRCREV = "b9f9477cd7f368e61f81d55c5021f4c70ad1fe12"

S = "${WORKDIR}/git"

inherit ament
