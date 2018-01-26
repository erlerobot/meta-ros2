# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "rcl"

SRC_URI = "https://github.com/ros2/rclpy/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "84d1662474589d85cd7c576e3bc29d0c"
SRC_URI[sha256sum] = "bd921369161e7477423895719926e2d874464c1e3c66c239e9176cdc64806ccc"

S = "${WORKDIR}/rclpy-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
