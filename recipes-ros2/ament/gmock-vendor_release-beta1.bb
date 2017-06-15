# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cbbd27594afd089daa160d3a16dd515a"

SRC_URI = "https://github.com/ament/gmock_vendor/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "a0c0d1420039d13ad7f94a2cea67dbc2"
SRC_URI[sha256sum] = "169ba5cf3eb220ff74f3588acfb7f7c16484967fde6dee4ee4f3c44ad06303ba"

S = "${WORKDIR}/gmock_vendor-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2"
