# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "fe2a9ffeefa8a2800d885c1fed2beeab"
SRC_URI[sha256sum] = "ee4a81bb57654236a4e16dee84c7ed35ed3b49f1e119c13d8855d6cc3cb30201"

S = "${WORKDIR}/rmw-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
