# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rcl_interfaces/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "49b31477b4ebfc40ab22d91fa57e423c"
SRC_URI[sha256sum] = "87cf8677be414a671a25bfb920153594827e4706a6bf6e112d485c134df32446"

DEPENDS = "rosidl-typesupport ament-index ament-cmake osrf-pycommon python3-dev rmw-fastrtps"

S = "${WORKDIR}/rcl_interfaces-${PV}"

inherit ament python3-dir

FILES_${PN} += "/opt/ros2/"
