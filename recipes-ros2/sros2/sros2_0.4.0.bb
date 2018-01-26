# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://github.com/ros2/sros2/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "c83bdc07cc40ed497e73286916c4d23d"
SRC_URI[sha256sum] = "940de437c519f5861ad29e360c5fae8fca015faa5895983172f092540c934c99"

S = "${WORKDIR}/sros2-${PV}"

DEPENDS += "openssl rmw"

inherit ament

FILES_${PN} += "/opt/ros2/"
