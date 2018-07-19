package com.dwebss.fitdiary.backend.model;

import java.util.List;

import javax.persistence.*;

@Table(name = "exercise_course_detail")
public class ExerciseCourseDetail {
    /**
     * 운동코스상세ID
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "EXERCISE_COURSE_DETAIL_ID")
    private Integer exerciseCourseDetailId;

    /**
     * 운동코스ID
     */
    @Column(name = "EXERCISE_COURSE_ID")
    private Integer exerciseCourseId;

    /**
     * 운동정보ID
     */
    @Column(name = "EXERCISE_INFO_ID")
    private Integer exerciseInfoId;
    
    @Transient
    private List<ExerciseCourseSetInfo>  exerciseCourseSetInfo;

	public List<ExerciseCourseSetInfo> getExerciseCourseSetInfo() {
		return exerciseCourseSetInfo;
	}

	public void setExerciseCourseSetInfo(List<ExerciseCourseSetInfo> exerciseCourseSetInfo) {
		this.exerciseCourseSetInfo = exerciseCourseSetInfo;
	}

	/**
     * getter운동코스상세ID
     *
     * @return EXERCISE_COURSE_DETAIL_ID - 운동코스상세ID
     */
    public Integer getExerciseCourseDetailId() {
        return exerciseCourseDetailId;
    }

    /**
     * setter운동코스상세ID
     *
     * @param exerciseCourseDetailId 운동코스상세ID
     */
    public void setExerciseCourseDetailId(Integer exerciseCourseDetailId) {
        this.exerciseCourseDetailId = exerciseCourseDetailId;
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
}