package com.dwebss.fitdiary.backend.model;

import javax.persistence.*;

@Table(name = "gym_class")
public class GymClass {
    /**
     * 강좌정보ID
     */
    @Id
    @Column(name = "CLASS_INFO_ID")
    private Integer classInfoId;

    /**
     * 헬스장ID
     */
    @Column(name = "GYM_ID")
    private Integer gymId;

    /**
     * 강좌진행구분 코드
     */
    @Column(name = "CLASS_CONTINUE_CD")
    private Integer classContinueCd;

    /**
     * 강좌구분코드
     */
    @Column(name = "CLASS_CATEGORY_CD")
    private Integer classCategoryCd;

    /**
     * 강좌명
     */
    @Column(name = "CLASS_NM")
    private String classNm;

    /**
     * 수강가능인원 수
     */
    @Column(name = "CLASS_ENROLL_LIMIT")
    private Integer classEnrollLimit;

    /**
     * 강좌 설명
     */
    @Column(name = "CLASS_DESC")
    private String classDesc;

    /**
     * 신청가능시작시간
     */
    @Column(name = "CLASS_ENROLL_START_T")
    private Integer classEnrollStartT;

    /**
     * 신청가능종료시간
     */
    @Column(name = "CLASS_ENROLL_END_T")
    private Integer classEnrollEndT;

    /**
     * 보고서 여부
     */
    @Column(name = "CLASS_REPORT_USING_YN")
    private String classReportUsingYn;

    /**
     * getter강좌정보ID
     *
     * @return CLASS_INFO_ID - 강좌정보ID
     */
    public Integer getClassInfoId() {
        return classInfoId;
    }

    /**
     * setter강좌정보ID
     *
     * @param classInfoId 강좌정보ID
     */
    public void setClassInfoId(Integer classInfoId) {
        this.classInfoId = classInfoId;
    }

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
     * getter강좌진행구분 코드
     *
     * @return CLASS_CONTINUE_CD - 강좌진행구분 코드
     */
    public Integer getClassContinueCd() {
        return classContinueCd;
    }

    /**
     * setter강좌진행구분 코드
     *
     * @param classContinueCd 강좌진행구분 코드
     */
    public void setClassContinueCd(Integer classContinueCd) {
        this.classContinueCd = classContinueCd;
    }

    /**
     * getter강좌구분코드
     *
     * @return CLASS_CATEGORY_CD - 강좌구분코드
     */
    public Integer getClassCategoryCd() {
        return classCategoryCd;
    }

    /**
     * setter강좌구분코드
     *
     * @param classCategoryCd 강좌구분코드
     */
    public void setClassCategoryCd(Integer classCategoryCd) {
        this.classCategoryCd = classCategoryCd;
    }

    /**
     * getter강좌명
     *
     * @return CLASS_NM - 강좌명
     */
    public String getClassNm() {
        return classNm;
    }

    /**
     * setter강좌명
     *
     * @param classNm 강좌명
     */
    public void setClassNm(String classNm) {
        this.classNm = classNm;
    }

    /**
     * getter수강가능인원 수
     *
     * @return CLASS_ENROLL_LIMIT - 수강가능인원 수
     */
    public Integer getClassEnrollLimit() {
        return classEnrollLimit;
    }

    /**
     * setter수강가능인원 수
     *
     * @param classEnrollLimit 수강가능인원 수
     */
    public void setClassEnrollLimit(Integer classEnrollLimit) {
        this.classEnrollLimit = classEnrollLimit;
    }

    /**
     * getter강좌 설명
     *
     * @return CLASS_DESC - 강좌 설명
     */
    public String getClassDesc() {
        return classDesc;
    }

    /**
     * setter강좌 설명
     *
     * @param classDesc 강좌 설명
     */
    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    /**
     * getter신청가능시작시간
     *
     * @return CLASS_ENROLL_START_T - 신청가능시작시간
     */
    public Integer getClassEnrollStartT() {
        return classEnrollStartT;
    }

    /**
     * setter신청가능시작시간
     *
     * @param classEnrollStartT 신청가능시작시간
     */
    public void setClassEnrollStartT(Integer classEnrollStartT) {
        this.classEnrollStartT = classEnrollStartT;
    }

    /**
     * getter신청가능종료시간
     *
     * @return CLASS_ENROLL_END_T - 신청가능종료시간
     */
    public Integer getClassEnrollEndT() {
        return classEnrollEndT;
    }

    /**
     * setter신청가능종료시간
     *
     * @param classEnrollEndT 신청가능종료시간
     */
    public void setClassEnrollEndT(Integer classEnrollEndT) {
        this.classEnrollEndT = classEnrollEndT;
    }

    /**
     * getter보고서 여부
     *
     * @return CLASS_REPORT_USING_YN - 보고서 여부
     */
    public String getClassReportUsingYn() {
        return classReportUsingYn;
    }

    /**
     * setter보고서 여부
     *
     * @param classReportUsingYn 보고서 여부
     */
    public void setClassReportUsingYn(String classReportUsingYn) {
        this.classReportUsingYn = classReportUsingYn;
    }
}