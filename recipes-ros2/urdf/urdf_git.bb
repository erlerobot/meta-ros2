# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"

# We need to compile urdf and urdfdom at the same time

SRC_URI = "git://github.com/ros2/urdf.git;protocol=https;branch=ros2;name=urdf;destsuffix=git/urdf \
  git://github.com/ros2/urdfdom.git;protocol=https;branch=ros2;name=urdfdom;destsuffix=git/urdfdom"

SRCREV_urdf = "ca152d3ccdb1847a909662a544279e959ad599a3"
SRCREV_urdfdom = "0282a875e4611a97349c9a51039e1e04cf092022"

S = "${WORKDIR}/git"

DEPENDS += "rmw urdfdom-headers libtinyxml tinyxml-vendor tinyxml2-vendor"

inherit ament

FILES_${PN} += "/opt/ros2/"
