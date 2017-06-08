# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ament/ament_package/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "7fa6d042e07e044ec1f4f0fef5ab2169"
SRC_URI[sha256sum] = "04cd8189e45e431ad372a1b6520c76132eb54556c829e91d76976ee50ddd9a07"

S = "${WORKDIR}/ament_package-${PV}"

do_compile () {
        python3 setup.py build
}

do_install () {
        python3 setup.py build
}

FILES_${PN} += "/opt/ros2/"
