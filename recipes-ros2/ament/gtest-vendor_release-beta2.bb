# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cbbd27594afd089daa160d3a16dd515a"

SRC_URI = "https://github.com/ament/gtest_vendor/archive/${PV}.tar.gz";downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "45de6decc3e7823607db7d5a083ac967"
SRC_URI[sha256sum] = "274c90d6c65bbbeff3f57dfbb007afad688ed21927c08ad2f83177ceeddae4b3"

S = "${WORKDIR}/gtest_vendor-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
