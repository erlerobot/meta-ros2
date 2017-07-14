# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw_connext/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "3f8345c86579ca7aaf3815a51d8ce20b"
SRC_URI[sha256sum] = "04ccc0ff7dcadf05768467f6e6818391f19b0d150e0b0cce84f5e8c99cf9e356"

S = "${WORKDIR}/ament_cmake-${PV}"

DEPENDS += "rmw"

inherit ament

FILES_${PN} += "/opt/ros2/"
