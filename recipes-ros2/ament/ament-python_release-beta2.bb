# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.

LICENSE = "CLOSED"

SRC_URI = "https://github.com/ament/ament_python/archive/release-beta2.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "7277a73e99f4704ee2247d7159c00894"
SRC_URI[sha256sum] = "08a88f0dfbabeb7539f38fa26721e18ba638ac7c7a6e93c6ba98cc94e724dcc5"

inherit ament

S = "${WORKDIR}/ament_python-${PV}"

#do_compile () {
#	python3 setup.py build
#	:
#}

#do_install () {
#	sudo python3 setup.py install
#}

#FILES_${PN} += "/opt/ros2/src/ament/ament_tools"

#BBCLASSEXTEND = "native"
