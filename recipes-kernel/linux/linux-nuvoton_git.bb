KBRANCH ?= "Poleg-5.4-OpenBMC"
LINUX_VERSION ?= "5.4.80"

SRCREV="df5ec3157d3b7369d2f1e1a4af38c2309460d7e3"

require linux-nuvoton.inc
SRC_URI_append_nuvoton = " file://0004-driver-ncsi-replace-del-timer-sync.patch"
