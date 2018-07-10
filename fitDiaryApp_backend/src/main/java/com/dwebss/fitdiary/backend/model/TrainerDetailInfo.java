package com.dwebss.fitdiary.backend.model;

import javax.persistence.*;

@Table(name = "trainer_detail_info")
public class TrainerDetailInfo {
    /**
     * 트레이너 세부정보ID
     */
    @Id
    @Column(name = "TRAINER_DETAIL_ID")
    private Integer trainerDetailId;

    /**
     * 사용자 헬스장 매핑 ID
     */
    @Column(name = "UESR_GYM_ID")
    private Integer uesrGymId;

    /**
     * 트레이너 세부정보코드
     */
    @Column(name = "TRAINER_DETAIL_CD")
    private Integer trainerDetailCd;

    /**
     * 트레이너 세부정보내용
     */
    @Column(name = "TRAINER_DETAIL_CONTENT")
    private String trainerDetailContent;

    /**
     * getter트레이너 세부정보ID
     *
     * @return TRAINER_DETAIL_ID - 트레이너 세부정보ID
     */
    public Integer getTrainerDetailId() {
        return trainerDetailId;
    }

    /**
     * setter트레이너 세부정보ID
     *
     * @param trainerDetailId 트레이너 세부정보ID
     */
    public void setTrainerDetailId(Integer trainerDetailId) {
        this.trainerDetailId = trainerDetailId;
    }

    /**
     * getter사용자 헬스장 매핑 ID
     *
     * @return UESR_GYM_ID - 사용자 헬스장 매핑 ID
     */
    public Integer getUesrGymId() {
        return uesrGymId;
    }

    /**
     * setter사용자 헬스장 매핑 ID
     *
     * @param uesrGymId 사용자 헬스장 매핑 ID
     */
    public void setUesrGymId(Integer uesrGymId) {
        this.uesrGymId = uesrGymId;
    }

    /**
     * getter트레이너 세부정보코드
     *
     * @return TRAINER_DETAIL_CD - 트레이너 세부정보코드
     */
    public Integer getTrainerDetailCd() {
        return trainerDetailCd;
    }

    /**
     * setter트레이너 세부정보코드
     *
     * @param trainerDetailCd 트레이너 세부정보코드
     */
    public void setTrainerDetailCd(Integer trainerDetailCd) {
        this.trainerDetailCd = trainerDetailCd;
    }

    /**
     * getter트레이너 세부정보내용
     *
     * @return TRAINER_DETAIL_CONTENT - 트레이너 세부정보내용
     */
    public String getTrainerDetailContent() {
        return trainerDetailContent;
    }

    /**
     * setter트레이너 세부정보내용
     *
     * @param trainerDetailContent 트레이너 세부정보내용
     */
    public void setTrainerDetailContent(String trainerDetailContent) {
        this.trainerDetailContent = trainerDetailContent;
    }
}