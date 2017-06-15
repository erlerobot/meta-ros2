# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "ament-tools"

SRC_URI = "https://github.com/ros2/launch/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "c2341606380930fccc7a28da44269bf5"
SRC_URI[sha256sum] = "38e4d292608aecf3254fb1d5a84ea71df9b21c321839591641fa58cde11908b8"

S = "${WORKDIR}/launch-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
