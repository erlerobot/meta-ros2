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
SRC_URI[md5sum] = "1c8233b633dee9bf72a5da8ef8871f45"
SRC_URI[sha256sum] = "7ba3029f9817f38521534372bd71df21b4ccc9af07fe02c02d8734e80e9228af"

S = "${WORKDIR}/ament_tools-${PV}"

inherit setuptools

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS_${PN} += "python-ament-package python-osrf_pycommon"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python-argparse python-core python-distutils python-json python-lang python-misc python-multiprocessing python-nose python-re python-shell python-subprocess python-threading python-xml"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    ament_copyright.main
#    ament_package
#    ament_package.dependency
#    ament_package.export
#    ament_package.package
#    ament_package.templates
#    ament_pep257.main
#    ament_pep8.main
#    ament_pyflakes.main
#    concurrent.futures
#    osrf_pycommon.cli_utils.verb_pattern
#    osrf_pycommon.process_utils
#    pkg_resources
#    setuptools


inherit ament

FILES_${PN} += "/opt/ros2/"
