# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
inherit setuptools

LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c4db32a2fa8717faffa1d4f10136f47"

HOMEPAGE = "http://osrf-pycommon.readthedocs.org/"
SUMMARY = "Commonly needed Python modules, used by Python software developed at OSRF"

SRC_URI = "git://github.com/osrf/osrf_pycommon;protocol=https"
SRCREV = "8aaf12c5538ddc1aa5a6eba912c518e4e68f717f"

S = "${WORKDIR}/git"

inherit ament
