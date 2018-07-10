package com.dwebss.fitdiary.backend.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "consulting_info")
public class ConsultingInfo {
    /**
     * 상담정보ID
     */
    @Id
    @Column(name = "CONSULTING_ID")
    private Integer consultingId;

    /**
     * 사용자ID
     */
    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * 트레이너ID
     */
    @Column(name = "TRAINER_ID")
    private Integer trainerId;

    /**
     * 상담내용
     */
    @Column(name = "CONSULTING_CONTENT")
    private String consultingContent;

    /**
     * 상담일
     */
    @Column(name = "CONSULTING_D")
    private Date consultingD;

    /**
     * 상담완료여부
     */
    @Column(name = "CONSULTING_SUCCESS_YN")
    private String consultingSuccessYn;

    /**
     * getter상담정보ID
     *
     * @return CONSULTING_ID - 상담정보ID
     */
    public Integer getConsultingId() {
        return consultingId;
    }

    /**
     * setter상담정보ID
     *
     * @param consultingId 상담정보ID
     */
    public void setConsultingId(Integer consultingId) {
        this.consultingId = consultingId;
    }

    /**
     * getter사용자ID
     *
     * @return USER_ID - 사용자ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * setter사용자ID
     *
     * @param userId 사용자ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * getter트레이너ID
     *
     * @return TRAINER_ID - 트레이너ID
     */
    public Integer getTrainerId() {
        return trainerId;
    }

    /**
     * setter트레이너ID
     *
     * @param trainerId 트레이너ID
     */
    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    /**
     * getter상담내용
     *
     * @return CONSULTING_CONTENT - 상담내용
     */
    public String getConsultingContent() {
        return consultingContent;
    }

    /**
     * setter상담내용
     *
     * @param consultingContent 상담내용
     */
    public void setConsultingContent(String consultingContent) {
        this.consultingContent = consultingContent;
    }

    /**
     * getter상담일
     *
     * @return CONSULTING_D - 상담일
     */
    public Date getConsultingD() {
        return consultingD;
    }

    /**
     * setter상담일
     *
     * @param consultingD 상담일
     */
    public void setConsultingD(Date consultingD) {
        this.consultingD = consultingD;
    }

    /**
     * getter상담완료여부
     *
     * @return CONSULTING_SUCCESS_YN - 상담완료여부
     */
    public String getConsultingSuccessYn() {
        return consultingSuccessYn;
    }

    /**
     * setter상담완료여부
     *
     * @param consultingSuccessYn 상담완료여부
     */
    public void setConsultingSuccessYn(String consultingSuccessYn) {
        this.consultingSuccessYn = consultingSuccessYn;
    }
}