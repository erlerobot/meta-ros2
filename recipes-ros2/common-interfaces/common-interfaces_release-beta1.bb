# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.

inherit externalsrc

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/common_interfaces/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "f62c272b61c14f7b775290f49601a744"
SRC_URI[sha256sum] = "33bdb7dabf250a3e949798ad6d4745e900a44352901d8dafd838a744e5cae349"

S = "${WORKDIR}/common_interfaces-${PV}"

DEPENDS = "ament-cmake ament-index rmw-implementation python3-dev"

inherit ament

FILES_${PN} += "/opt/ros2/"
