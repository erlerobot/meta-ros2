# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/realtime_support/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "17c6ea09d7d398c94406c3607ec59afa"
SRC_URI[sha256sum] = "564f8c64db51716a517a1f4ee65a4702a659004403055c4980737c7369feaac9"

DEPENDS += "tlsf"

S = "${WORKDIR}/realtime_support-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
