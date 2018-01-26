# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/rosidl_typesupport/archive/${PV}.tar.gz \
          file://0001.Fix_poco_find_package.patch \
          file://0002.Fix_poco_find_package.patch"
SRC_URI[md5sum] = "719b25017b9942a6f87cc1648d6cb321"
SRC_URI[sha256sum] = "57006c054b327c26400aad800cd6961384e5acf4a3e5616df1d541f5018b4b80"

DEPENDS = "poco poco-vendor rosidl"

S = "${WORKDIR}/rosidl_typesupport-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
