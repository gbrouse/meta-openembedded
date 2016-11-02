SUMMARY = "Library for interfacing with IIO devices"
HOMEPAGE = "https://wiki.analog.com/resources/tools-software/linux-software/libiio"
SECTION = "libs"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=7c13b3376cea0ce68d2d2da0a1b3a72c"

SRC_URI = "https://github.com/analogdevicesinc/${PN}/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "fbd6faa9c420659023072eb3c74ed037"
SRC_URI[sha256sum] = "b230cfd5ef5550cebf485950d8b1f4d5cfa7d5f0814aeb7b44e530e9caecb83a"

DEPENDS = "avahi libxml2"

inherit cmake pythonnative

PACKAGES =+ "${PN}-iiod ${PN}-tests ${PN}-python"

RDEPENDS_${PN}-python = "${PN} python-ctypes python-stringold"

FILES_${PN}-iiod = "${sbindir}/iiod"
FILES_${PN}-tests = "${bindir}"
FILES_${PN}-python = "${PYTHON_SITEPACKAGES_DIR}"
