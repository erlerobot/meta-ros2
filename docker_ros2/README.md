Building the Docker image
-------------------------

    $ docker build .

Running the Docker image
------------------------
Type the following command to instantiate a clean development environment for the Yocto Project:

    $ docker run -ti ea2400e95d98

Optionally, you may use the `--volume=[host-src:]container-dest` option to share a directory between the host and the container, as in the following example

    $ docker run -it -v ${PWD}/shared:/home/build/shared ea2400e95d98

Please refer to https://docs.docker.com/engine/reference/run/#volume-shared-filesystems for details

Congratulations! You can now execute the Yocto Project tools to create your own embedded Linux distribution.



