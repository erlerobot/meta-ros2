#!/bin/bash
# meta-ros2
# Copyright (C) 2017 Asier Bilbao. Erle Robotics.
#
# This program is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program.  If not, see <http://www.gnu.org/licenses/>.

su build <<EOF
cd /home/build
git clone git://git.yoctoproject.org/poky
cd poky && git checkout krogoth && cd ..
git clone https://github.com/Xilinx/meta-xilinx
cd meta-xilinx && git checkout krogoth && cd ..
git clone https://github.com/openembedded/meta-openembedded.git
cd meta-openembedded/ && git checkout krogoth && cd ..
git clone https://github.com/jlamperez/meta-zynqberry.git
cd meta-zynqberry && git checkout krogoth && cd ..
git clone https://github.com/jlamperez/meta-zynqberry-pxfmini
#git clone https://github.com/bmwcarit/meta-ros

. /home/build/poky/oe-init-build-env /home/build/poky/build
EOF
ln -fs /usr/bin/pkg-config /usr/bin/arm-poky-linux-gnueabi-pkg-config
pip install future
