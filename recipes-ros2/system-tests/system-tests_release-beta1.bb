# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/system_tests/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "8cc238014fdb6cbc26ac6bd7e3baa230"
SRC_URI[sha256sum] = "830532f15159cf488d94f66146511aab80ca44bebc5e30f817ef925690de1306"

S = "${WORKDIR}/system_tests-${PV}"

# NOTE: no Makefile found, unable to determine what needs to be done

inherit ament

FILES_${PN} += "/opt/ros2/"
