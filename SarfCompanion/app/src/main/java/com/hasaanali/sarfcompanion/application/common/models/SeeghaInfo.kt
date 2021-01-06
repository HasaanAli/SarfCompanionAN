package com.hasaanali.sarfcompanion.application.common.models

data class SeeghaInfo(
    val seegha: Seegha,
    val gardaanType: GardaanType,
    val shashAqsaam: ShashAqsaam,
    val haftAqsaam: HaftAqsaam,
    val baab: BaabProtocol) {

    val description: String
    get() {
        return """
        \(seegha), \(gardaanType)
        """
    }

//    init(_ seegha: Seegha, _ gardaan: GardaanType, _ shashAqsaam: ShashAqsaam, _ haftAqsaam: HaftAqsaam, _ baab: BaabProtocol) {
//        self.seegha = seegha
//        self.gardaanType = gardaan
//        self.shashAqsaam = shashAqsaam
//        self.haftAqsaam = haftAqsaam
//        self.baab = baab
//    }

    fun changing(seegha: Seegha): SeeghaInfo {
        return SeeghaInfo(seegha, gardaanType, shashAqsaam, haftAqsaam, baab)
    }

    fun array(seeghas: Array<Seegha>): Array<SeeghaInfo> {
        var seeghasInfos = [SeeghaInfo]()
        seeghas.forEach { seeghasInfos.append(SeeghaInfo($0, gardaanType, shashAqsaam, haftAqsaam, baab)) }
        return seeghasInfos
    }
}
