# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "CLOSED"

SRC_URI = "https://github.com/ros2/realtime_support/archive/${PV}.tar.gz;downloadfilename=ros2_${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "028ed8da4b919414833b8781d75f141a"
SRC_URI[sha256sum] = "4c7a898b3c60f10ef698708c9b153ed395195c27bf75cfb7bab67de0a6c0aa0f"

DEPENDS += "tlsf rosidl-typesupport rclcpp"

S = "${WORKDIR}/realtime_support-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
