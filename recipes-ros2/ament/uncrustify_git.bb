# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = "ament-tools ament-cmake"

SRC_URI = "git://github.com/ament/uncrustify.git;protocol=https"
SRCREV = "fa113849909daf314d0dd47256131e0a1eb032b4"

S = "${WORKDIR}/git"

inherit ament
