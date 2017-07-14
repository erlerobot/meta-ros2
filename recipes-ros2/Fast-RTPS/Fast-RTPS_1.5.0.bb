# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/eProsima/Fast-RTPS/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "98a6a705355b9c67e97562d04a1efa87"
SRC_URI[sha256sum] = "a46dbf3eeb3085e1d77f18e129f45c96fb21185f83b6df0908096f757460edef"

# NOTE: unable to map the following CMake package dependencies: Doxygen
DEPENDS = "asio tinyxml2 openssl Fast-CDR"

inherit ament
