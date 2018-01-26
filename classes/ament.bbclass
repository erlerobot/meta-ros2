ament_do_compile() {

  if [ ! -f ${ROS2_DIR}/setup.sh ]; then
    echo "File not found!"
    mkdir -p ${ROS2_DIR}
    touch ${ROS2_DIR}/setup.sh
  fi

  #Change for your target machine name:
  export SOABI=cpython-35m-${TUNE_FEATURES}-${TARGET_OS}-gnu
  . ${ROS2_DIR}/setup.sh
  export CMAKE_COMMAND=${BASE_WORKDIR}/x86_64-linux/cmake-native/3.9.5-r0/build/bin/cmake
  /usr/local/bin/ament build . --install-space ${ROS2_DIR} --force-cmake-configure --cmake-args \
  -DCMAKE_LIBRARY_PATH=${STAGING_DIR_HOST}/usr/lib/ \
  -DCMAKE_INSTALL_INCLUDEDIR=${STAGING_DIR_HOST}/usr/include/ \
  -DCMAKE_LINKER=${STAGING_BINDIR_NATIVE}/${TARGET_SYS}/${TARGET_SYS}-ld.bfd \
  -DCMAKE_CROSSCOMPILING=1 -DCOMPILE_EXAMPLES=OFF \
  -DEIGEN3_INCLUDE_DIR=${BASE_WORKDIR}/${HOST_SYS}/libeigen/3.3.4-r0/image/usr/include/eigen3 \
  -DCMAKE_PREFIX_PATH=${STAGING_DIR_HOST} \
  -DPoco_LIBRARY_DIR=${BASE_WORKDIR}/${TARGET_SYS}/poco/1.8.0.1-r0/image/usr/lib/ \
  -DPoco_INCLUDE_DIR=${BASE_WORKDIR}/${TARGET_SYS}/poco/1.8.0.1-r0/image/usr/include/ \
  -DPoco_DIR=${BASE_WORKDIR}/${TARGET_SYS}/poco/1.8.0.1-r0/image/usr/lib/cmake/Poco/ \
  -DPoco_LIBRARIES=${BASE_WORKDIR}/${TARGET_SYS}/poco/1.8.0.1-r0/image/usr/lib/libPocoFoundation.so.50 \
  -Dfastcdr_LIBRARY_DIR=${STAGING_DIR_HOST}/usr/include/fastcdr/ \
  -DTINYXML2_SOURCE_DIR=${BASE_WORKDIR}/${TARGET_SYS}/tinyxml2/4.0.1-r0/git \
  -DTINYXML2_LIBRARY=${BASE_WORKDIR}/${TARGET_SYS}/tinyxml2/4.0.1-r0/git/build/tinyxml2/libtinyxml2.so \
  -DPYTHON_INCLUDE_DIR=${STAGING_DIR_HOST}/usr/include/python3.5m \
  -DPYTHON_LIBRARY=${STAGING_DIR_HOST}/usr/lib/libpython3.5m.so \
  -DPYTHON_SOABI=$SOABI \
  -DEigen3_INCLUDE_DIR=${STAGING_DIR_HOST}/usr/include/eigen3/ \
  -DOpenCV_DIR=${STAGING_DIR_HOST}/usr/share/OpenCV/ \
  -Durdf_DIR=${BASE_WORKDIR}/${TARGET_SYS}/urdf/git-r0/ \
  -D_GLIBCXX_USE_CXX11_ABI=0 \
  -DTHIRDPARTY=OFF \
  -Wno-dev
}


ament_do_install () {
#	install -d ${D}/opt/ros2/
#	cp -r ${S}/install/* ${D}/opt/ros2/
  :
}
base_prefix = "${STAGING_DIR_NATIVE}"


FILES_${PN} += "\
    ${ROS2_DIR} \
    "

EXPORT_FUNCTIONS do_compile do_install
ALLOW_EMPTY_${PN} = "1"
