package com.dwebss.fitdiary.backend.model;

import java.util.List;
import java.util.Map;

import javax.persistence.*;

@Table(name = "user_inbody_detail")
public class UserInbodyDetail {
    /**
     * 인바디 수치정보 ID
     */
    @Id
    @Column(name = "INBODY_DETAIL_ID")
    private Integer inbodyDetailId;

    /**
     * 사용자 인바디 기록 ID
     */
    @Column(name = "USER_INBODY_ID")
    private Integer userInbodyId;

    /**
     * 인바디 수치 코드
     */
    @Column(name = "INBODY_CD")
    private Integer inbodyCd;

    /**
     * 인바디 수치 값
     */
    @Column(name = "INBODY_CD_VALUE")
    private Integer inbodyCdValue;
    
    @Transient
    private String codeNm;

    @Transient
    private List<Map<String, Integer>> list;

    public String getCodeNm() {
		return codeNm;
	}

	public void setCodeNm(String codeNm) {
		this.codeNm = codeNm;
	}

	public List<Map<String, Integer>> getList() {
		return list;
	}

	public void setList(List<Map<String, Integer>> list) {
		this.list = list;
	}

	/**
     * getter인바디 수치정보 ID
     *
     * @return INBODY_DETAIL_ID - 인바디 수치정보 ID
     */
    public Integer getInbodyDetailId() {
        return inbodyDetailId;
    }

    /**
     * setter인바디 수치정보 ID
     *
     * @param inbodyDetailId 인바디 수치정보 ID
     */
    public void setInbodyDetailId(Integer inbodyDetailId) {
        this.inbodyDetailId = inbodyDetailId;
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
     * getter인바디 수치 코드
     *
     * @return INBODY_CD - 인바디 수치 코드
     */
    public Integer getInbodyCd() {
        return inbodyCd;
    }

    /**
     * setter인바디 수치 코드
     *
     * @param inbodyCd 인바디 수치 코드
     */
    public void setInbodyCd(Integer inbodyCd) {
        this.inbodyCd = inbodyCd;
    }

    /**
     * getter인바디 수치 값
     *
     * @return INBODY_CD_VALUE - 인바디 수치 값
     */
    public Integer getInbodyCdValue() {
        return inbodyCdValue;
    }

    /**
     * setter인바디 수치 값
     *
     * @param inbodyCdValue 인바디 수치 값
     */
    public void setInbodyCdValue(Integer inbodyCdValue) {
        this.inbodyCdValue = inbodyCdValue;
    }
}