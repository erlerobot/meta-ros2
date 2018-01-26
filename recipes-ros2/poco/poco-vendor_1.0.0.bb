# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4267f48fc738f50380cbeeb76f95cebc"

DEPENDS += "ament-cmake libpcre poco"

#SRC_URI = "https://github.com/ros2/poco_vendor;protocol=https;branch=master"
#SRCREV = "89b9c1528ea3255b38675f10cd58e12359cc8ce6"

SRC_URI = "https://github.com/ros2/poco_vendor/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "cf6e6cd11a35bc9dff1275f32c8a82d0"
SRC_URI[sha256sum] = "ccbc9f150c8e5df6fa5f2ef79e692b7f3518b61b3c6912f4be4f18712f2d192f"

S = "${WORKDIR}/poco_vendor-${PV}"

#S = "${WORKDIR}/git"

inherit ament

# FILES_${PN} += "/opt/ros2/"

# TODO: CHECK THIS
