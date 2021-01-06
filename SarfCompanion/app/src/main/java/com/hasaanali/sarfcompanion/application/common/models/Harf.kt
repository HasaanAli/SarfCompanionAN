package com.hasaanali.sarfcompanion.application.common.models

/// An arabic letter along with its airaab(e.g. harkat).
data class Harf(val arabicLetter: ArabicLetter, val airaab: Airaab?)

///// An arabic letter along with its airaab(e.g. harkat).
//struct Harf: Equatable, CustomStringConvertible {
//    let letter: ArabicLetter
//    let airaab: Airaab?
//
//    var description: String {
//        return "\(letter.rawValue)\(airaab !=  nil ? airaab!.description : "")"
//    }
//
//    init(_ letter: ArabicLetter, _ airaab: Airaab?) {
//        self.letter = letter
//        self.airaab = airaab
//    }
//
//    func settingNextTopAiraab() -> Harf {
//        return Harf(letter: letter, airaab: airaab?.nextTopAiraab ?? Airaab.defaultTopAiraab)
//    }
//
//    func settingNextBottomAiraab() -> Harf {
//        return Harf(letter: letter, airaab: airaab?.nextBottomAiraab ?? Airaab.defaultBottomAiraab)
//    }
//}
