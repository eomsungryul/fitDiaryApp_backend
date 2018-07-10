package com.dwebss.fitdiary.backend.model;

import javax.persistence.*;

@Table(name = "gym_equip_category")
public class GymEquipCategory {
    /**
     * 헬스장기구매핑ID
     */
    @Id
    @Column(name = "GYM_EXERCISE_EQUIP_ID")
    private Integer gymExerciseEquipId;

    /**
     * 헬스장ID
     */
    @Column(name = "GYM_ID")
    private Integer gymId;

    /**
     * 운동기구코드
     */
    @Column(name = "EXERCISE_EQUIP_CD")
    private Integer exerciseEquipCd;

    /**
     * getter헬스장기구매핑ID
     *
     * @return GYM_EXERCISE_EQUIP_ID - 헬스장기구매핑ID
     */
    public Integer getGymExerciseEquipId() {
        return gymExerciseEquipId;
    }

    /**
     * setter헬스장기구매핑ID
     *
     * @param gymExerciseEquipId 헬스장기구매핑ID
     */
    public void setGymExerciseEquipId(Integer gymExerciseEquipId) {
        this.gymExerciseEquipId = gymExerciseEquipId;
    }

    /**
     * getter헬스장ID
     *
     * @return GYM_ID - 헬스장ID
     */
    public Integer getGymId() {
        return gymId;
    }

    /**
     * setter헬스장ID
     *
     * @param gymId 헬스장ID
     */
    public void setGymId(Integer gymId) {
        this.gymId = gymId;
    }

    /**
     * getter운동기구코드
     *
     * @return EXERCISE_EQUIP_CD - 운동기구코드
     */
    public Integer getExerciseEquipCd() {
        return exerciseEquipCd;
    }

    /**
     * setter운동기구코드
     *
     * @param exerciseEquipCd 운동기구코드
     */
    public void setExerciseEquipCd(Integer exerciseEquipCd) {
        this.exerciseEquipCd = exerciseEquipCd;
    }
}