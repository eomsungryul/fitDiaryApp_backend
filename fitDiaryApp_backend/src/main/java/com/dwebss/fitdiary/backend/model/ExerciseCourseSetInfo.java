package com.dwebss.fitdiary.backend.model;

import javax.persistence.*;

@Table(name = "exercise_course_set_info")
public class ExerciseCourseSetInfo {
    /**
     * 운동코스상세세트정보ID
     */
    @Id
    @Column(name = "EXERCISE_COURSE_SET_ID")
    private Integer exerciseCourseSetId;

    /**
     * 운동코스상세ID
     */
    @Column(name = "EXERCISE_COURSE_DETAIL_ID")
    private Integer exerciseCourseDetailId;

    /**
     * 회차혹은시간
     */
    @Column(name = "TURN_OR_MINUTE_ETC")
    private Integer turnOrMinuteEtc;

    /**
     * 횟수
     */
    @Column(name = "NUMBER_OF_TIMES")
    private Integer numberOfTimes;

    /**
     * 무게
     */
    @Column(name = "WEIGHT")
    private Integer weight;

    /**
     * getter운동코스상세세트정보ID
     *
     * @return EXERCISE_COURSE_SET_ID - 운동코스상세세트정보ID
     */
    public Integer getExerciseCourseSetId() {
        return exerciseCourseSetId;
    }

    /**
     * setter운동코스상세세트정보ID
     *
     * @param exerciseCourseSetId 운동코스상세세트정보ID
     */
    public void setExerciseCourseSetId(Integer exerciseCourseSetId) {
        this.exerciseCourseSetId = exerciseCourseSetId;
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
     * getter회차혹은시간
     *
     * @return TURN_OR_MINUTE_ETC - 회차혹은시간
     */
    public Integer getTurnOrMinuteEtc() {
        return turnOrMinuteEtc;
    }

    /**
     * setter회차혹은시간
     *
     * @param turnOrMinuteEtc 회차혹은시간
     */
    public void setTurnOrMinuteEtc(Integer turnOrMinuteEtc) {
        this.turnOrMinuteEtc = turnOrMinuteEtc;
    }

    /**
     * getter횟수
     *
     * @return NUMBER_OF_TIMES - 횟수
     */
    public Integer getNumberOfTimes() {
        return numberOfTimes;
    }

    /**
     * setter횟수
     *
     * @param numberOfTimes 횟수
     */
    public void setNumberOfTimes(Integer numberOfTimes) {
        this.numberOfTimes = numberOfTimes;
    }

    /**
     * getter무게
     *
     * @return WEIGHT - 무게
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * setter무게
     *
     * @param weight 무게
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}