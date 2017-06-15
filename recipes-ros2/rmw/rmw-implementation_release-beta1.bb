# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rmw_implementation/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "3b11df6e84f9f47cf0e2faba72bb3ce6"
SRC_URI[sha256sum] = "b4ed47a327751dce0e061d033cc58762ab0b83d8e70ed609913d90eb87804da9"

S = "${WORKDIR}/rmw_implementation-${PV}"

DEPENDS += "rmw rmw-fastrtps"

inherit ament

FILES_${PN} += "/opt/ros2/"
