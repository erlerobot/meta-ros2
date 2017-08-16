# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rcutils/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "d06f8a8947add5828aea8988fb5b9e5e"
SRC_URI[sha256sum] = "62db9cc4dad0e7abdf6b2f3c5b34748b165a1b74d2f5bad84a5a07e60559816e"

DEPENDS = "ament-cmake"

S = "${WORKDIR}/rcutils-${PV}"

inherit ament python3-dir

FILES_${PN} += "/opt/ros2/"
