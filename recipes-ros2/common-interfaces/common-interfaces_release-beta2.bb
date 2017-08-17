# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.

inherit externalsrc

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/common_interfaces/archive/${PV}.tar.gz";downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "472528f62990bbd9e40e536be58a0327"
SRC_URI[sha256sum] = "6fad840371f0563713f471ac5f67ec0eae5b6c0db24912dbf5d45157d4a07236"

S = "${WORKDIR}/common_interfaces-${PV}"

DEPENDS = "ament-cmake ament-index rmw-implementation python3-dev"

inherit ament

FILES_${PN} += "/opt/ros2/"
