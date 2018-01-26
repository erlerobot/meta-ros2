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
SRC_URI[md5sum] = "f4b4095dca96d0c535e54529aad2ea02"
SRC_URI[sha256sum] = "6d472b35cd25df43ae64708498f45b394320a459ba0c0345187a7235ff65f636"

S = "${WORKDIR}/ros1_bridge-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
