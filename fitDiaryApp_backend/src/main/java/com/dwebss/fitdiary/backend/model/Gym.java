package com.dwebss.fitdiary.backend.model;

import javax.persistence.*;

public class Gym {
    /**
     * 헬스장ID
     */
    @Id
    @Column(name = "GYM_ID")
    private Integer gymId;

    /**
     * 헬스장 이름
     */
    @Column(name = "GYM_NM")
    private String gymNm;

    /**
     * 헬스장 주소
     */
    @Column(name = "GYM_ADDR")
    private String gymAddr;

    /**
     * 헬스장 전화번호
     */
    @Column(name = "GYM_PH")
    private String gymPh;

    /**
     * 헬스장 서버IP
     */
    @Column(name = "GYM_SV_IP")
    private String gymSvIp;

    /**
     * 헬스장 서버PORT
     */
    @Column(name = "GYM_SV_PORT")
    private String gymSvPort;

    /**
     * 헬스장 서버 DB종류코드
     */
    @Column(name = "GYM_SV_DB_CD")
    private Integer gymSvDbCd;

    /**
     * 헬스장 평일영업시작시간
     */
    @Column(name = "GYM_MF_INTIME")
    private Integer gymMfIntime;

    /**
     * 헬스장 평일영업종료시간
     */
    @Column(name = "GYM_MF_OUTTIME")
    private Integer gymMfOuttime;

    /**
     * 헬스장 주말영업시작시간
     */
    @Column(name = "GYM_SS_INTIME")
    private Integer gymSsIntime;

    /**
     * 헬스장 주말영업종료시간
     */
    @Column(name = "GYM_SS_OUTTIME")
    private Integer gymSsOuttime;

    /**
     * 헬스장 영업관련 기타정보
     */
    @Column(name = "GYM_ETC")
    private String gymEtc;

    /**
     * 헬스장 설명
     */
    @Column(name = "GYM_DESC")
    private String gymDesc;

    /**
     * 헬스장 사진파일경로
     */
    @Column(name = "GYM_PICTURE")
    private String gymPicture;

    /**
     * getter헬스장ID
     *
     * @return GYM_ID - 헬스장ID
     */
    public Integer getGymId() {
        return gymId;
    }

    /**
     * setter헬스장ID
     *
     * @param gymId 헬스장ID
     */
    public void setGymId(Integer gymId) {
        this.gymId = gymId;
    }

    /**
     * getter헬스장 이름
     *
     * @return GYM_NM - 헬스장 이름
     */
    public String getGymNm() {
        return gymNm;
    }

    /**
     * setter헬스장 이름
     *
     * @param gymNm 헬스장 이름
     */
    public void setGymNm(String gymNm) {
        this.gymNm = gymNm;
    }

    /**
     * getter헬스장 주소
     *
     * @return GYM_ADDR - 헬스장 주소
     */
    public String getGymAddr() {
        return gymAddr;
    }

    /**
     * setter헬스장 주소
     *
     * @param gymAddr 헬스장 주소
     */
    public void setGymAddr(String gymAddr) {
        this.gymAddr = gymAddr;
    }

    /**
     * getter헬스장 전화번호
     *
     * @return GYM_PH - 헬스장 전화번호
     */
    public String getGymPh() {
        return gymPh;
    }

    /**
     * setter헬스장 전화번호
     *
     * @param gymPh 헬스장 전화번호
     */
    public void setGymPh(String gymPh) {
        this.gymPh = gymPh;
    }

    /**
     * getter헬스장 서버IP
     *
     * @return GYM_SV_IP - 헬스장 서버IP
     */
    public String getGymSvIp() {
        return gymSvIp;
    }

    /**
     * setter헬스장 서버IP
     *
     * @param gymSvIp 헬스장 서버IP
     */
    public void setGymSvIp(String gymSvIp) {
        this.gymSvIp = gymSvIp;
    }

    /**
     * getter헬스장 서버PORT
     *
     * @return GYM_SV_PORT - 헬스장 서버PORT
     */
    public String getGymSvPort() {
        return gymSvPort;
    }

