# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/demos/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "e116fbd96dfde92e6964fcc2b339f81f"
SRC_URI[sha256sum] = "14cbe2df16ac9b237504ec6f632ea9466e2dfee077ea350e79582a4ed3786b07"

DEPENDS = "ament-tools rclcpp class-loader opencv example-interface"

S = "${WORKDIR}/demos-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
