# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Ament is a build system for federated packages."
HOMEPAGE = "https://github.com/ament/ament_tools/wiki"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
# NOTE: License in setup.py/PKGINFO is: Apache License, Version 2.0
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rosidl_dds/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "238f12d2f8cb8623ce2884f80a974f71"
SRC_URI[sha256sum] = "2081e686e617ffa4dd72b2d6542a488538b3097642d6a947cc806690785c7347"

S = "${WORKDIR}/rosidl_dds-${PV}"

DEPENDS += "ament-package osrf-pycommon"

inherit ament

FILES_${PN} += "/opt/ros2/"