    /**
     * setter헬스장 서버PORT
     *
     * @param gymSvPort 헬스장 서버PORT
     */
    public void setGymSvPort(String gymSvPort) {
        this.gymSvPort = gymSvPort;
    }

    /**
     * getter헬스장 서버 DB종류코드
     *
     * @return GYM_SV_DB_CD - 헬스장 서버 DB종류코드
     */
    public Integer getGymSvDbCd() {
        return gymSvDbCd;
    }

    /**
     * setter헬스장 서버 DB종류코드
     *
     * @param gymSvDbCd 헬스장 서버 DB종류코드
     */
    public void setGymSvDbCd(Integer gymSvDbCd) {
        this.gymSvDbCd = gymSvDbCd;
    }

    /**
     * getter헬스장 평일영업시작시간
     *
     * @return GYM_MF_INTIME - 헬스장 평일영업시작시간
     */
    public Integer getGymMfIntime() {
        return gymMfIntime;
    }

    /**
     * setter헬스장 평일영업시작시간
     *
     * @param gymMfIntime 헬스장 평일영업시작시간
     */
    public void setGymMfIntime(Integer gymMfIntime) {
        this.gymMfIntime = gymMfIntime;
    }

    /**
     * getter헬스장 평일영업종료시간
     *
     * @return GYM_MF_OUTTIME - 헬스장 평일영업종료시간
     */
    public Integer getGymMfOuttime() {
        return gymMfOuttime;
    }

    /**
     * setter헬스장 평일영업종료시간
     *
     * @param gymMfOuttime 헬스장 평일영업종료시간
     */
    public void setGymMfOuttime(Integer gymMfOuttime) {
        this.gymMfOuttime = gymMfOuttime;
    }

    /**
     * getter헬스장 주말영업시작시간
     *
     * @return GYM_SS_INTIME - 헬스장 주말영업시작시간
     */
    public Integer getGymSsIntime() {
        return gymSsIntime;
    }

    /**
     * setter헬스장 주말영업시작시간
     *
     * @param gymSsIntime 헬스장 주말영업시작시간
     */
    public void setGymSsIntime(Integer gymSsIntime) {
        this.gymSsIntime = gymSsIntime;
    }

    /**
     * getter헬스장 주말영업종료시간
     *
     * @return GYM_SS_OUTTIME - 헬스장 주말영업종료시간
     */
    public Integer getGymSsOuttime() {
        return gymSsOuttime;
    }

    /**
     * setter헬스장 주말영업종료시간
     *
     * @param gymSsOuttime 헬스장 주말영업종료시간
     */
    public void setGymSsOuttime(Integer gymSsOuttime) {
        this.gymSsOuttime = gymSsOuttime;
    }

    /**
     * getter헬스장 영업관련 기타정보
     *
     * @return GYM_ETC - 헬스장 영업관련 기타정보
     */
    public String getGymEtc() {
        return gymEtc;
    }

    /**
     * setter헬스장 영업관련 기타정보
     *
     * @param gymEtc 헬스장 영업관련 기타정보
     */
    public void setGymEtc(String gymEtc) {
        this.gymEtc = gymEtc;
    }

    /**
     * getter헬스장 설명
     *
     * @return GYM_DESC - 헬스장 설명
     */
    public String getGymDesc() {
        return gymDesc;
    }

    /**
     * setter헬스장 설명
     *
     * @param gymDesc 헬스장 설명
     */
    public void setGymDesc(String gymDesc) {
        this.gymDesc = gymDesc;
    }

    /**
     * getter헬스장 사진파일경로
     *
     * @return GYM_PICTURE - 헬스장 사진파일경로
     */
    public String getGymPicture() {
        return gymPicture;
    }

    /**
     * setter헬스장 사진파일경로
     *
     * @param gymPicture 헬스장 사진파일경로
     */
    public void setGymPicture(String gymPicture) {
        this.gymPicture = gymPicture;
    }
}