package com.dwebss.fitdiary.backend.model;

import javax.persistence.*;

@Table(name = "user_class_report")
public class UserClassReport {
    /**
     * 보고서ID
     */
    @Id
    @Column(name = "USER_CLASS_REPORT_ID")
    private Integer userClassReportId;

    /**
     * 강좌진행정보
     */
    @Column(name = "USER_CLASS_PROGRESS_ID")
    private Integer userClassProgressId;

    /**
     * 운동코스상세ID
     */
    @Column(name = "EXERCISE_COURSE_DETAIL_ID")
    private Integer exerciseCourseDetailId;

    /**
     * 트레이너코멘트
     */
    @Column(name = "TRAINER_COMMENT")
    private String trainerComment;

    /**
     * 운동촬영영상경로
     */
    @Column(name = "TRAIN_VIDEO")
    private String trainVideo;

    /**
     * 운동진행여부
     */
    @Column(name = "TRAIN_YN")
    private String trainYn;

    /**
     * getter보고서ID
     *
     * @return USER_CLASS_REPORT_ID - 보고서ID
     */
    public Integer getUserClassReportId() {
        return userClassReportId;
    }

    /**
     * setter보고서ID
     *
     * @param userClassReportId 보고서ID
     */
    public void setUserClassReportId(Integer userClassReportId) {
        this.userClassReportId = userClassReportId;
    }

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
     * getter트레이너코멘트
     *
     * @return TRAINER_COMMENT - 트레이너코멘트
     */
    public String getTrainerComment() {
        return trainerComment;
    }

    /**
     * setter트레이너코멘트
     *
     * @param trainerComment 트레이너코멘트
     */
    public void setTrainerComment(String trainerComment) {
        this.trainerComment = trainerComment;
    }

    /**
     * getter운동촬영영상경로
     *
     * @return TRAIN_VIDEO - 운동촬영영상경로
     */
    public String getTrainVideo() {
        return trainVideo;
    }

    /**
     * setter운동촬영영상경로
     *
     * @param trainVideo 운동촬영영상경로
     */
    public void setTrainVideo(String trainVideo) {
        this.trainVideo = trainVideo;
    }

    /**
     * getter운동진행여부
     *
     * @return TRAIN_YN - 운동진행여부
     */
    public String getTrainYn() {
        return trainYn;
    }

    /**
     * setter운동진행여부
     *
     * @param trainYn 운동진행여부
     */
    public void setTrainYn(String trainYn) {
        this.trainYn = trainYn;
    }
}