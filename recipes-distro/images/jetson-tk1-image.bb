DESCRIPTION = "Jetson TK1 exsmple distro image"

inherit core-image

IMAGE_FEATURES += "splash package-management x11-base"
IMAGE_INSTALL+=	"jwm jwm-session jwm-defaultconf udev-extraconf \
				 packagegroup-qt5 \
				 packagegroup-gst-1.0 \
				 mpv jack2conf \
				 opencv4tegra \
				"


LICENSE = "MIT"

