# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""

SRC_URI = "https://github.com/ros2/rosidl/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "fb3260969b5dec67d9e03e2e2c84f306"
SRC_URI[sha256sum] = "9e8ae313841bd1e7e9fa3b508bf8b082fe554194d01628f1369acc298c570891"

S = "${WORKDIR}/rosidl-${PV}"

inherit ament
