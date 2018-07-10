package com.dwebss.fitdiary.backend.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "exercise_range_sex_goal")
public class ExerciseRangeSexGoal {
    /**
     * 운동목표성별매핑ID
     */
    @Id
    @Column(name = "EXERCISE_GOAL_SEX_ID")
    private Integer exerciseGoalSexId;

    /**
     * 운동목표 코드
     */
    @Column(name = "EXERCISE_GOAL_CD")
    private Integer exerciseGoalCd;

    /**
     * 성별 코드
     */
    @Column(name = "SEX_CD")
    private Integer sexCd;

    /**
     * 유산소 비율
     */
    @Column(name = "CARDIO_RATIO")
    private BigDecimal cardioRatio;

    /**
     * getter운동목표성별매핑ID
     *
     * @return EXERCISE_GOAL_SEX_ID - 운동목표성별매핑ID
     */
    public Integer getExerciseGoalSexId() {
        return exerciseGoalSexId;
    }

    /**
     * setter운동목표성별매핑ID
     *
     * @param exerciseGoalSexId 운동목표성별매핑ID
     */
    public void setExerciseGoalSexId(Integer exerciseGoalSexId) {
        this.exerciseGoalSexId = exerciseGoalSexId;
    }

    /**
     * getter운동목표 코드
     *
     * @return EXERCISE_GOAL_CD - 운동목표 코드
     */
    public Integer getExerciseGoalCd() {
        return exerciseGoalCd;
    }

    /**
     * setter운동목표 코드
     *
     * @param exerciseGoalCd 운동목표 코드
     */
    public void setExerciseGoalCd(Integer exerciseGoalCd) {
        this.exerciseGoalCd = exerciseGoalCd;
    }

    /**
     * getter성별 코드
     *
     * @return SEX_CD - 성별 코드
     */
    public Integer getSexCd() {
        return sexCd;
    }

    /**
     * setter성별 코드
     *
     * @param sexCd 성별 코드
     */
    public void setSexCd(Integer sexCd) {
        this.sexCd = sexCd;
    }

    /**
     * getter유산소 비율
     *
     * @return CARDIO_RATIO - 유산소 비율
     */
    public BigDecimal getCardioRatio() {
        return cardioRatio;
    }

    /**
     * setter유산소 비율
     *
     * @param cardioRatio 유산소 비율
     */
    public void setCardioRatio(BigDecimal cardioRatio) {
        this.cardioRatio = cardioRatio;
    }
}