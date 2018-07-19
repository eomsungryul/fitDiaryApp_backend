package com.dwebss.fitdiary.backend.model;

import java.util.List;

import javax.persistence.*;

@Table(name = "exercise_course")
public class ExerciseCourse {
    /**
     * 운동코스ID
     */
    @Id
    @Column(name = "EXERCISE_COURSE_ID")
    private Integer exerciseCourseId;

    /**
     * 운동코스명
     */
    @Column(name = "EXERCISE_COURSE_NM")
    private String exerciseCourseNm;

    /**
     * 임시코스여부
     */
    @Column(name = "TEMP_YN")
    private String tempYn;

    /**
     * 사용자ID
     */
    @Column(name = "USER_ID")
    private Integer userId;

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
     * getter운동코스명
     *
     * @return EXERCISE_COURSE_NM - 운동코스명
     */
    public String getExerciseCourseNm() {
        return exerciseCourseNm;
    }

    /**
     * setter운동코스명
     *
     * @param exerciseCourseNm 운동코스명
     */
    public void setExerciseCourseNm(String exerciseCourseNm) {
        this.exerciseCourseNm = exerciseCourseNm;
    }

    /**
     * getter임시코스여부
     *
     * @return TEMP_YN - 임시코스여부
     */
    public String getTempYn() {
        return tempYn;
    }

    /**
     * setter임시코스여부
     *
     * @param tempYn 임시코스여부
     */
    public void setTempYn(String tempYn) {
        this.tempYn = tempYn;
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