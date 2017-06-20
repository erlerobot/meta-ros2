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

SRC_URI = "https://github.com/ros2/rosidl_dds/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "34459d4639e1706f836253902e5f5285"
SRC_URI[sha256sum] = "d3152ca4a088ff3490437d74c580df6adc55caadc49b5673b2c75a67f12a196d"

S = "${WORKDIR}/ament_tools-${PV}"

DEPENDS += "ament-package osrf-pycommon"

inherit ament

FILES_${PN} += "/opt/ros2/"
