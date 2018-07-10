package com.dwebss.fitdiary.backend.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_class_progress")
public class UserClassProgress {
    /**
     * 강좌진행정보
     */
    @Id
    @Column(name = "USER_CLASS_PROGRESS_ID")
    private Integer userClassProgressId;

    /**
     * 강좌계약정보ID
     */
    @Column(name = "USER_CLASS_CONTRACT_ID")
    private Integer userClassContractId;

    /**
     * 운동코스ID
     */
    @Column(name = "EXERCISE_COURSE_ID")
    private Integer exerciseCourseId;

    /**
     * 강좌일자
     */
    @Column(name = "USER_CLASS_PROGRESS_D")
    private Date userClassProgressD;

    /**
     * 강좌시작시간
     */
    @Column(name = "USER_CLASS_PROGRESS_START_T")
    private Integer userClassProgressStartT;

    /**
     * 강좌종료시간
     */
    @Column(name = "USER_CLASS_PROGRESS_END_T")
    private Integer userClassProgressEndT;

    /**
     * 출석여부
     */
    @Column(name = "CLASS_ATTENDANCE_YN")
    private String classAttendanceYn;

    /**
     * 현재PT회차
     */
    @Column(name = "CURRENT_CLASS_TURN")
    private Integer currentClassTurn;

    /**
     * 사용자ID
     */
    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * getter강좌진행정보
     *
     * @return USER_CLASS_PROGRESS_ID - 강좌진행정보
     */
    public Integer getUserClassProgressId() {
        return userClassProgressId;
    }

    /**
     * setter강좌진행정보
     *
     * @param userClassProgressId 강좌진행정보
     */
    public void setUserClassProgressId(Integer userClassProgressId) {
        this.userClassProgressId = userClassProgressId;
    }

    /**
     * getter강좌계약정보ID
     *
     * @return USER_CLASS_CONTRACT_ID - 강좌계약정보ID
     */
    public Integer getUserClassContractId() {
        return userClassContractId;
    }

    /**
     * setter강좌계약정보ID
     *
     * @param userClassContractId 강좌계약정보ID
     */
    public void setUserClassContractId(Integer userClassContractId) {
        this.userClassContractId = userClassContractId;
    }

    /**
     * getter운동코스ID
     *
     * @return EXERCISE_COURSE_ID - 운동코스ID
     */
    public Integer getExerciseCourseId() {
        return exerciseCourseId;
    }

    /**
     * setter운동코스ID
     *
     * @param exerciseCourseId 운동코스ID
     */
    public void setExerciseCourseId(Integer exerciseCourseId) {
        this.exerciseCourseId = exerciseCourseId;
    }

    /**
     * getter강좌일자
     *
     * @return USER_CLASS_PROGRESS_D - 강좌일자
     */
    public Date getUserClassProgressD() {
        return userClassProgressD;
    }

    /**
     * setter강좌일자
     *
     * @param userClassProgressD 강좌일자
     */
    public void setUserClassProgressD(Date userClassProgressD) {
        this.userClassProgressD = userClassProgressD;
    }

    /**
     * getter강좌시작시간
     *
     * @return USER_CLASS_PROGRESS_START_T - 강좌시작시간
     */
    public Integer getUserClassProgressStartT() {
        return userClassProgressStartT;
    }

    /**
     * setter강좌시작시간
     *
     * @param userClassProgressStartT 강좌시작시간
     */
    public void setUserClassProgressStartT(Integer userClassProgressStartT) {
        this.userClassProgressStartT = userClassProgressStartT;
    }

    /**
     * getter강좌종료시간
     *
     * @return USER_CLASS_PROGRESS_END_T - 강좌종료시간
     */
    public Integer getUserClassProgressEndT() {
        return userClassProgressEndT;
    }

    /**
     * setter강좌종료시간
     *
     * @param userClassProgressEndT 강좌종료시간
     */
    public void setUserClassProgressEndT(Integer userClassProgressEndT) {
        this.userClassProgressEndT = userClassProgressEndT;
    }

    /**
     * getter출석여부
     *
     * @return CLASS_ATTENDANCE_YN - 출석여부
     */
    public String getClassAttendanceYn() {
        return classAttendanceYn;
    }

    /**
     * setter출석여부
     *
     * @param classAttendanceYn 출석여부
     */
    public void setClassAttendanceYn(String classAttendanceYn) {
        this.classAttendanceYn = classAttendanceYn;
    }

    /**
     * getter현재PT회차
     *
     * @return CURRENT_CLASS_TURN - 현재PT회차
     */
    public Integer getCurrentClassTurn() {
        return currentClassTurn;
    }

    /**
     * setter현재PT회차
     *
     * @param currentClassTurn 현재PT회차
     */
    public void setCurrentClassTurn(Integer currentClassTurn) {
        this.currentClassTurn = currentClassTurn;
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
}