# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://tf2_eigen/package.xml;md5=b834101360f0ce5f572a482094d588df"

DEPENDS += "rosidl rosidl-typesupport"

SRC_URI = "git://github.com/ros/geometry2.git;nobranch=1;protocol=https"
SRCREV = "3a820ee7238e406282c901991186adc6558cdb5e"

S = "${WORKDIR}/git"

inherit ament
