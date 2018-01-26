# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "rosidl"

SRC_URI = "https://github.com/ros2/system_tests/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "75164aab68cad865e4922d3b9bacc12b"
SRC_URI[sha256sum] = "f7fb926ec015bf6796c7b95dfebe4f0aa683a3922b7beaa482471f2be7203ee5"

S = "${WORKDIR}/system_tests-${PV}"

# NOTE: no Makefile found, unable to determine what needs to be done

inherit ament

FILES_${PN} += "/opt/ros2/"
