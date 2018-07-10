package com.dwebss.fitdiary.backend.model;

import javax.persistence.*;

@Table(name = "user_diary_exercise_course")
public class UserDiaryExerciseCourse {
    /**
     * 사용자 일일 운동정보ID
     */
    @Id
    @Column(name = "USER_DIARY_EXERCISE_INFO_ID")
    private Integer userDiaryExerciseInfoId;

    /**
     * 사용자 일일 다이어리ID
     */
    @Column(name = "USER_DIARY_ID")
    private Integer userDiaryId;

    /**
     * 운동정보ID
     */
    @Column(name = "EXERCISE_INFO_ID")
    private Integer exerciseInfoId;

    /**
     * 운동진행여부
     */
    @Column(name = "`EXERCISE_ SUCCESS_YN`")
    private String exerciseSuccessYn;

    /**
     * 운동순서
     */
    @Column(name = "EXERCISE_ORDER")
    private Integer exerciseOrder;

    /**
     * getter사용자 일일 운동정보ID
     *
     * @return USER_DIARY_EXERCISE_INFO_ID - 사용자 일일 운동정보ID
     */
    public Integer getUserDiaryExerciseInfoId() {
        return userDiaryExerciseInfoId;
    }

    /**
     * setter사용자 일일 운동정보ID
     *
     * @param userDiaryExerciseInfoId 사용자 일일 운동정보ID
     */
    public void setUserDiaryExerciseInfoId(Integer userDiaryExerciseInfoId) {
        this.userDiaryExerciseInfoId = userDiaryExerciseInfoId;
    }

    /**
     * getter사용자 일일 다이어리ID
     *
     * @return USER_DIARY_ID - 사용자 일일 다이어리ID
     */
    public Integer getUserDiaryId() {
        return userDiaryId;
    }

    /**
     * setter사용자 일일 다이어리ID
     *
     * @param userDiaryId 사용자 일일 다이어리ID
     */
    public void setUserDiaryId(Integer userDiaryId) {
        this.userDiaryId = userDiaryId;
    }

    /**
     * getter운동정보ID
     *
     * @return EXERCISE_INFO_ID - 운동정보ID
     */
    public Integer getExerciseInfoId() {
        return exerciseInfoId;
    }

    /**
     * setter운동정보ID
     *
     * @param exerciseInfoId 운동정보ID
     */
    public void setExerciseInfoId(Integer exerciseInfoId) {
        this.exerciseInfoId = exerciseInfoId;
    }

    /**
     * getter운동진행여부
     *
     * @return EXERCISE_ SUCCESS_YN - 운동진행여부
     */
    public String getExerciseSuccessYn() {
        return exerciseSuccessYn;
    }

    /**
     * setter운동진행여부
     *
     * @param exerciseSuccessYn 운동진행여부
     */
    public void setExerciseSuccessYn(String exerciseSuccessYn) {
        this.exerciseSuccessYn = exerciseSuccessYn;
    }

    /**
     * getter운동순서
     *
     * @return EXERCISE_ORDER - 운동순서
     */
    public Integer getExerciseOrder() {
        return exerciseOrder;
    }

    /**
     * setter운동순서
     *
     * @param exerciseOrder 운동순서
     */
    public void setExerciseOrder(Integer exerciseOrder) {
        this.exerciseOrder = exerciseOrder;
    }
}