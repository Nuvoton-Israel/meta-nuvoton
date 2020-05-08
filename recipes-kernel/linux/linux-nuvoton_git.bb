KBRANCH ?= "Poleg-5.4-OpenBMC"
LINUX_VERSION ?= "5.4.16"

SRCREV="2723271ca320dca425ff00ab8eb252d579a2c22b"

require linux-nuvoton.inc

SRC_URI_append_nuvoton = " file://0003-i2c-nuvoton-npcm750-runbmc-integrate-the-slave-mqueu.patch"
SRC_URI_append_nuvoton = " file://0004-driver-ncsi-replace-del-timer-sync.patch"
