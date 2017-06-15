# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rcl_interfaces/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "53813da3ba9ff935cf8901fef8e3008c"
SRC_URI[sha256sum] = "edad4d68d9bdcfd87f2e2bcef966a4612d762a012cfc9b05be15e5a4ee864c9a"

DEPENDS = "rosidl rosidl-typesupport rmw-implementation ament-index"

S = "${WORKDIR}/rcl_interfaces-${PV}"

inherit ament python3-dir

FILES_${PN} += "/opt/ros2/"
