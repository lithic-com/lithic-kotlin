// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.errors.LithicInvalidDataException

class Currency
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Currency && this.value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        val AED = Currency(JsonField.of("AED"))

        val AFN = Currency(JsonField.of("AFN"))

        val ALL = Currency(JsonField.of("ALL"))

        val AMD = Currency(JsonField.of("AMD"))

        val ANG = Currency(JsonField.of("ANG"))

        val AOA = Currency(JsonField.of("AOA"))

        val ARS = Currency(JsonField.of("ARS"))

        val AUD = Currency(JsonField.of("AUD"))

        val AWG = Currency(JsonField.of("AWG"))

        val AZN = Currency(JsonField.of("AZN"))

        val BAM = Currency(JsonField.of("BAM"))

        val BBD = Currency(JsonField.of("BBD"))

        val BDT = Currency(JsonField.of("BDT"))

        val BGN = Currency(JsonField.of("BGN"))

        val BHD = Currency(JsonField.of("BHD"))

        val BIF = Currency(JsonField.of("BIF"))

        val BMD = Currency(JsonField.of("BMD"))

        val BND = Currency(JsonField.of("BND"))

        val BOB = Currency(JsonField.of("BOB"))

        val BOV = Currency(JsonField.of("BOV"))

        val BRL = Currency(JsonField.of("BRL"))

        val BSD = Currency(JsonField.of("BSD"))

        val BTN = Currency(JsonField.of("BTN"))

        val BWP = Currency(JsonField.of("BWP"))

        val BYN = Currency(JsonField.of("BYN"))

        val BZD = Currency(JsonField.of("BZD"))

        val CAD = Currency(JsonField.of("CAD"))

        val CDF = Currency(JsonField.of("CDF"))

        val CHE = Currency(JsonField.of("CHE"))

        val CHF = Currency(JsonField.of("CHF"))

        val CHW = Currency(JsonField.of("CHW"))

        val CLF = Currency(JsonField.of("CLF"))

        val CLP = Currency(JsonField.of("CLP"))

        val CNY = Currency(JsonField.of("CNY"))

        val COP = Currency(JsonField.of("COP"))

        val COU = Currency(JsonField.of("COU"))

        val CRC = Currency(JsonField.of("CRC"))

        val CUC = Currency(JsonField.of("CUC"))

        val CUP = Currency(JsonField.of("CUP"))

        val CVE = Currency(JsonField.of("CVE"))

        val CZK = Currency(JsonField.of("CZK"))

        val DJF = Currency(JsonField.of("DJF"))

        val DKK = Currency(JsonField.of("DKK"))

        val DOP = Currency(JsonField.of("DOP"))

        val DZD = Currency(JsonField.of("DZD"))

        val EGP = Currency(JsonField.of("EGP"))

        val ERN = Currency(JsonField.of("ERN"))

        val ETB = Currency(JsonField.of("ETB"))

        val EUR = Currency(JsonField.of("EUR"))

        val FJD = Currency(JsonField.of("FJD"))

        val FKP = Currency(JsonField.of("FKP"))

        val GBP = Currency(JsonField.of("GBP"))

        val GEL = Currency(JsonField.of("GEL"))

        val GHS = Currency(JsonField.of("GHS"))

        val GIP = Currency(JsonField.of("GIP"))

        val GMD = Currency(JsonField.of("GMD"))

        val GNF = Currency(JsonField.of("GNF"))

        val GTQ = Currency(JsonField.of("GTQ"))

        val GYD = Currency(JsonField.of("GYD"))

        val HKD = Currency(JsonField.of("HKD"))

        val HNL = Currency(JsonField.of("HNL"))

        val HRK = Currency(JsonField.of("HRK"))

        val HTG = Currency(JsonField.of("HTG"))

        val HUF = Currency(JsonField.of("HUF"))

        val IDR = Currency(JsonField.of("IDR"))

        val ILS = Currency(JsonField.of("ILS"))

        val INR = Currency(JsonField.of("INR"))

        val IQD = Currency(JsonField.of("IQD"))

        val IRR = Currency(JsonField.of("IRR"))

        val ISK = Currency(JsonField.of("ISK"))

        val JMD = Currency(JsonField.of("JMD"))

        val JOD = Currency(JsonField.of("JOD"))

        val JPY = Currency(JsonField.of("JPY"))

        val KES = Currency(JsonField.of("KES"))

        val KGS = Currency(JsonField.of("KGS"))

        val KHR = Currency(JsonField.of("KHR"))

        val KMF = Currency(JsonField.of("KMF"))

        val KPW = Currency(JsonField.of("KPW"))

        val KRW = Currency(JsonField.of("KRW"))

        val KWD = Currency(JsonField.of("KWD"))

        val KYD = Currency(JsonField.of("KYD"))

        val KZT = Currency(JsonField.of("KZT"))

        val LAK = Currency(JsonField.of("LAK"))

        val LBP = Currency(JsonField.of("LBP"))

        val LKR = Currency(JsonField.of("LKR"))

        val LRD = Currency(JsonField.of("LRD"))

        val LSL = Currency(JsonField.of("LSL"))

        val LYD = Currency(JsonField.of("LYD"))

        val MAD = Currency(JsonField.of("MAD"))

        val MDL = Currency(JsonField.of("MDL"))

        val MGA = Currency(JsonField.of("MGA"))

        val MKD = Currency(JsonField.of("MKD"))

        val MMK = Currency(JsonField.of("MMK"))

        val MNT = Currency(JsonField.of("MNT"))

        val MOP = Currency(JsonField.of("MOP"))

        val MRU = Currency(JsonField.of("MRU"))

        val MUR = Currency(JsonField.of("MUR"))

        val MVR = Currency(JsonField.of("MVR"))

        val MWK = Currency(JsonField.of("MWK"))

        val MXN = Currency(JsonField.of("MXN"))

        val MXV = Currency(JsonField.of("MXV"))

        val MYR = Currency(JsonField.of("MYR"))

        val MZN = Currency(JsonField.of("MZN"))

        val NAD = Currency(JsonField.of("NAD"))

        val NGN = Currency(JsonField.of("NGN"))

        val NIO = Currency(JsonField.of("NIO"))

        val NOK = Currency(JsonField.of("NOK"))

        val NPR = Currency(JsonField.of("NPR"))

        val NZD = Currency(JsonField.of("NZD"))

        val OMR = Currency(JsonField.of("OMR"))

        val PAB = Currency(JsonField.of("PAB"))

        val PEN = Currency(JsonField.of("PEN"))

        val PGK = Currency(JsonField.of("PGK"))

        val PHP = Currency(JsonField.of("PHP"))

        val PKR = Currency(JsonField.of("PKR"))

        val PLN = Currency(JsonField.of("PLN"))

        val PYG = Currency(JsonField.of("PYG"))

        val QAR = Currency(JsonField.of("QAR"))

        val RON = Currency(JsonField.of("RON"))

        val RSD = Currency(JsonField.of("RSD"))

        val RUB = Currency(JsonField.of("RUB"))

        val RWF = Currency(JsonField.of("RWF"))

        val SAR = Currency(JsonField.of("SAR"))

        val SBD = Currency(JsonField.of("SBD"))

        val SCR = Currency(JsonField.of("SCR"))

        val SDG = Currency(JsonField.of("SDG"))

        val SEK = Currency(JsonField.of("SEK"))

        val SGD = Currency(JsonField.of("SGD"))

        val SHP = Currency(JsonField.of("SHP"))

        val SLE = Currency(JsonField.of("SLE"))

        val SLL = Currency(JsonField.of("SLL"))

        val SOS = Currency(JsonField.of("SOS"))

        val SRD = Currency(JsonField.of("SRD"))

        val SSP = Currency(JsonField.of("SSP"))

        val STN = Currency(JsonField.of("STN"))

        val SVC = Currency(JsonField.of("SVC"))

        val SYP = Currency(JsonField.of("SYP"))

        val SZL = Currency(JsonField.of("SZL"))

        val THB = Currency(JsonField.of("THB"))

        val TJS = Currency(JsonField.of("TJS"))

        val TMT = Currency(JsonField.of("TMT"))

        val TND = Currency(JsonField.of("TND"))

        val TOP = Currency(JsonField.of("TOP"))

        val TRY = Currency(JsonField.of("TRY"))

        val TTD = Currency(JsonField.of("TTD"))

        val TWD = Currency(JsonField.of("TWD"))

        val TZS = Currency(JsonField.of("TZS"))

        val UAH = Currency(JsonField.of("UAH"))

        val UGX = Currency(JsonField.of("UGX"))

        val USD = Currency(JsonField.of("USD"))

        val USN = Currency(JsonField.of("USN"))

        val UYI = Currency(JsonField.of("UYI"))

        val UYU = Currency(JsonField.of("UYU"))

        val UYW = Currency(JsonField.of("UYW"))

        val UZS = Currency(JsonField.of("UZS"))

        val VED = Currency(JsonField.of("VED"))

        val VES = Currency(JsonField.of("VES"))

        val VND = Currency(JsonField.of("VND"))

        val VUV = Currency(JsonField.of("VUV"))

        val WST = Currency(JsonField.of("WST"))

        val XAF = Currency(JsonField.of("XAF"))

        val XAG = Currency(JsonField.of("XAG"))

        val XAU = Currency(JsonField.of("XAU"))

        val XBA = Currency(JsonField.of("XBA"))

        val XBB = Currency(JsonField.of("XBB"))

        val XBC = Currency(JsonField.of("XBC"))

        val XBD = Currency(JsonField.of("XBD"))

        val XCD = Currency(JsonField.of("XCD"))

        val XDR = Currency(JsonField.of("XDR"))

        val XOF = Currency(JsonField.of("XOF"))

        val XPD = Currency(JsonField.of("XPD"))

        val XPF = Currency(JsonField.of("XPF"))

        val XPT = Currency(JsonField.of("XPT"))

        val XSU = Currency(JsonField.of("XSU"))

        val XTS = Currency(JsonField.of("XTS"))

        val XUA = Currency(JsonField.of("XUA"))

        val XXX = Currency(JsonField.of("XXX"))

        val YER = Currency(JsonField.of("YER"))

        val ZAR = Currency(JsonField.of("ZAR"))

        val ZMW = Currency(JsonField.of("ZMW"))

        val ZWL = Currency(JsonField.of("ZWL"))

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
}
