# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "rosidl poco-vendor"

SRC_URI = "https://github.com/ros2/rosidl_typesupport/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "fe02385d455ece353e6312b41e816390"
SRC_URI[sha256sum] = "6cc5b5027f74addebb88157e3c0b00e0b4bef9671e3b095b060f66084ad3bda3"

S = "${WORKDIR}/rosidl_typesupport-${PV}"

inherit ament
