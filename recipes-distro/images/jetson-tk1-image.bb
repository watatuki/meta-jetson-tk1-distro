DESCRIPTION = "Jetson TK1 exsmple distro image"

inherit core-image

IMAGE_FEATURES += "splash package-management x11-base"
IMAGE_INSTALL += "jwm jwm-session jwm-defaultconf udev-extraconf"

LICENSE = "MIT"

