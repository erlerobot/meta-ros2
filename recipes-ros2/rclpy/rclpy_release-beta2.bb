# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rclpy/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "3f2d63e519ad559d41a06fa9479061ef"
SRC_URI[sha256sum] = "a19ba5e2f75cacf725a764d8c33d6560ba7dee44cfa6e1bfa7ad15fa84d5f1a5"

S = "${WORKDIR}/rclpy-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
