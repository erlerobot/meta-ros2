# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ament/ament_tools/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "89421dbd96e52e28682c3064c47818ed"
SRC_URI[sha256sum] = "bfaae07d796b82b62351202cec3c1e871809d5abae0997ac45fc03b27240f799"

DEPENDS += "osrf-pycommon ament-package"

inherit ament

S = "${WORKDIR}/ament_tools-${PV}"

#do_compile () {
#	python3 setup.py build
#	:
#}

#do_install () {
#	sudo python3 setup.py install
#}

#FILES_${PN} += "/opt/ros2/src/ament/ament_tools"

#BBCLASSEXTEND = "native"
