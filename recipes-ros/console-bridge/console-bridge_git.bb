# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "BDS"
LIC_FILES_CHKSUM = "file://src/console.cpp;md5=2391cb1aafb648f6fb0f7f0f7bcd03ee"

SRC_URI = "git://github.com/ros/console_bridge.git;protocol=https"
SRCREV = "148df7e841b91da488ec3bb4abd295a2bccdb728"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# Specify compilation commands here
	:
}

do_install () {
	# Specify install commands here
	:
}

