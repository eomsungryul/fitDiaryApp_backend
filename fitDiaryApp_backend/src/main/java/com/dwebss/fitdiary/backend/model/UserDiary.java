package com.dwebss.fitdiary.backend.model;

import java.util.Date;
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
    @Column(name = "SELF_IMAGE_PATH")
    private String selfImagePath;

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

    /**
     * getter사진경로
     *
     * @return SELF_IMAGE_PATH - 사진경로
     */
    public String getSelfImagePath() {
        return selfImagePath;
    }

    /**
     * setter사진경로
     *
     * @param selfImagePath 사진경로
     */
    public void setSelfImagePath(String selfImagePath) {
        this.selfImagePath = selfImagePath;
    }
}