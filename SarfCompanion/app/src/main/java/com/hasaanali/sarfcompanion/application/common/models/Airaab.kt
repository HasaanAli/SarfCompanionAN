package com.hasaanali.sarfcompanion.application.common.models

enum class Airaab {
    //MARK:- Bottom airaab
    kasra, twoKasra, tashdeedKasra,
    fatha, twoFatha, zama, twoZama, jazm, tashdeedFatha; // TODO: add more

    val nextBottomAiraab: Airaab
    get() {
        return when (this) {
            kasra -> twoKasra
            twoKasra -> tashdeedKasra
            tashdeedKasra -> kasra
            else -> Airaab.defaultBottomAiraab
        }
    }

    val nextTopAiraab: Airaab
    get() {
        return when (this) {
            fatha -> twoFatha
            twoFatha -> zama
            zama -> twoZama
            twoZama -> jazm
            jazm -> tashdeedFatha
            tashdeedFatha -> fatha
            else -> defaultTopAiraab
        }
    }

    companion object {
        val defaultTopAiraab = fatha
        val defaultBottomAiraab = kasra
    }

    // Airaab character
    val airaabCharacters: String
        get() {
            return when (this) {
                fatha -> "َ"
                twoFatha -> "ً"
                zama -> "ُ"
                twoZama -> "ٌ"
                jazm -> "ْ"
                tashdeedFatha -> "َّ"
                kasra -> "ِ"
                twoKasra -> "ٍ"
                tashdeedKasra -> "ِّ"
            }
        }

    // TODO: is the name correct?
    val isTanveen: Boolean
        get() {
            return this == twoFatha || this == twoZama || this == twoKasra
        }

//    fatha, twoFatha, zama, twoZama, jazm, tashdeedFatha // TODO: add more

//    var nextTopAiraab: Airaab {
//        switch self {
//            case .fatha:    return .twoFatha
//            case .twoFatha: return .zama
//            case .zama:     return .twoZama
//            case .twoZama:  return .jazm
//            case .jazm:     return .tashdeedFatha
//            case .tashdeedFatha: return .fatha
//            default:        return Airaab.defaultTopAiraab
//        }
//    }




//    {
//        switch self {
//            case .kasra:    return .twoKasra
//            case .twoKasra: return .tashdeedKasra
//            case .tashdeedKasra: return .kasra
//            default:        return Airaab.defaultBottomAiraab
//        }
//    }

    //MARK:- Top airaab
//    fatha, twoFatha, zama, twoZama, jazm, tashdeedFatha // TODO: add more

//    var nextTopAiraab: Airaab {
//        switch self {
//            case .fatha:    return .twoFatha
//            case .twoFatha: return .zama
//            case .zama:     return .twoZama
//            case .twoZama:  return .jazm
//            case .jazm:     return .tashdeedFatha
//            case .tashdeedFatha: return .fatha
//            default:        return Airaab.defaultTopAiraab
//        }
//    }
////
}