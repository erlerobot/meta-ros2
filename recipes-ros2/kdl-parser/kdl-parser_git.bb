# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"

DEPENDS += "ament-cmake common-interfaces console-bridge rosidl rosidl-typesupport rclcpp orocos-kinematics-dynamics tinyxml-vendor"

SRC_URI = "git://github.com/ros2/kdl_parser.git;branch=ros2;protocol=https"
SRCREV = "4151131ddd3339ab93bbf40bbe9cbc4fe1c6bc41"

DEPENDS += "urdf urdfdom-headers libtinyxml tinyxml-vendor"

S = "${WORKDIR}/git"

inherit ament
