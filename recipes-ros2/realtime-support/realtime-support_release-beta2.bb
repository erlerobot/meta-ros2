# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"

SRC_URI = "https://github.com/ros2/realtime_support/archive/${PV}.tar.gz";downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "bc56a0ae85948a6c81310c7116ba8d73"
SRC_URI[sha256sum] = "2563a6da5da8f6ca9d7b1cc0263b80e4a4257aed6d49e994157287139af31fb8"

DEPENDS += "tlsf rosidl-typesupport"

S = "${WORKDIR}/realtime_support-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
