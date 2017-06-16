# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rosidl_typesupport/archive/${PV}.tar.gz \
          file://0001.Fix_poco_find_package.patch"
SRC_URI[md5sum] = "fe02932ea86fda6c5d895ee14d33c6c0"
SRC_URI[sha256sum] = "15cb7023388f78ebe8d1681f07aaddf5ff867c498ee87acfb2be644b8053de26"

DEPENDS = "poco"

S = "${WORKDIR}/rosidl_typesupport-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
