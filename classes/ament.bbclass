ament_do_compile() {
  . ${ros2_dir}/local_setup.sh
  ament build . --install-space ${ros2_dir} --cmake-args \
  -DCMAKE_LIBRARY_PATH=/home/build/poky/build/tmp/sysroots/zynqberry/usr/lib/ \
  -DCMAKE_INSTALL_INCLUDEDIR=/home/build/poky/build/tmp/sysroots/zynqberry/usr/include/ \
  -DCMAKE_LINKER=/home/build/poky/build/tmp/sysroots/x86_64-linux/usr/bin/arm-poky-linux-gnueabi/arm-poky-linux-gnueabi-ld.bfd \
  -DCMAKE_CROSSCOMPILING=1 -DCOMPILE_EXAMPLES=OFF \
  -DEIGEN3_INCLUDE_DIR=/home/build/poky/build/tmp/work/cortexa9hf-neon-poky-linux-gnueabi/libeigen/3.2.8-r0/image/usr/include/eigen3 \
  -DCMAKE_PREFIX_PATH=${ros2_dir} \
  -DPoco_LIBRARY_DIR=/home/build/poky/build/tmp/sysroots/zynqberry/usr/lib/ \
  -Dfastcdr_LIBRARY_DIR=/home/build/poky/build/tmp/sysroots/zynqberry/usr/include/fastcdr/ \
  -DTINYXML2_SOURCE_DIR=/home/build/poky/build/tmp/work/cortexa9hf-neon-poky-linux-gnueabi/tinyxml2/4.0.1-r0/git \
  -DPYTHON_INCLUDE_DIR=/home/build/poky/build/tmp/sysroots/zynqberry/usr/include/python3.5m \
  -DPYTHON_LIBRARY=/home/build/poky/build/tmp/sysroots/zynqberry/usr/lib/libpython3.5m.so \
  -DPoco_INCLUDE_DIR=/home/build/poky/build/tmp/sysroots/zynqberry/opt/ros2/include/ \
  -D_GLIBCXX_USE_CXX11_ABI=0
}

### /home/build/poky/build/tmp/sysroots/zynqberry/usr/lib/libpcre.so

# fastcdr_DIR

#-DPYTHON_INCLUDE_DIRS=/home/build/poky/build/tmp/sysroots/zynqberry/usr/include/python3.5m
#-DPYTHON_LIBRARIES=/home/build/poky/build/tmp/sysroots/zynqberry/usr/lib/libpython3.5m.so
#

ament_do_install () {
#	install -d ${D}/opt/ros2/
#	cp -r ${S}/install/* ${D}/opt/ros2/
  :
}
base_prefix = "${STAGING_DIR_NATIVE}"
ros2_dir = "/home/build/poky/build/tmp/sysroots/zynqberry/opt/ros2"

FILES_${PN} += "\
    ${ros2_dir} \
    "

EXPORT_FUNCTIONS do_compile do_install
ALLOW_EMPTY_${PN} = "1" 
