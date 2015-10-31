SUMMARY = "Gstreamer1.0 for Jetson TK1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PR = "r0"

inherit packagegroup

RDEPENDS_${PN} = " \
	gstreamer1.0 \
	gstreamer1.0-libav \
	gstreamer1.0-plugins-base-meta \
	gstreamer1.0-plugins-good-meta \
	gstreamer1.0-plugins-bad-meta \
	gstreamer1.0-plugins-ugly-meta \
"
