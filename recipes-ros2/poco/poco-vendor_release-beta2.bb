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
SRC_URI[md5sum] = "267fbdcd54f02d087c5375ac7addf133"
SRC_URI[sha256sum] = "2e062f7110d95b6b6f5749fdf6c0a1048c2fc76f48b3cb98edf113afbac0a390"

S = "${WORKDIR}/poco_vendor-${PV}"

inherit ament

# FILES_${PN} += "/opt/ros2/"

# TODO: CHECK THIS
