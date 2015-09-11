SUMMARY = "Qt5 for Jetson TK1 with X11"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PR = "r0"

inherit packagegroup

RDEPENDS_${PN} = " \
       dbus \
       qtsvg \
       qtsvg-plugins \
       qtbase \
       qtbase-fonts \
       qtbase-tools \
       qtbase-plugins \
       qt3d \
       qtimageformats \
       qtimageformats-plugins \
       qtmultimedia \
       qtmultimedia-plugins \
       qtmultimedia-qmlplugins \
"
