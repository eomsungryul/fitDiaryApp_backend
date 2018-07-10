package com.dwebss.fitdiary.backend.model;

import javax.persistence.*;

@Table(name = "class_trainer")
public class ClassTrainer {
    /**
     * 강좌별 트레이너 ID
     */
    @Id
    @Column(name = "CLASS_TRAINER_ID")
    private Integer classTrainerId;

    /**
     * 강좌정보ID
     */
    @Column(name = "CLASS_INFO_ID")
    private Integer classInfoId;

    /**
     * 트레이너ID
     */
    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * getter강좌별 트레이너 ID
     *
     * @return CLASS_TRAINER_ID - 강좌별 트레이너 ID
     */
    public Integer getClassTrainerId() {
        return classTrainerId;
    }

    /**
     * setter강좌별 트레이너 ID
     *
     * @param classTrainerId 강좌별 트레이너 ID
     */
    public void setClassTrainerId(Integer classTrainerId) {
        this.classTrainerId = classTrainerId;
    }

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
     * getter트레이너ID
     *
     * @return USER_ID - 트레이너ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * setter트레이너ID
     *
     * @param userId 트레이너ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}