HOMEPAGE = "https://github.com/Nuvoton-Israel/u-boot"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

UBRANCH = "npcm7xx-v2019.01"
SRC_URI = "git://github.com/Nuvoton-Israel/u-boot.git;branch=${UBRANCH}"
SRCREV = "0a3c508dffafa79d0097b38f9ea928d59b58a9cc"

S = "${WORKDIR}/git"

PV .= "+${UBRANCH}+"
