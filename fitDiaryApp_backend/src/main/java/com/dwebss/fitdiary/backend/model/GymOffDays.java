package com.dwebss.fitdiary.backend.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "gym_off_days")
public class GymOffDays {
    /**
     * 휴일정보ID
     */
    @Id
    @Column(name = "OFF_DAY_ID")
    private Integer offDayId;

    /**
     * 휴일일자
     */
    @Column(name = "OFF_DAY")
    private Date offDay;

    /**
     * 휴일설명
     */
    @Column(name = "OFF_DESC")
    private String offDesc;

    /**
     * 트레이너여부
     */
    @Column(name = "TRAINER_YN")
    private String trainerYn;

    /**
     * 사용자 헬스장 매핑 ID
     */
    @Column(name = "UESR_GYM_ID")
    private Integer uesrGymId;

    /**
     * getter휴일정보ID
     *
     * @return OFF_DAY_ID - 휴일정보ID
     */
    public Integer getOffDayId() {
        return offDayId;
    }

    /**
     * setter휴일정보ID
     *
     * @param offDayId 휴일정보ID
     */
    public void setOffDayId(Integer offDayId) {
        this.offDayId = offDayId;
    }

    /**
     * getter휴일일자
     *
     * @return OFF_DAY - 휴일일자
     */
    public Date getOffDay() {
        return offDay;
    }

    /**
     * setter휴일일자
     *
     * @param offDay 휴일일자
     */
    public void setOffDay(Date offDay) {
        this.offDay = offDay;
    }

    /**
     * getter휴일설명
     *
     * @return OFF_DESC - 휴일설명
     */
    public String getOffDesc() {
        return offDesc;
    }

    /**
     * setter휴일설명
     *
     * @param offDesc 휴일설명
     */
    public void setOffDesc(String offDesc) {
        this.offDesc = offDesc;
    }

    /**
     * getter트레이너여부
     *
     * @return TRAINER_YN - 트레이너여부
     */
    public String getTrainerYn() {
        return trainerYn;
    }

    /**
     * setter트레이너여부
     *
     * @param trainerYn 트레이너여부
     */
    public void setTrainerYn(String trainerYn) {
        this.trainerYn = trainerYn;
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
}