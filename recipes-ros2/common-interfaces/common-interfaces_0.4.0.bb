# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.

inherit externalsrc

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/common_interfaces/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "d8c256ee409dad3da4a3f6df2b6d00e9"
SRC_URI[sha256sum] = "fae7f1773f28eb4403aa7677e6641a10ef3793a5f8adfc9a212c6132dca2b262"

S = "${WORKDIR}/common_interfaces-${PV}"

DEPENDS = "ament-cmake ament-index python3-dev rcl-interfaces"

inherit ament

FILES_${PN} += "/opt/ros2/"
