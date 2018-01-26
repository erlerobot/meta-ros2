# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "rmw rclcpp"

SRC_URI = "https://github.com/ros2/ros1_bridge/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "bd2f196d2975fd5098d7f279de4b4549"
SRC_URI[sha256sum] = "88431573721fcf08244f668bc313a9a39f620d824e95f31f9884c45233b2a2a3"

S = "${WORKDIR}/ros1_bridge-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
