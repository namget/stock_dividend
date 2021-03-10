package com.namget.stock.know.data.resp

data class DividendResp(
    val basDt : String, //기준일자
    val crno : String, // 법인등록번호
    val isinCd : String, //ISIN 코드
    val stckIssuCmpyNm : String, //주식발행회사명
    val isinCdNm : String, // ISIN 코드명
    val scrsItmsKcd : String, //유가증권종목종류코드
    val scrsItmsKcdNm : String,//유가증권종목종류코드명
    val stckParPrc : String, //주식액면가
    val trsnmDptyDcd : String, //명의개서대리인구분코드
    val trsnmDptyDcdNm : String, //명의개서대리인구분코드명
    val stckStacMd : String, //주식결산월일
    val dvdnBasDt : String, //배당기준일자
    val cashDvdnPayDt : String, //현금배당지급일자
    val stckHndvDt : String, //주식교부일자
    val stckDvdnRcd : String, //주식배당사유코드
    val stckDvdnRcdNm : String, //주식배당사유코드명
    val stckGenrDvdnAmt : String, //주식일반배당금액
    val stckGrdnDvdnAmt : String, //주식차등배당금액
    val stckGenrCashDvdnRt : String, //주식일반현금배당률
    val stckGenrDvdnRt : String, //주식일반배당률
    val cashGrdnDvdnRt : String, //현금차등배당률
    val stckGrdnDvdnRt : String, //주식차등배당률
)