# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; if that is correct you should separate
# these in the LICENSE value using & if the multiple licenses all apply, or | if there
# is a choice between the multiple licenses. If in doubt, check the accompanying
# documentation to determine which situation is applicable.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   orocos_kdl/COPYING
#   orocos_kdl/debian/copyright
#
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://orocos_kdl/COPYING;md5=a8ffd58e6eb29a955738b8fcc9e9e8f2 \
                    file://orocos_kdl/debian/copyright;md5=4b446a49bb1cef5801a152ac8ee5d814"

SRC_URI = "git://github.com/ros2/orocos_kinematics_dynamics;protocol=https;branch=ros2 \
          file://0001_Find-Eigen-instead-of-Eigen3.patch"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "e93bffc0cb8616523259af533bd49597f2095081"

S = "${WORKDIR}/git"

inherit ament
#do_patch () {
#  #Remove opencv not working
#  rm -rf ${S}/src/ros2/demos/image_tools
#  rm -rf ${S}/src/ros2/demos/intra_process_demo
#}

FILES_${PN} += "/opt/ros2/"
