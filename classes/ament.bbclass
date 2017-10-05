ament_do_compile() {
  if [ ! -f ${ros2_dir}/setup.sh ]; then
    echo "File not found!"
    mkdir -p ${ros2_dir}
    touch ${ros2_dir}/setup.sh
  fi

  . ${ros2_dir}/setup.sh

  ament build . --install-space ${ros2_dir} --force-cmake-configure --cmake-args \
  -DCMAKE_LIBRARY_PATH=${STAGING_DIR_HOST}/usr/lib/ \
  -DCMAKE_INSTALL_INCLUDEDIR=${STAGING_DIR_HOST}/usr/include/ \
  -DCMAKE_LINKER=${STAGING_BINDIR_NATIVE}/arm-poky-linux-gnueabi/arm-poky-linux-gnueabi-ld.bfd \
  -DCMAKE_CROSSCOMPILING=1 -DCOMPILE_EXAMPLES=OFF \
  -DEIGEN3_INCLUDE_DIR=${BASE_WORKDIR}/${MULTIMACH_HOST_SYS}/libeigen/3.2.8-r0/image/usr/include/eigen3 \
  -DCMAKE_PREFIX_PATH=${STAGING_DIR_HOST} \
  -DPoco_LIBRARY_DIR=${STAGING_DIR_HOST}/usr/lib/ \
  -DPoco_INCLUDE_DIR=${STAGING_DIR_HOST}/usr/include/ \
  -Dfastcdr_LIBRARY_DIR=${STAGING_DIR_HOST}/usr/include/fastcdr/ \
  -DTINYXML2_SOURCE_DIR=${BASE_WORKDIR}/${MULTIMACH_HOST_SYS}/tinyxml2/4.0.1-r0/git \
  -DPYTHON_INCLUDE_DIR=${STAGING_DIR_HOST}/usr/include/python3.5m \
  -DPYTHON_LIBRARY=${STAGING_DIR_HOST}/usr/lib/libpython3.5m.so \
  -DEigen3_INCLUDE_DIR=${STAGING_DIR_HOST}/usr/include/eigen3/ \
  -DOpenCV_DIR=${STAGING_DIR_HOST}/usr/share/OpenCV/ \
  -D_GLIBCXX_USE_CXX11_ABI=0 \
  -Wno-dev 
}


ament_do_install () {
#	install -d ${D}/opt/ros2/
#	cp -r ${S}/install/* ${D}/opt/ros2/
  :
}
base_prefix = "${STAGING_DIR_NATIVE}"
ros2_dir = "${STAGING_DIR_HOST}/opt/ros2"

FILES_${PN} += "\
    ${ros2_dir} \
    "

EXPORT_FUNCTIONS do_compile do_install
ALLOW_EMPTY_${PN} = "1"
