# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/eProsima/Fast-RTPS/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "ee9a9a456a7675bc84ac10ed582a7af9"
SRC_URI[sha256sum] = "3d5c365f9d2a8bcdbc1cc1e751e858b57ddf431cd4b10fab8a47a1e245cc9a0e"

# NOTE: unable to map the following CMake package dependencies: Doxygen
DEPENDS = "asio tinyxml2 openssl Fast-CDR"

inherit ament
