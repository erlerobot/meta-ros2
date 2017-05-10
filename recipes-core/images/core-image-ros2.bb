DESCRIPTION = "A small image just capable of starting ROS 2."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = ""

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"

#IMAGE_INSTALL += "roslaunch"
