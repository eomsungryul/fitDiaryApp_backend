package com.dwebss.fitdiary.backend.model;

import javax.persistence.*;

@Table(name = "user_exercise_range")
public class UserExerciseRange {
    /**
     * 운동범위코드
     */
    @Id
    @Column(name = "EXERCISE_RANGE_ID")
    private Integer exerciseRangeId;

    /**
     * 사용자ID
     */
    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "EXERCISE_RANGE_CD")
    private Integer exerciseRangeCd;

    public Integer getExerciseRangeId() {
		return exerciseRangeId;
	}

	public void setExerciseRangeId(Integer exerciseRangeId) {
		this.exerciseRangeId = exerciseRangeId;
	}

	/**
     * getter운동범위코드
     *
     * @return EXERCISE_RANGE_CD - 운동범위코드
     */
    public Integer getExerciseRangeCd() {
        return exerciseRangeCd;
    }

    /**
     * setter운동범위코드
     *
     * @param exerciseRangeCd 운동범위코드
     */
    public void setExerciseRangeCd(Integer exerciseRangeCd) {
        this.exerciseRangeCd = exerciseRangeCd;
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