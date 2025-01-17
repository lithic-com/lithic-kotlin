// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/**
 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special currencies like
 * `XXX`. Enumerants names are lowercase currency code e.g. `EUR`, `USD`.
 */
class Currency
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val AED = of("AED")

        val AFN = of("AFN")

        val ALL = of("ALL")

        val AMD = of("AMD")

        val ANG = of("ANG")

        val AOA = of("AOA")

        val ARS = of("ARS")

        val AUD = of("AUD")

        val AWG = of("AWG")

        val AZN = of("AZN")

        val BAM = of("BAM")

        val BBD = of("BBD")

        val BDT = of("BDT")

        val BGN = of("BGN")

        val BHD = of("BHD")

        val BIF = of("BIF")

        val BMD = of("BMD")

        val BND = of("BND")

        val BOB = of("BOB")

        val BOV = of("BOV")

        val BRL = of("BRL")

        val BSD = of("BSD")

        val BTN = of("BTN")

        val BWP = of("BWP")

        val BYN = of("BYN")

        val BZD = of("BZD")

        val CAD = of("CAD")

        val CDF = of("CDF")

        val CHE = of("CHE")

        val CHF = of("CHF")

        val CHW = of("CHW")

        val CLF = of("CLF")

        val CLP = of("CLP")

        val CNY = of("CNY")

        val COP = of("COP")

        val COU = of("COU")

        val CRC = of("CRC")

        val CUC = of("CUC")

        val CUP = of("CUP")

        val CVE = of("CVE")

        val CZK = of("CZK")

        val DJF = of("DJF")

        val DKK = of("DKK")

        val DOP = of("DOP")

        val DZD = of("DZD")

        val EGP = of("EGP")

        val ERN = of("ERN")

        val ETB = of("ETB")

        val EUR = of("EUR")

        val FJD = of("FJD")

        val FKP = of("FKP")

        val GBP = of("GBP")

        val GEL = of("GEL")

        val GHS = of("GHS")

        val GIP = of("GIP")

        val GMD = of("GMD")

        val GNF = of("GNF")

        val GTQ = of("GTQ")

        val GYD = of("GYD")

        val HKD = of("HKD")

        val HNL = of("HNL")

        val HRK = of("HRK")

        val HTG = of("HTG")

        val HUF = of("HUF")

        val IDR = of("IDR")

        val ILS = of("ILS")

        val INR = of("INR")

        val IQD = of("IQD")

        val IRR = of("IRR")

        val ISK = of("ISK")

        val JMD = of("JMD")

        val JOD = of("JOD")

        val JPY = of("JPY")

        val KES = of("KES")

        val KGS = of("KGS")

        val KHR = of("KHR")

        val KMF = of("KMF")

        val KPW = of("KPW")

        val KRW = of("KRW")

        val KWD = of("KWD")

        val KYD = of("KYD")

        val KZT = of("KZT")

        val LAK = of("LAK")

        val LBP = of("LBP")

        val LKR = of("LKR")

        val LRD = of("LRD")

        val LSL = of("LSL")

        val LYD = of("LYD")

        val MAD = of("MAD")

        val MDL = of("MDL")

        val MGA = of("MGA")

        val MKD = of("MKD")

        val MMK = of("MMK")

        val MNT = of("MNT")

        val MOP = of("MOP")

        val MRU = of("MRU")

        val MUR = of("MUR")

        val MVR = of("MVR")

        val MWK = of("MWK")

        val MXN = of("MXN")

        val MXV = of("MXV")

        val MYR = of("MYR")

        val MZN = of("MZN")

        val NAD = of("NAD")

        val NGN = of("NGN")

        val NIO = of("NIO")

        val NOK = of("NOK")

        val NPR = of("NPR")

        val NZD = of("NZD")

        val OMR = of("OMR")

        val PAB = of("PAB")

        val PEN = of("PEN")

        val PGK = of("PGK")

        val PHP = of("PHP")

        val PKR = of("PKR")

        val PLN = of("PLN")

        val PYG = of("PYG")

        val QAR = of("QAR")

        val RON = of("RON")

        val RSD = of("RSD")

        val RUB = of("RUB")

        val RWF = of("RWF")

        val SAR = of("SAR")

        val SBD = of("SBD")

        val SCR = of("SCR")

        val SDG = of("SDG")

        val SEK = of("SEK")

        val SGD = of("SGD")

        val SHP = of("SHP")

        val SLE = of("SLE")

        val SLL = of("SLL")

        val SOS = of("SOS")

        val SRD = of("SRD")

        val SSP = of("SSP")

        val STN = of("STN")

        val SVC = of("SVC")

        val SYP = of("SYP")

        val SZL = of("SZL")

        val THB = of("THB")

        val TJS = of("TJS")

        val TMT = of("TMT")

        val TND = of("TND")

        val TOP = of("TOP")

        val TRY = of("TRY")

        val TTD = of("TTD")

        val TWD = of("TWD")

        val TZS = of("TZS")

        val UAH = of("UAH")

        val UGX = of("UGX")

        val USD = of("USD")

        val USN = of("USN")

        val UYI = of("UYI")

        val UYU = of("UYU")

        val UYW = of("UYW")

        val UZS = of("UZS")

        val VED = of("VED")

        val VES = of("VES")

        val VND = of("VND")

        val VUV = of("VUV")

        val WST = of("WST")

        val XAF = of("XAF")

        val XAG = of("XAG")

        val XAU = of("XAU")

        val XBA = of("XBA")

        val XBB = of("XBB")

        val XBC = of("XBC")

        val XBD = of("XBD")

        val XCD = of("XCD")

        val XDR = of("XDR")

        val XOF = of("XOF")

        val XPD = of("XPD")

        val XPF = of("XPF")

        val XPT = of("XPT")

        val XSU = of("XSU")

        val XTS = of("XTS")

        val XUA = of("XUA")

        val XXX = of("XXX")

        val YER = of("YER")

        val ZAR = of("ZAR")

        val ZMW = of("ZMW")

        val ZWL = of("ZWL")

        fun of(value: String) = Currency(JsonField.of(value))
    }

    enum class Known {
        AED,
        AFN,
        ALL,
        AMD,
        ANG,
        AOA,
        ARS,
        AUD,
        AWG,
        AZN,
        BAM,
        BBD,
        BDT,
        BGN,
        BHD,
        BIF,
        BMD,
        BND,
        BOB,
        BOV,
        BRL,
        BSD,
        BTN,
        BWP,
        BYN,
        BZD,
        CAD,
        CDF,
        CHE,
        CHF,
        CHW,
        CLF,
        CLP,
        CNY,
        COP,
        COU,
        CRC,
        CUC,
        CUP,
        CVE,
        CZK,
        DJF,
        DKK,
        DOP,
        DZD,
        EGP,
        ERN,
        ETB,
        EUR,
        FJD,
        FKP,
        GBP,
        GEL,
        GHS,
        GIP,
        GMD,
        GNF,
        GTQ,
        GYD,
        HKD,
        HNL,
        HRK,
        HTG,
        HUF,
        IDR,
        ILS,
        INR,
        IQD,
        IRR,
        ISK,
        JMD,
        JOD,
        JPY,
        KES,
        KGS,
        KHR,
        KMF,
        KPW,
        KRW,
        KWD,
        KYD,
        KZT,
        LAK,
        LBP,
        LKR,
        LRD,
        LSL,
        LYD,
        MAD,
        MDL,
        MGA,
        MKD,
        MMK,
        MNT,
        MOP,
        MRU,
        MUR,
        MVR,
        MWK,
        MXN,
        MXV,
        MYR,
        MZN,
        NAD,
        NGN,
        NIO,
        NOK,
        NPR,
        NZD,
        OMR,
        PAB,
        PEN,
        PGK,
        PHP,
        PKR,
        PLN,
        PYG,
        QAR,
        RON,
        RSD,
        RUB,
        RWF,
        SAR,
        SBD,
        SCR,
        SDG,
        SEK,
        SGD,
        SHP,
        SLE,
        SLL,
        SOS,
        SRD,
        SSP,
        STN,
        SVC,
        SYP,
        SZL,
        THB,
        TJS,
        TMT,
        TND,
        TOP,
        TRY,
        TTD,
        TWD,
        TZS,
        UAH,
        UGX,
        USD,
        USN,
        UYI,
        UYU,
        UYW,
        UZS,
        VED,
        VES,
        VND,
        VUV,
        WST,
        XAF,
        XAG,
        XAU,
        XBA,
        XBB,
        XBC,
        XBD,
        XCD,
        XDR,
        XOF,
        XPD,
        XPF,
        XPT,
        XSU,
        XTS,
        XUA,
        XXX,
        YER,
        ZAR,
        ZMW,
        ZWL,
    }

    enum class Value {
        AED,
        AFN,
        ALL,
        AMD,
        ANG,
        AOA,
        ARS,
        AUD,
        AWG,
        AZN,
        BAM,
        BBD,
        BDT,
        BGN,
        BHD,
        BIF,
        BMD,
        BND,
        BOB,
        BOV,
        BRL,
        BSD,
        BTN,
        BWP,
        BYN,
        BZD,
        CAD,
        CDF,
        CHE,
        CHF,
        CHW,
        CLF,
        CLP,
        CNY,
        COP,
        COU,
        CRC,
        CUC,
        CUP,
        CVE,
        CZK,
        DJF,
        DKK,
        DOP,
        DZD,
        EGP,
        ERN,
        ETB,
        EUR,
        FJD,
        FKP,
        GBP,
        GEL,
        GHS,
        GIP,
        GMD,
        GNF,
        GTQ,
        GYD,
        HKD,
        HNL,
        HRK,
        HTG,
        HUF,
        IDR,
        ILS,
        INR,
        IQD,
        IRR,
        ISK,
        JMD,
        JOD,
        JPY,
        KES,
        KGS,
        KHR,
        KMF,
        KPW,
        KRW,
        KWD,
        KYD,
        KZT,
        LAK,
        LBP,
        LKR,
        LRD,
        LSL,
        LYD,
        MAD,
        MDL,
        MGA,
        MKD,
        MMK,
        MNT,
        MOP,
        MRU,
        MUR,
        MVR,
        MWK,
        MXN,
        MXV,
        MYR,
        MZN,
        NAD,
        NGN,
        NIO,
        NOK,
        NPR,
        NZD,
        OMR,
        PAB,
        PEN,
        PGK,
        PHP,
        PKR,
        PLN,
        PYG,
        QAR,
        RON,
        RSD,
        RUB,
        RWF,
        SAR,
        SBD,
        SCR,
        SDG,
        SEK,
        SGD,
        SHP,
        SLE,
        SLL,
        SOS,
        SRD,
        SSP,
        STN,
        SVC,
        SYP,
        SZL,
        THB,
        TJS,
        TMT,
        TND,
        TOP,
        TRY,
        TTD,
        TWD,
        TZS,
        UAH,
        UGX,
        USD,
        USN,
        UYI,
        UYU,
        UYW,
        UZS,
        VED,
        VES,
        VND,
        VUV,
        WST,
        XAF,
        XAG,
        XAU,
        XBA,
        XBB,
        XBC,
        XBD,
        XCD,
        XDR,
        XOF,
        XPD,
        XPF,
        XPT,
        XSU,
        XTS,
        XUA,
        XXX,
        YER,
        ZAR,
        ZMW,
        ZWL,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            AED -> Value.AED
            AFN -> Value.AFN
            ALL -> Value.ALL
            AMD -> Value.AMD
            ANG -> Value.ANG
            AOA -> Value.AOA
            ARS -> Value.ARS
            AUD -> Value.AUD
            AWG -> Value.AWG
            AZN -> Value.AZN
            BAM -> Value.BAM
            BBD -> Value.BBD
            BDT -> Value.BDT
            BGN -> Value.BGN
            BHD -> Value.BHD
            BIF -> Value.BIF
            BMD -> Value.BMD
            BND -> Value.BND
            BOB -> Value.BOB
            BOV -> Value.BOV
            BRL -> Value.BRL
            BSD -> Value.BSD
            BTN -> Value.BTN
            BWP -> Value.BWP
            BYN -> Value.BYN
            BZD -> Value.BZD
            CAD -> Value.CAD
            CDF -> Value.CDF
            CHE -> Value.CHE
            CHF -> Value.CHF
            CHW -> Value.CHW
            CLF -> Value.CLF
            CLP -> Value.CLP
            CNY -> Value.CNY
            COP -> Value.COP
            COU -> Value.COU
            CRC -> Value.CRC
            CUC -> Value.CUC
            CUP -> Value.CUP
            CVE -> Value.CVE
            CZK -> Value.CZK
            DJF -> Value.DJF
            DKK -> Value.DKK
            DOP -> Value.DOP
            DZD -> Value.DZD
            EGP -> Value.EGP
            ERN -> Value.ERN
            ETB -> Value.ETB
            EUR -> Value.EUR
            FJD -> Value.FJD
            FKP -> Value.FKP
            GBP -> Value.GBP
            GEL -> Value.GEL
            GHS -> Value.GHS
            GIP -> Value.GIP
            GMD -> Value.GMD
            GNF -> Value.GNF
            GTQ -> Value.GTQ
            GYD -> Value.GYD
            HKD -> Value.HKD
            HNL -> Value.HNL
            HRK -> Value.HRK
            HTG -> Value.HTG
            HUF -> Value.HUF
            IDR -> Value.IDR
            ILS -> Value.ILS
            INR -> Value.INR
            IQD -> Value.IQD
            IRR -> Value.IRR
            ISK -> Value.ISK
            JMD -> Value.JMD
            JOD -> Value.JOD
            JPY -> Value.JPY
            KES -> Value.KES
            KGS -> Value.KGS
            KHR -> Value.KHR
            KMF -> Value.KMF
            KPW -> Value.KPW
            KRW -> Value.KRW
            KWD -> Value.KWD
            KYD -> Value.KYD
            KZT -> Value.KZT
            LAK -> Value.LAK
            LBP -> Value.LBP
            LKR -> Value.LKR
            LRD -> Value.LRD
            LSL -> Value.LSL
            LYD -> Value.LYD
            MAD -> Value.MAD
            MDL -> Value.MDL
            MGA -> Value.MGA
            MKD -> Value.MKD
            MMK -> Value.MMK
            MNT -> Value.MNT
            MOP -> Value.MOP
            MRU -> Value.MRU
            MUR -> Value.MUR
            MVR -> Value.MVR
            MWK -> Value.MWK
            MXN -> Value.MXN
            MXV -> Value.MXV
            MYR -> Value.MYR
            MZN -> Value.MZN
            NAD -> Value.NAD
            NGN -> Value.NGN
            NIO -> Value.NIO
            NOK -> Value.NOK
            NPR -> Value.NPR
            NZD -> Value.NZD
            OMR -> Value.OMR
            PAB -> Value.PAB
            PEN -> Value.PEN
            PGK -> Value.PGK
            PHP -> Value.PHP
            PKR -> Value.PKR
            PLN -> Value.PLN
            PYG -> Value.PYG
            QAR -> Value.QAR
            RON -> Value.RON
            RSD -> Value.RSD
            RUB -> Value.RUB
            RWF -> Value.RWF
            SAR -> Value.SAR
            SBD -> Value.SBD
            SCR -> Value.SCR
            SDG -> Value.SDG
            SEK -> Value.SEK
            SGD -> Value.SGD
            SHP -> Value.SHP
            SLE -> Value.SLE
            SLL -> Value.SLL
            SOS -> Value.SOS
            SRD -> Value.SRD
            SSP -> Value.SSP
            STN -> Value.STN
            SVC -> Value.SVC
            SYP -> Value.SYP
            SZL -> Value.SZL
            THB -> Value.THB
            TJS -> Value.TJS
            TMT -> Value.TMT
            TND -> Value.TND
            TOP -> Value.TOP
            TRY -> Value.TRY
            TTD -> Value.TTD
            TWD -> Value.TWD
            TZS -> Value.TZS
            UAH -> Value.UAH
            UGX -> Value.UGX
            USD -> Value.USD
            USN -> Value.USN
            UYI -> Value.UYI
            UYU -> Value.UYU
            UYW -> Value.UYW
            UZS -> Value.UZS
            VED -> Value.VED
            VES -> Value.VES
            VND -> Value.VND
            VUV -> Value.VUV
            WST -> Value.WST
            XAF -> Value.XAF
            XAG -> Value.XAG
            XAU -> Value.XAU
            XBA -> Value.XBA
            XBB -> Value.XBB
            XBC -> Value.XBC
            XBD -> Value.XBD
            XCD -> Value.XCD
            XDR -> Value.XDR
            XOF -> Value.XOF
            XPD -> Value.XPD
            XPF -> Value.XPF
            XPT -> Value.XPT
            XSU -> Value.XSU
            XTS -> Value.XTS
            XUA -> Value.XUA
            XXX -> Value.XXX
            YER -> Value.YER
            ZAR -> Value.ZAR
            ZMW -> Value.ZMW
            ZWL -> Value.ZWL
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            AED -> Known.AED
            AFN -> Known.AFN
            ALL -> Known.ALL
            AMD -> Known.AMD
            ANG -> Known.ANG
            AOA -> Known.AOA
            ARS -> Known.ARS
            AUD -> Known.AUD
            AWG -> Known.AWG
            AZN -> Known.AZN
            BAM -> Known.BAM
            BBD -> Known.BBD
            BDT -> Known.BDT
            BGN -> Known.BGN
            BHD -> Known.BHD
            BIF -> Known.BIF
            BMD -> Known.BMD
            BND -> Known.BND
            BOB -> Known.BOB
            BOV -> Known.BOV
            BRL -> Known.BRL
            BSD -> Known.BSD
            BTN -> Known.BTN
            BWP -> Known.BWP
            BYN -> Known.BYN
            BZD -> Known.BZD
            CAD -> Known.CAD
            CDF -> Known.CDF
            CHE -> Known.CHE
            CHF -> Known.CHF
            CHW -> Known.CHW
            CLF -> Known.CLF
            CLP -> Known.CLP
            CNY -> Known.CNY
            COP -> Known.COP
            COU -> Known.COU
            CRC -> Known.CRC
            CUC -> Known.CUC
            CUP -> Known.CUP
            CVE -> Known.CVE
            CZK -> Known.CZK
            DJF -> Known.DJF
            DKK -> Known.DKK
            DOP -> Known.DOP
            DZD -> Known.DZD
            EGP -> Known.EGP
            ERN -> Known.ERN
            ETB -> Known.ETB
            EUR -> Known.EUR
            FJD -> Known.FJD
            FKP -> Known.FKP
            GBP -> Known.GBP
            GEL -> Known.GEL
            GHS -> Known.GHS
            GIP -> Known.GIP
            GMD -> Known.GMD
            GNF -> Known.GNF
            GTQ -> Known.GTQ
            GYD -> Known.GYD
            HKD -> Known.HKD
            HNL -> Known.HNL
            HRK -> Known.HRK
            HTG -> Known.HTG
            HUF -> Known.HUF
            IDR -> Known.IDR
            ILS -> Known.ILS
            INR -> Known.INR
            IQD -> Known.IQD
            IRR -> Known.IRR
            ISK -> Known.ISK
            JMD -> Known.JMD
            JOD -> Known.JOD
            JPY -> Known.JPY
            KES -> Known.KES
            KGS -> Known.KGS
            KHR -> Known.KHR
            KMF -> Known.KMF
            KPW -> Known.KPW
            KRW -> Known.KRW
            KWD -> Known.KWD
            KYD -> Known.KYD
            KZT -> Known.KZT
            LAK -> Known.LAK
            LBP -> Known.LBP
            LKR -> Known.LKR
            LRD -> Known.LRD
            LSL -> Known.LSL
            LYD -> Known.LYD
            MAD -> Known.MAD
            MDL -> Known.MDL
            MGA -> Known.MGA
            MKD -> Known.MKD
            MMK -> Known.MMK
            MNT -> Known.MNT
            MOP -> Known.MOP
            MRU -> Known.MRU
            MUR -> Known.MUR
            MVR -> Known.MVR
            MWK -> Known.MWK
            MXN -> Known.MXN
            MXV -> Known.MXV
            MYR -> Known.MYR
            MZN -> Known.MZN
            NAD -> Known.NAD
            NGN -> Known.NGN
            NIO -> Known.NIO
            NOK -> Known.NOK
            NPR -> Known.NPR
            NZD -> Known.NZD
            OMR -> Known.OMR
            PAB -> Known.PAB
            PEN -> Known.PEN
            PGK -> Known.PGK
            PHP -> Known.PHP
            PKR -> Known.PKR
            PLN -> Known.PLN
            PYG -> Known.PYG
            QAR -> Known.QAR
            RON -> Known.RON
            RSD -> Known.RSD
            RUB -> Known.RUB
            RWF -> Known.RWF
            SAR -> Known.SAR
            SBD -> Known.SBD
            SCR -> Known.SCR
            SDG -> Known.SDG
            SEK -> Known.SEK
            SGD -> Known.SGD
            SHP -> Known.SHP
            SLE -> Known.SLE
            SLL -> Known.SLL
            SOS -> Known.SOS
            SRD -> Known.SRD
            SSP -> Known.SSP
            STN -> Known.STN
            SVC -> Known.SVC
            SYP -> Known.SYP
            SZL -> Known.SZL
            THB -> Known.THB
            TJS -> Known.TJS
            TMT -> Known.TMT
            TND -> Known.TND
            TOP -> Known.TOP
            TRY -> Known.TRY
            TTD -> Known.TTD
            TWD -> Known.TWD
            TZS -> Known.TZS
            UAH -> Known.UAH
            UGX -> Known.UGX
            USD -> Known.USD
            USN -> Known.USN
            UYI -> Known.UYI
            UYU -> Known.UYU
            UYW -> Known.UYW
            UZS -> Known.UZS
            VED -> Known.VED
            VES -> Known.VES
            VND -> Known.VND
            VUV -> Known.VUV
            WST -> Known.WST
            XAF -> Known.XAF
            XAG -> Known.XAG
            XAU -> Known.XAU
            XBA -> Known.XBA
            XBB -> Known.XBB
            XBC -> Known.XBC
            XBD -> Known.XBD
            XCD -> Known.XCD
            XDR -> Known.XDR
            XOF -> Known.XOF
            XPD -> Known.XPD
            XPF -> Known.XPF
            XPT -> Known.XPT
            XSU -> Known.XSU
            XTS -> Known.XTS
            XUA -> Known.XUA
            XXX -> Known.XXX
            YER -> Known.YER
            ZAR -> Known.ZAR
            ZMW -> Known.ZMW
            ZWL -> Known.ZWL
            else -> throw LithicInvalidDataException("Unknown Currency: $value")
        }

    fun asString(): String = _value().asStringOrThrow()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
