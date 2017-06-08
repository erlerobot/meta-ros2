ament_do_compile() {
  ament build . --cmake-args \
  -DCMAKE_LIBRARY_PATH=/home/build/poky/build/tmp/sysroots/zynqberry/usr/lib/ \
  -DCMAKE_INSTALL_INCLUDEDIR=/home/build/poky/build/tmp/sysroots/zynqberry/usr/include/ \
  -DCMAKE_LINKER=/home/build/poky/build/tmp/sysroots/x86_64-linux/usr/bin/arm-poky-linux-gnueabi/arm-poky-linux-gnueabi-ld.bfd \
  -DCMAKE_CROSSCOMPILING=1 -DCOMPILE_EXAMPLES=OFF \
  -DEIGEN3_INCLUDE_DIR=/home/build/poky/build/tmp/work/cortexa9hf-neon-poky-linux-gnueabi/libeigen/3.2.8-r0/image/usr/include/eigen3
}

ament_do_install () {
	install -d ${D}/opt/ros2/
	cp -r ${S}/install/* ${D}/opt/ros2/
}

EXPORT_FUNCTIONS do_compile do_install
