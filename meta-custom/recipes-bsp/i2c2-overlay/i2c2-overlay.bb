DESCRIPTION = "Enable I2C2 on BeagleBone and install i2c-tools"
LICENSE = "CLOSED"

inherit allarch

SRC_URI = "file://i2c2-enable.dts"

do_compile() {
    dtc -O dtb -o ${WORKDIR}/i2c2-enable.dtbo ${WORKDIR}/i2c2-enable.dts
}

do_install() {
    install -d ${D}${nonarch_base_libdir}/device-tree-overlays
    install -m 0644 ${WORKDIR}/i2c2-enable.dtbo ${D}${nonarch_base_libdir}/device-tree-overlays/
}

