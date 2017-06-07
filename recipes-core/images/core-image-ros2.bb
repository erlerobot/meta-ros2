iSUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"

IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"

IMAGE_INSTALL += " device-tree  \
                  i2c-tools \
                  python-future \
                  python-pip \
                  git \
                  git-perltools \
                  iw \
                  wireless-tools \
                  wpa-supplicant \
                  wpa-supplicant-passphrase \
                  wpa-supplicant-cli \
                  hostapd \
                  rtl8812au \
                  busybox-udhcpd \
		  python3 \
		  nano \
		  ros2 \
		  python3-argparse \
		  python3-pip \
		  python3-setuptools \
		  "

IMAGE_FEATURES += " dev-pkgs \
                   debug-tweaks \
                   ssh-server-openssh \
                   package-management"



#                  ardupilot \
#                  ardupilot-examples \
#

#                  Fast-RTPS \
#                  ament-cmake \
#                  ament-tools \
#                  osrf-pycommon \
#
