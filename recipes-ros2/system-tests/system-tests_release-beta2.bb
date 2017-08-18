# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "rosidl"

SRC_URI = "https://github.com/ros2/system_tests/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "06d38aaa43099249f08ee72253e8bafe"
SRC_URI[sha256sum] = "b0d22704f60d7f94199fa29425e92fa0033f859cff0659e58bb129bbd99bfd0e"

S = "${WORKDIR}/system_tests-${PV}"

# NOTE: no Makefile found, unable to determine what needs to be done

inherit ament

FILES_${PN} += "/opt/ros2/"
