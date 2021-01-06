package com.hasaanali.sarfcompanion.application.common.models

enum class GardaanType(val string: String) {
    maaziMutliqMusbatMaroof("ماضی مطلق مثبت معروف"),
    maaziMutliqManfiMaroof("ماضی مطلق منفی معروف"),
    maaziMutliqMusbatMajhool("ماضی مطلق مثبت مجہول"),
    maaziMutliqManfiMajhool("ماضی مطلق منفی مجہول"),

    maaziQareebMusbatMaroof("ماضی قریب مثبت معروف"),
    maaziQareebManfiMaroof("ماضی قریب منفی معروف"),
    maaziQareebMusbatMajhool("ماضی قریب مثبت مجہول"),
    maaziQareebManfiMajhool("ماضی قریب منفی مجہول"),

    maaziBaeedMusbatMaroof("ماضی بعید مثبت معروف"),
    maaziBaeedManfiMaroof("ماضی بعید منفی معروف"),
    maaziBaeedMusbatMajhool("ماضی بعید مثبت مجہول"),
    maaziBaeedManfiMajhool("ماضی بعید منفی مجہول"),

    maaziIhtimaaliMusbatMaroof("ماضی احتمالی مثبت معروف"),
    maaziIhtimaaliManfiMaroof("ماضی احتمالی منفی معروف"),
    maaziIhtimaaliMusbatMajhool("ماضی احتمالی مثبت مجہول"),
    maaziIhtimaaliManfiMajhool("ماضی احتمالی منفی مجہول"),

    maaziTamanaaiMusbatMaroof("ماضی تمنائی مثبت معروف"),
    maaziTamanaaiManfiMaroof("ماضی تمنائی منفی معروف"),
    maaziTamanaaiMusbatMajhool("ماضی تمنائی مثبت مجہول"),
    maaziTamanaaiManfiMajhool("ماضی تمنائی منفی مجہول"),

    maaziIstimraariMusbatMaroof("ماضی استمراری مثبت معروف"),
    maaziIstimraariManfiMaroof("ماضی استمراری منفی معروف"),
    maaziIstimraariMusbatMajhool("ماضی استمراری مثبت مجہول"),
    maaziIstimraariManfiMajhool("ماضی استمراری منفی مجہول"),

    mazaarayMusbatMaroof("مضارع مثبت معروف"),
    mazaarayManfiMaroof("مضارع منفی معروف"),
    mazaarayMusbatMajhool("مضارع مثبت مجہول"),
    mazaarayManfiMajhool("مضارع منفی مجہول")

    //TODO: add more
}
