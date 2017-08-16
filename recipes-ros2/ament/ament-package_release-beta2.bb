# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ament/ament_package/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "9a9ed4a41c73abf9ea50417b539c35cc"
SRC_URI[sha256sum] = "f3bc857f8bf3ca44cd83d69271fb027688df4a3f3e757fd87800fba5b582b5fd"

S = "${WORKDIR}/ament_package-${PV}"
inherit ament
