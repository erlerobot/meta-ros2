# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/robot_state_publisher/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "abd7ed57d9457908687edeff248aaf9e"
SRC_URI[sha256sum] = "9fa131546f2d1392ff1eb087885fa75b12804ec4ea74b8890a5037c5a8daa03d"

S = "${WORKDIR}/rmw-${PV}"

DEPENDS+="ament-cmake-ros rcutils"

inherit ament

FILES_${PN} += "/opt/ros2/"
