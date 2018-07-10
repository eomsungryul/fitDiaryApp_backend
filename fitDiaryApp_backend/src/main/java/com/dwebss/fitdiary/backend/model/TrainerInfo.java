package com.dwebss.fitdiary.backend.model;

import javax.persistence.*;

@Table(name = "trainer_info")
public class TrainerInfo {
    /**
     * 사용자 헬스장 매핑 ID
     */
    @Id
    @Column(name = "UESR_GYM_ID")
    private Integer uesrGymId;

    /**
     * 출근요일(0,1,2,3,4,5,6)
     */
    @Column(name = "WORKING_D")
    private String workingD;

    /**
     * 출근시작시간
     */
    @Column(name = "WORKING_START_T")
    private Integer workingStartT;

    /**
     * 출근종료시간
     */
    @Column(name = "WORKING_END_T")
    private Integer workingEndT;

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
     * getter출근요일(0,1,2,3,4,5,6)
     *
     * @return WORKING_D - 출근요일(0,1,2,3,4,5,6)
     */
    public String getWorkingD() {
        return workingD;
    }

    /**
     * setter출근요일(0,1,2,3,4,5,6)
     *
     * @param workingD 출근요일(0,1,2,3,4,5,6)
     */
    public void setWorkingD(String workingD) {
        this.workingD = workingD;
    }

    /**
     * getter출근시작시간
     *
     * @return WORKING_START_T - 출근시작시간
     */
    public Integer getWorkingStartT() {
        return workingStartT;
    }

    /**
     * setter출근시작시간
     *
     * @param workingStartT 출근시작시간
     */
    public void setWorkingStartT(Integer workingStartT) {
        this.workingStartT = workingStartT;
    }

    /**
     * getter출근종료시간
     *
     * @return WORKING_END_T - 출근종료시간
     */
    public Integer getWorkingEndT() {
        return workingEndT;
    }

    /**
     * setter출근종료시간
     *
     * @param workingEndT 출근종료시간
     */
    public void setWorkingEndT(Integer workingEndT) {
        this.workingEndT = workingEndT;
    }
}