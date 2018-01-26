# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/demos/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "6d1e053bfc4b8942ed5e6eb4faf620ea"
SRC_URI[sha256sum] = "282b39db45bff1eb7ab54cf9d0c50457e5982212c4fc52b287461173edf3b994"

DEPENDS = "ament-tools rclcpp class-loader opencv example-interfaces"

S = "${WORKDIR}/demos-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
