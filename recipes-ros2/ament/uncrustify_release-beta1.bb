# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = "ament-tools"

SRC_URI = "https://github.com/ament/uncrustify/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "eafd6a5039f02219a29dfb8bdd82b325"
SRC_URI[sha256sum] = "63147b293e9ac2d367fc4461d5e4730cebb5acbee085140aeff580c748dac775"

S = "${WORKDIR}/uncrustify-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2"
