package com.dwebss.fitdiary.backend.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Table(name = "user_diary")
public class UserDiary {
    /**
     * 사용자 일일 다이어리ID
     */
    @Id
    @Column(name = "USER_DIARY_ID")
    private Integer userDiaryId;

    /**
     * 사용자ID
     */
    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * 다이어리 작성일자
     */
    @Column(name = "DAIRY_WRITE_D")
    private Date dairyWriteD;

    /**
     * 다이어리 내용(일기)
     */
    @Column(name = "DIARY_CONTENT")
    private String diaryContent;

    /**
     * 사진경로
     */
    @Column(name = "SELF_IMAGE_LOCAL")
    private String selfImageLocal;
    
    /**
     * 사진경로
     */
    @Column(name = "SELF_IMAGE_URL")
    private String selfImageUrl;

    @Transient
    private String exerciseSuccessYn;

    @Transient
    private String exerciseOrder;
    
    @Transient
    private String exerciseNm;
    
    @Transient
    private String exerciseDesc;
    
    @Transient
    private Integer exerciseEquipCd;
    
    @Transient
    private Integer exerciseRangeCd;
    
    @Transient
    private Date startDate;

    @Transient
    private Date endDate;

    @Transient
    private List<UserDiaryExerciseCourse> userDiaryExerciseCourse;
    
    @Transient
    private List<UserInbodyDetail> userInbodyDetail;

    public List<UserDiaryExerciseCourse> getUserDiaryExerciseCourse() {
		return userDiaryExerciseCourse;
	}

	public void setUserDiaryExerciseCourse(List<UserDiaryExerciseCourse> userDiaryExerciseCourse) {
		this.userDiaryExerciseCourse = userDiaryExerciseCourse;
	}

	public List<UserInbodyDetail> getUserInbodyDetail() {
		return userInbodyDetail;
	}

	public void setUserInbodyDetail(List<UserInbodyDetail> userInbodyDetail) {
		this.userInbodyDetail = userInbodyDetail;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getExerciseRangeCd() {
		return exerciseRangeCd;
	}

	public void setExerciseRangeCd(Integer exerciseRangeCd) {
		this.exerciseRangeCd = exerciseRangeCd;
	}

	public String getExerciseSuccessYn() {
		return exerciseSuccessYn;
	}

	public void setExerciseSuccessYn(String exerciseSuccessYn) {
		this.exerciseSuccessYn = exerciseSuccessYn;
	}

	public String getExerciseOrder() {
		return exerciseOrder;
	}

	public void setExerciseOrder(String exerciseOrder) {
		this.exerciseOrder = exerciseOrder;
	}

	public String getExerciseNm() {
		return exerciseNm;
	}

	public void setExerciseNm(String exerciseNm) {
		this.exerciseNm = exerciseNm;
	}

	public String getExerciseDesc() {
		return exerciseDesc;
	}

	public void setExerciseDesc(String exerciseDesc) {
		this.exerciseDesc = exerciseDesc;
	}

	public Integer getExerciseEquipCd() {
		return exerciseEquipCd;
	}

	public void setExerciseEquipCd(Integer exerciseEquipCd) {
		this.exerciseEquipCd = exerciseEquipCd;
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

    /**
     * getter다이어리 작성일자
     *
     * @return DAIRY_WRITE_D - 다이어리 작성일자
     */
    public Date getDairyWriteD() {
        return dairyWriteD;
    }

    /**
     * setter다이어리 작성일자
     *
     * @param dairyWriteD 다이어리 작성일자
     */
    public void setDairyWriteD(Date dairyWriteD) {
        this.dairyWriteD = dairyWriteD;
    }

    /**
     * getter다이어리 내용(일기)
     *
     * @return DIARY_CONTENT - 다이어리 내용(일기)
     */
    public String getDiaryContent() {
        return diaryContent;
    }

    /**
     * setter다이어리 내용(일기)
     *
     * @param diaryContent 다이어리 내용(일기)
     */
    public void setDiaryContent(String diaryContent) {
        this.diaryContent = diaryContent;
    }

	public String getSelfImageLocal() {
		return selfImageLocal;
	}

	public void setSelfImageLocal(String selfImageLocal) {
		this.selfImageLocal = selfImageLocal;
	}

	public String getSelfImageUrl() {
		return selfImageUrl;
	}

	public void setSelfImageUrl(String selfImageUrl) {
		this.selfImageUrl = selfImageUrl;
	}
    
}