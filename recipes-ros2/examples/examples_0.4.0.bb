# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/examples/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "3f7d44f67037c60d1c332501aa5b1525"
SRC_URI[sha256sum] = "d1c146b9d2b7fa0a2c8f11c233ca90854a147cf7c3ef872d14efcf7051fb131f"

DEPENDS = "ament-cmake rclcpp poco-vendor rosidl poco class-loader"

S = "${WORKDIR}/examples-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
