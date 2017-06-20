# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw_connext/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "7b276696389b868ad492d291475fba69"
SRC_URI[sha256sum] = "1cc72ced75026b8fa48ed5667ecdf71aa50c35512ceab7fe98640bd56bd403fe"

S = "${WORKDIR}/ament_cmake-${PV}"

DEPENDS += "rmw"

inherit ament

FILES_${PN} += "/opt/ros2/"
