# set up Yocto
## Prepare Host Environment
On your Ubuntu 22.04 LTS (recommended):

$ sudo apt-get update
$ sudo apt-get install -y gawk wget git diffstat unzip texinfo gcc-multilib \
$      build-essential chrpath socat cpio python3 python3-pip python3-pexpect \
$      xz-utils debianutils iputils-ping

## Get Yocto and Layers
### Create a working directory:
$ mkdir ~/yocto-bbb && cd ~/yocto-bbb

### Clone Yocto Scarthgap release:
$ git clone -b scarthgap git://git.yoctoproject.org/poky.git