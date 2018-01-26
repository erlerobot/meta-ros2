# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "tinyxml2 libtinyxml2 asio"

SRC_URI = "git://github.com/eProsima/Fast-RTPS.git;protocol=https"
SRCREV = "1f135d478dd9dcde98ed96c9aeef4f229e3a1450"

S = "${WORKDIR}/git"

inherit ament
