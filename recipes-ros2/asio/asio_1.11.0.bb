# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; if that is correct you should separate
# these in the LICENSE value using & if the multiple licenses all apply, or | if there
# is a choice between the multiple licenses. If in doubt, check the accompanying
# documentation to determine which situation is applicable.
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE_1_0.txt;md5=e4224ccaecb14d942c71d31bef20d78c \
                    file://COPYING;md5=473185767da32bfe1c75719e82dbd850"

SRC_URI = "https://erlerobotics.com/test/asio-${PV}.tar.gz";downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "944b98542af0535374a014756a2e9702"
SRC_URI[sha256sum] = "2c5cb3c53a32d6568716aca5c3298e3b0abfe8faae71ee8bb38b65e93bb0aa6a"
S = "${WORKDIR}/asio-${PV}"


DEPENDS = "boost"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
#EXTRA_OECONF = " -DASIO_STANDALONE "

PARALLEL_MAKE="-j 1"

# EXTRA_OEMAKE += " -lboost_system"

# TARGET_CFLAGS += " -lboost_system -lboost_thread "
# TARGET_CXXFLAFS +="-std=c++11"
