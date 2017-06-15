# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rosidl/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "38bec990450cdbaacdaea6527665c6c8"
SRC_URI[sha256sum] = "74863b24415b1deb0cc79992b6c015b153a9f2c33fb989757fcdcde87b6dec6d"

S = "${WORKDIR}/rosidl-${PV}"

inherit ament
