package com.hasaanali.sarfcompanion.application.common.models

data class Kalma(val huroof: Array<Harf>) {
//    val huroof: [Harf]
//
//    init(_ huroof: [Harf]) {
//        self.huroof = huroof
//    }

    val description: String
    get() {
//        return String(huroof.flatMap { return "\($0.0.rawValue)\($0.1 !=  nil ? $0.1!.description : "")" })
        return "TODO"
    }

    data class HarfPosition(val newHarf: Harf, val position: Int)

    fun replacing(vararg withHuroofAtIndices: HarfPosition): Kalma {
        val newHuroofAtIndices = withHuroofAtIndices
        var huroof = this.huroof
        for ((newHarf, position) in newHuroofAtIndices.asList()) {
        huroof[position] = newHarf
        }
        return Kalma(huroof)
    }

    fun appending(vararg additionalHuroof: Harf): Kalma {
        var newHuroof = this.huroof
        newHuroof += additionalHuroof
        print("after appending: $newHuroof")
//        newHuroof.append(contentsOf: additionalHuroof)
        return Kalma(newHuroof)
    }
}

/////Word
//struct Kalma: CustomStringConvertible {
//    let huroof: [Harf]
//
//    var description: String {
//        return String(huroof.flatMap({ $0.description + " "}))
//    }
//
//    init(_ huroof: [Harf]) {
//        self.huroof = huroof
//    }
//
//    init(huroof: [Harf]) {
//        self.huroof = huroof
//    }
//
//    /// A kalma is Ism(noun) if 1. it has tanveen, 2. starts with alif laam, or 3. ends with round taa.
//    var isIsm: Bool {
//        let hasTanveen = huroof.last?.airaab?.isTanveen ?? false
//        if hasTanveen {
//            return true
//        }
//
//        //let startsWithAlifLaam: Bool
//        if huroof.count > 2
//            && huroof[0].letter == .alif
//            && huroof[1].letter == .laam {
//            return true
//        }
//        let endsWithRoundTaa = huroof.last?.letter == .roundTaa
//        if endsWithRoundTaa {
//            return true
//        }
//
//        return false
//    }
//
//    ///Faa, ain, laam
//    var weight: WeightType? {
//        for weightType in WeightType.allCases {
//            if weightType.weight.matches(weightOf: self) {
//                return weightType
//            }
//        }
//        return nil
//    }
//
//    var isVerb: Bool {
//        return weight != nil // TODO
//    }


//    ///Baab with maximum match
//    var likelyBaab: Baab {
//        var scores = Array<Int>()
//        for baab in Baabs.all {
////            print("Baab: \(baab)")
//            scores.append(matchScore(with: baab.name))
////            print("Score: \(scores.last)")
//        }
//        // - - - - - - - - -  DEBUGGING
////        print(Baabs.all)
//        // - - - - - - - - -  DEBUGGING
//
//
//        let maxScore = scores.max(by: { $0 < $1 })
////        let maxScoreIndex = scores.inde
////        var maxScoreBaab: Baab //suppose
//        return Baabs.faAaLaYafAaLu
//    }

//    func matchScore(with kalma: Kalma) -> Int {
//        var score: Int = 0
//        print("Input: \(self)")
//        print("Match: \(kalma)")
//        for i in 0..<huroof.count {
//            if huroof[i].letter == kalma.huroof[i].letter {
//                score += 1
//            }
//            if let airaab = huroof[i].airaab, airaab == kalma.huroof[i].airaab {
//                score += 1
//            }
//        }
//        print("Score: \(score)")
//        return score
//    }
//}

enum class ArabicLetter(val character: String) {
    alif("ا"),
    ba("ب"),
    ///"ت"
    ta("ت"),
    ///"ث"
    thaa("ث"),
    jeem("ج"),
    ///"ح"
    Ha("ح"),
    kha("خ"),
    ///"د"
    daal("د"),
    ///"ذ"
    dhaal("ذ"),
    ra("ر"),
    ///"ز"
    za("ز"),
    seen("س"),
    sheen("ش"),
    ///"ص"
    Saad("ص"),
    ///"ض"
    Daad("ض"),
    ///"ط"
    Ta("ط"),
    ///Short: "Dh", Arabic: "ظ"
    Dha("ظ"),
    ///Short: "A", Arabic: "ع"
    ain("ع"),
    ghain("غ"),
    fa("ف"),
    qaaf("ق"),
    kaaf("ک"),
    laam("ل"),
    meem("م"),
    noon("ن"),
    ///"ہ"
    ha("ہ"),
    waaw("و"),
    roundTaa("ة"),
    ya("ی");

    val isFaAinLaam: Boolean
    get() {
        return this == fa || this == ain || this == laam
    }
}

