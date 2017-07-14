# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rcl/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "e6430254dcad5a8994849033c7a03bef"
SRC_URI[sha256sum] = "6d2e0a596ef28a54094fa344b358c00ddd455bcc87dceb3d50e78d7fc8e8ef62"

DEPENDS = "rcl-interfaces"

S = "${WORKDIR}/rcl-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
