# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rosidl/archive/${PV}.tar.gz";downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "b18dff9d3f2886b2b09f8323604c1ebb"
SRC_URI[sha256sum] = "9280cf9f1ea79019c9c9ebfe86e2ae059306c203eab3c0b1dd870b65eb3f6e00"

S = "${WORKDIR}/rosidl-${PV}"

inherit ament
