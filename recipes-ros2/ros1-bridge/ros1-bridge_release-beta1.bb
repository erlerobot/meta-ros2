# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/ros1_bridge/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "eda80e29087b68a6c0baa4e534e0365c"
SRC_URI[sha256sum] = "d36319e875c1e5469a02bca9544a181115b155c891aa6135c06aa8ff88c98201"

S = "${WORKDIR}/ros1_bridge-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
