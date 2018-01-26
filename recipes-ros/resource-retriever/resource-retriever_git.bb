# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"

SRC_URI = "git://github.com/ros/resource_retriever.git;protocol=https;branch=ardent"
SRCREV = "04a2512ec4b583fb8a1eb4aa8f543e8a451c5e2d"

S = "${WORKDIR}/git"

DEPENDS += "ament-index curl"

inherit ament
