# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rcl_interfaces/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "8680a8f9d01514105b9b23e738a10b41"
SRC_URI[sha256sum] = "2838a3bc4297b408868545e95511a6cb688bd205d0ae541443adecae7888cc7c"

DEPENDS = "rosidl rosidl-typesupport rmw-implementation ament-index ament-cmake rosidl-typesupport osrf-pycommon python3-dev"

S = "${WORKDIR}/rcl_interfaces-${PV}"

inherit ament python3-dir

FILES_${PN} += "/opt/ros2/"
