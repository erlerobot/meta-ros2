# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://github.com/ros2/tlsf/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "6b6a9824733e373271bf3d055eaf3329"
SRC_URI[sha256sum] = "42ae93fa6fe64a0b92c76cde77b83223fe984dc99bf661ec1f4cb4dde4b706f7"

S = "${WORKDIR}/tlsf-${PV}"

inherit ament

FILES_${PN} += "/opt/ros2/"
