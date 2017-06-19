# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4267f48fc738f50380cbeeb76f95cebc"

DEPENDS += "ament-cmake libpcre"

SRC_URI = "https://github.com/ros2/poco_vendor/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "c9e49e7a3ddc3f85cc2be7dd8cb661d2"
SRC_URI[sha256sum] = "d1b731bfa0f12082419c8331c606d1865ec1dafcb361bbe10b05693392fd3fa8"

S = "${WORKDIR}/poco_vendor-${PV}"

inherit ament

# FILES_${PN} += "/opt/ros2/"

# TODO: CHECK THIS
