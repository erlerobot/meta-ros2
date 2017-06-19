#
# (C) 2017 Erle Robotics - Asier Bilbao <asier@erlerobotics.com>
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
ros2_dir = "/home/build/poky/build/tmp/sysroots/zynqberry/opt/ros2"

do_install () {
	mkdir -p ${D}/opt/ros2/
	cp -R ${ros2_dir}/* ${D}/opt/ros2/
}

FILES_${PN} += "/opt/ros2"
INSANE_SKIP_${PN} = "arch dev-so dev-deps staticdev ldflags rpaths compile-host-path compile-host-path"
INSANE_SKIP_${PN}-dev = "ldflags staticdev libdir dev-elf ldflags rpaths compile-host-path"
