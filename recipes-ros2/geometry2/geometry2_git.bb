# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://tf2_eigen/package.xml;md5=0e1b8f1652a6bd32eb68d824c405ce99"

DEPENDS += "ament-cmake common-interfaces console-bridge rosidl rosidl-typesupport rclcpp orocos-kinematics-dynamics"

SRC_URI = "git://github.com/ros2/geometry2.git;branch=ros2;protocol=https"
SRCREV = "fe1858c8155d94d52f3591529379d29192754cb0"

S = "${WORKDIR}/git"

inherit ament
