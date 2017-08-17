# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cbbd27594afd089daa160d3a16dd515a"

SRC_URI = "https://github.com/ament/gmock_vendor/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "a74cf316bdbce1da714c025f71359b0d"
SRC_URI[sha256sum] = "4052fe71134610bcfd42641b3cba99b4190e0b69a12206af03fac384e6d9d657"

S = "${WORKDIR}/gmock_vendor-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2"
