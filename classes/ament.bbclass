ament_do_compile() {
  ament build .
}

ament_do_install () {
	install -d ${D}/opt/ros2/
	cp -r ${S}/install/* ${D}/opt/ros2/
}

EXPORT_FUNCTIONS do_compile do_install
