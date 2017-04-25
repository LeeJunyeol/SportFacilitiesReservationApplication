package com.project.sportfacilitiesreservationapplication.entity;

import java.util.Date;

/**
 * Created by jylee on 2017-04-22.
 */

public class ReservationSportServiceInfo {
    String SVCID;   // 서비스ID(ex. S170410104651019357)
    String MINCLASSNM;   // 소분류(ex. 테니스장)
    boolean SVCSTATNM; // 접수상태(ex. 접수중/접수종료/예약일시중지)
    String SVCNM; // 서비스명(ex. 2017년 농구장3-이촌)
    String PAYATNM; // 결제방법(ex. 유/무료)
    String PLACENM; // 장소명(ex. 이촌한강공원)
    String USETGTINFO; // 서비스대상(ex. 제한없음, 청소년, 성인, 어린이)
    String SVCURL; // 바로가기 url(ex.http://yeyak.seoul.go.kr/reservation/view.web?rsvsvcid=S141110132538036824)
    float x;   // 장소 X좌표(ex. 37.56283678511617)
    float y;   // 장소 Y좌표(ex. 126.88542105032526)
    Date SVCOPNBGNDT;   // 서비스개시시작일시(ex. 2016-01-01 00:00:00.0)
    Date SVCOPNENDDT; // 서비스개시종료일시(ex. 2017-05-31 00:00:00.0)
    Date RCPTBGNDT; // 접수시작일시(ex. 2017-04-10 10:00:00.0)
    Date RCPTENDDT; // 접수종료일시(ex. 2017-04-13 18:00:00.0)
    String AREANM; // 지역명(ex. 동작구)

    public ReservationSportServiceInfo() {
    }

    public ReservationSportServiceInfo(String SVCID, String MINCLASSNM, boolean SVCSTATNM, String SVCNM, String PAYATNM, String PLACENM, String USETGTINFO, String SVCURL, float x, float y, Date SVCOPNBGNDT, Date SVCOPNENDDT, Date RCPTBGNDT, Date RCPTENDDT, String AREANM) {
        this.SVCID = SVCID;
        this.MINCLASSNM = MINCLASSNM;
        this.SVCSTATNM = SVCSTATNM;
        this.SVCNM = SVCNM;
        this.PAYATNM = PAYATNM;
        this.PLACENM = PLACENM;
        this.USETGTINFO = USETGTINFO;
        this.SVCURL = SVCURL;
        this.x = x;
        this.y = y;
        this.SVCOPNBGNDT = SVCOPNBGNDT;
        this.SVCOPNENDDT = SVCOPNENDDT;
        this.RCPTBGNDT = RCPTBGNDT;
        this.RCPTENDDT = RCPTENDDT;
        this.AREANM = AREANM;
    }

    public String getSVCID() {
        return SVCID;
    }

    public void setSVCID(String SVCID) {
        this.SVCID = SVCID;
    }

    public String getMINCLASSNM() {
        return MINCLASSNM;
    }

    public void setMINCLASSNM(String MINCLASSNM) {
        this.MINCLASSNM = MINCLASSNM;
    }

    public boolean isSVCSTATNM() {
        return SVCSTATNM;
    }

    public void setSVCSTATNM(boolean SVCSTATNM) {
        this.SVCSTATNM = SVCSTATNM;
    }

    public String getSVCNM() {
        return SVCNM;
    }

    public void setSVCNM(String SVCNM) {
        this.SVCNM = SVCNM;
    }

    public String getPAYATNM() {
        return PAYATNM;
    }

    public void setPAYATNM(String PAYATNM) {
        this.PAYATNM = PAYATNM;
    }

    public String getPLACENM() {
        return PLACENM;
    }

    public void setPLACENM(String PLACENM) {
        this.PLACENM = PLACENM;
    }

    public String getUSETGTINFO() {
        return USETGTINFO;
    }

    public void setUSETGTINFO(String USETGTINFO) {
        this.USETGTINFO = USETGTINFO;
    }

    public String getSVCURL() {
        return SVCURL;
    }

    public void setSVCURL(String SVCURL) {
        this.SVCURL = SVCURL;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Date getSVCOPNBGNDT() {
        return SVCOPNBGNDT;
    }

    public void setSVCOPNBGNDT(Date SVCOPNBGNDT) {
        this.SVCOPNBGNDT = SVCOPNBGNDT;
    }

    public Date getSVCOPNENDDT() {
        return SVCOPNENDDT;
    }

    public void setSVCOPNENDDT(Date SVCOPNENDDT) {
        this.SVCOPNENDDT = SVCOPNENDDT;
    }

    public Date getRCPTBGNDT() {
        return RCPTBGNDT;
    }

    public void setRCPTBGNDT(Date RCPTBGNDT) {
        this.RCPTBGNDT = RCPTBGNDT;
    }

    public Date getRCPTENDDT() {
        return RCPTENDDT;
    }

    public void setRCPTENDDT(Date RCPTENDDT) {
        this.RCPTENDDT = RCPTENDDT;
    }

    public String getAREANM() {
        return AREANM;
    }

    public void setAREANM(String AREANM) {
        this.AREANM = AREANM;
    }
}
