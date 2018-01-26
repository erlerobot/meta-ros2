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
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://orocos_kdl/COPYING;md5=a8ffd58e6eb29a955738b8fcc9e9e8f2 \
                    file://orocos_kdl/debian/copyright;md5=4b446a49bb1cef5801a152ac8ee5d814"

SRC_URI = "https://github.com/ros2/orocos_kinematics_dynamics/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz \
	file://0001_Find-Eigen-instead-of-Eigen3.patch"
SRC_URI[md5sum] = "7754c1af9f1e7444ee1437fdc72c7e2d"
SRC_URI[sha256sum] = "47d4422689c8e68b7714b342d7d0718f9ea1e88694ee167789924d30cf3a8fd3"

S = "${WORKDIR}/orocos_kinematics_dynamics-${PV}"


FILES_${PN} += "/opt/ros2/"

inherit ament
