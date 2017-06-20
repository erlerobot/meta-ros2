# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rclpy/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "913a6d1a8806beaf76d343cf59dff0c8"
SRC_URI[sha256sum] = "1a73c0ce8811e67ed34f41dc56d40a9e9d68ea7ef44d36e4aa53214c69ed2097"

S = "${WORKDIR}/ament_cmake-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
