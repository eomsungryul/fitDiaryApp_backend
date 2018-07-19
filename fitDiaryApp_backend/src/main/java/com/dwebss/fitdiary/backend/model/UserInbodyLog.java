package com.dwebss.fitdiary.backend.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.*;

@Table(name = "user_inbody_log")
public class UserInbodyLog {
    /**
     * 사용자 인바디 기록 ID
     */
    @Id
    @Column(name = "USER_INBODY_ID")
    private Integer userInbodyId;

    /**
     * 사용자ID
     */
    @Column(name = "USER_ID")
    private Integer userId;
    
    /**
     * 헬스장ID
     */
    @Column(name = "GYM_ID")
    private Integer gymId;

    /**
     * 인바디 이미지 등록 일시
     */
    @Column(name = "USER_INBODY_LOG_INSERT_DT")
    private Date userInbodyLogInsertDt;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    private String delYn;

    /**
     * 인바디이미지 경로
     */
    @Column(name = "INBODY_URL")
    private String inbodyUrl;

    /**
     * 테서렉트 변환요청 ID
     */
    @Column(name = "CONVERT_ID")
    private Integer convertId;

    /**
     * 테서렉트 변환완료여부
     */
    @Column(name = "CONVERT_YN")
    private String convertYn;
    
    @Transient
    private List<Map<String, Integer>> list;
    
    

    public List<Map<String, Integer>> getList() {
		return list;
	}

	public void setList(List<Map<String, Integer>> list) {
		this.list = list;
	}

	/**
     * getter사용자 인바디 기록 ID
     *
     * @return USER_INBODY_ID - 사용자 인바디 기록 ID
     */
    public Integer getUserInbodyId() {
        return userInbodyId;
    }

    /**
     * setter사용자 인바디 기록 ID
     *
     * @param userInbodyId 사용자 인바디 기록 ID
     */
    public void setUserInbodyId(Integer userInbodyId) {
        this.userInbodyId = userInbodyId;
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
     * getter인바디 이미지 등록 일시
     *
     * @return USER_INBODY_LOG_INSERT_DT - 인바디 이미지 등록 일시
     */
    public Date getUserInbodyLogInsertDt() {
        return userInbodyLogInsertDt;
    }

    /**
     * setter인바디 이미지 등록 일시
     *
     * @param userInbodyLogInsertDt 인바디 이미지 등록 일시
     */
    public void setUserInbodyLogInsertDt(Date userInbodyLogInsertDt) {
        this.userInbodyLogInsertDt = userInbodyLogInsertDt;
    }

    /**
     * getter삭제여부
     *
     * @return DEL_YN - 삭제여부
     */
    public String getDelYn() {
        return delYn;
    }

    /**
     * setter삭제여부
     *
     * @param delYn 삭제여부
     */
    public void setDelYn(String delYn) {
        this.delYn = delYn;
    }

    /**
     * getter인바디이미지 경로
     *
     * @return INBODY_URL - 인바디이미지 경로
     */
    public String getInbodyUrl() {
        return inbodyUrl;
    }

    /**
     * setter인바디이미지 경로
     *
     * @param inbodyUrl 인바디이미지 경로
     */
    public void setInbodyUrl(String inbodyUrl) {
        this.inbodyUrl = inbodyUrl;
    }

    /**
     * getter테서렉트 변환요청 ID
     *
     * @return CONVERT_ID - 테서렉트 변환요청 ID
     */
    public Integer getConvertId() {
        return convertId;
    }

    /**
     * setter테서렉트 변환요청 ID
     *
     * @param convertId 테서렉트 변환요청 ID
     */
    public void setConvertId(Integer convertId) {
        this.convertId = convertId;
    }

    /**
     * getter테서렉트 변환완료여부
     *
     * @return CONVERT_YN - 테서렉트 변환완료여부
     */
    public String getConvertYn() {
        return convertYn;
    }

    /**
     * setter테서렉트 변환완료여부
     *
     * @param convertYn 테서렉트 변환완료여부
     */
    public void setConvertYn(String convertYn) {
        this.convertYn = convertYn;
    }

	public Integer getGymId() {
		return gymId;
	}

	public void setGymId(Integer gymId) {
		this.gymId = gymId;
	}
    
}