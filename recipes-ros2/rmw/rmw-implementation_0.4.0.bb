# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw_implementation/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "b8297ca3e83ba107d3ccdbe0064dd5a0"
SRC_URI[sha256sum] = "b19b4edba2c3510b1cd9a65104adc6a7281faf92613babcef09edfd3d12f4bae"

S = "${WORKDIR}/rmw_implementation-${PV}"

DEPENDS += "rmw rmw-fastrtps"

inherit ament

FILES_${PN} += "/opt/ros2/"
