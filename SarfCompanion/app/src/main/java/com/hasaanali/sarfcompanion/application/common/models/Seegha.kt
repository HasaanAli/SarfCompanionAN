package com.hasaanali.sarfcompanion.application.common.models


enum class Seegha(val rawValue: String) {
    wahidMuzakarGhaib("واحد مزکر غائب"),
    tasniaMuzakarGhaib("تثنیہ مزکر غائب"),
    jamaMuzakarGhaib("جمع مزکر غائب"),
    wahidMoanisGhaib("واحد موئث غائب"),
    tasniaMoanisGhaib("تثنیہ موئث غائب"),
    jamaMoanisGhaib("جمع موئث غائب"),
    wahidMuzakarHaazir("واحد مزکر حاضر"),
    tasniaMuzakarHaazir("تثنیہ مزکر حاضر"),
    jamaMuzakarHaazir("جمع مزکر حاضر"),
    wahidMoanisHaazir("واحد موئث حاضر"),
    tasniaMoanisHaazir("تثنیہ موئث حاضر"),
    jamaMoanisHaazir("جمع موئث حاضر"),
    wahidMutakalim("واحد متکلم"),
    jamaMutakalim("جمع متکلم");

    val description: String get() { return rawValue }

    companion object {
        val forteenSeeghas:Array<Seegha> = arrayOf(wahidMuzakarGhaib, tasniaMuzakarGhaib, jamaMuzakarGhaib,
        wahidMoanisGhaib, tasniaMoanisGhaib, jamaMoanisGhaib,
        wahidMuzakarHaazir, tasniaMuzakarHaazir, jamaMuzakarHaazir,
        wahidMoanisHaazir, tasniaMoanisHaazir, jamaMoanisHaazir,
        wahidMutakalim, jamaMutakalim)
    }
}
