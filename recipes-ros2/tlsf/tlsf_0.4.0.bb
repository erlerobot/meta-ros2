# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://tlsf/LICENSE;md5=40d2542b8c43a3ec2b7f5da31a697b88"

SRC_URI = "https://github.com/ros2/tlsf/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "adfc1023a2dc4e4eaef05f69a9f73df9"
SRC_URI[sha256sum] = "60d31d14c6fab5eaee8d8ddde8f8b1ac7cc2567710d26cb257cb0bc0f3412416"

DEPENDS = "ament-cmake"

S = "${WORKDIR}/tlsf-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
