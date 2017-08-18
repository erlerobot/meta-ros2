# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://tlsf/LICENSE;md5=40d2542b8c43a3ec2b7f5da31a697b88"

SRC_URI = "https://github.com/ros2/tlsf/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "fbe4aa591c088f2966eee1c8287b9b04"
SRC_URI[sha256sum] = "0c264c77eb13fe4f7a6c550aa27552ebe2608866e2763d10596d63c41135a09f"

DEPENDS = "ament-cmake"

S = "${WORKDIR}/tlsf-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
