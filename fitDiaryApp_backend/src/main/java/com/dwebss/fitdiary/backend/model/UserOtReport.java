package com.dwebss.fitdiary.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "user_ot_report")
public class UserOtReport {
    /**
     * 사용자 OT 보고서 ID
     */
    @Id
    @Column(name = "USER_OT_REPORT_ID")
    private Integer userOtReportId;

    /**
     * 사용자 헬스장 매핑 ID
     */
    @Column(name = "USER_GYM_ID")
    private Integer userGymId;

    /**
     * 트레이너 ID
     */
    @Column(name = "TRAINER_ID")
    private Integer trainerId;

    /**
     * OT보고서 입력일시
     */
    @Column(name = "OT_INSERT_DT")
    private Date otInsertDt;

    /**
     * OT보고서 삭제여부
     */
    @Column(name = "OT_DEL_YN")
    private String otDelYn;

    /**
     * 운동촬영영상로컬경로
     */
    @Column(name = "OT_VIDEO_LOCAL")
    private String otVideoLocal;

    /**
     * OT보고서 코멘트
     */
    @Column(name = "OT_COMMENT")
    private String otComment;

    /**
     * 운동촬영영상URL
     */
    @Column(name = "OT_VIDEO_URL")
    private String otVideoUrl;
    

    @Transient
    private Integer userId;
    
    @Transient
    private Integer gymId;
    

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGymId() {
		return gymId;
	}

	public void setGymId(Integer gymId) {
		this.gymId = gymId;
	}

	/**
     * getter사용자 OT 보고서 ID
     *
     * @return USER_OT_REPORT_ID - 사용자 OT 보고서 ID
     */
    public Integer getUserOtReportId() {
        return userOtReportId;
    }

    /**
     * setter사용자 OT 보고서 ID
     *
     * @param userOtReportId 사용자 OT 보고서 ID
     */
    public void setUserOtReportId(Integer userOtReportId) {
        this.userOtReportId = userOtReportId;
    }

    public Integer getUserGymId() {
		return userGymId;
	}

	public void setUserGymId(Integer userGymId) {
		this.userGymId = userGymId;
	}

	/**
     * getter트레이너 ID
     *
     * @return TRAINER_ID - 트레이너 ID
     */
    public Integer getTrainerId() {
        return trainerId;
    }

    /**
     * setter트레이너 ID
     *
     * @param trainerId 트레이너 ID
     */
    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    /**
     * getterOT보고서 입력일시
     *
     * @return OT_INSERT_DT - OT보고서 입력일시
     */
    public Date getOtInsertDt() {
        return otInsertDt;
    }

    /**
     * setterOT보고서 입력일시
     *
     * @param otInsertDt OT보고서 입력일시
     */
    public void setOtInsertDt(Date otInsertDt) {
        this.otInsertDt = otInsertDt;
    }

    /**
     * getterOT보고서 삭제여부
     *
     * @return OT_DEL_YN - OT보고서 삭제여부
     */
    public String getOtDelYn() {
        return otDelYn;
    }

    /**
     * setterOT보고서 삭제여부
     *
     * @param otDelYn OT보고서 삭제여부
     */
    public void setOtDelYn(String otDelYn) {
        this.otDelYn = otDelYn;
    }

    /**
     * getter운동촬영영상로컬경로
     *
     * @return OT_VIDEO_LOCAL - 운동촬영영상로컬경로
     */
    public String getOtVideoLocal() {
        return otVideoLocal;
    }

    /**
     * setter운동촬영영상로컬경로
     *
     * @param otVideoLocal 운동촬영영상로컬경로
     */
    public void setOtVideoLocal(String otVideoLocal) {
        this.otVideoLocal = otVideoLocal;
    }

    /**
     * getterOT보고서 코멘트
     *
     * @return OT_COMMENT - OT보고서 코멘트
     */
    public String getOtComment() {
        return otComment;
    }

    /**
     * setterOT보고서 코멘트
     *
     * @param otComment OT보고서 코멘트
     */
    public void setOtComment(String otComment) {
        this.otComment = otComment;
    }

    /**
     * getter운동촬영영상URL
     *
     * @return OT_VIDEO_URL - 운동촬영영상URL
     */
    public String getOtVideoUrl() {
        return otVideoUrl;
    }

    /**
     * setter운동촬영영상URL
     *
     * @param otVideoUrl 운동촬영영상URL
     */
    public void setOtVideoUrl(String otVideoUrl) {
        this.otVideoUrl = otVideoUrl;
    }
}