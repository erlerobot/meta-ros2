# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/eProsima/Fast-CDR/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "5d1bdfde0a80f7fa9e6d2b43a45dd423"
SRC_URI[sha256sum] = "ce9ee04a7b242721df3a0af98e6ae4f8afe9d536e7d59405322e03a6d251d471"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

FILES_${PN} += "${libdir}/* ${sharedir}/*"

FILES_SOLIBSDEV=""

