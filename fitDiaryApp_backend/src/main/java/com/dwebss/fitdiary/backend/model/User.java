package com.dwebss.fitdiary.backend.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;


@Table(name = "user")
public class User {
    /**
     * 사용자ID
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * 사용자로그인ID
     */
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;

    /**
     * 사용자패스워드
     */
    @Column(name = "USER_PASSWORD")
    private String userPassword;

    /**
     * 사용자이름
     */
    @Column(name = "USER_NM")
    private String userNm;

    /**
     * 키
     */
    @Column(name = "USER_HEIGHT")
    private BigDecimal userHeight;

    /**
     * 몸무게
     */
    @Column(name = "USER_WEIGHT")
    private BigDecimal userWeight;

    /**
     * 핸드폰번호
     */
    @Column(name = "USER_PHONE")
    private String userPhone;

    /**
     * 권한타입
     */
    @Column(name = "AUTH_CD")
    private Integer authCd;

    /**
     * 성별
     */
    @Column(name = "USER_SEX")
    private String userSex;

    /**
     * 사용자이메일
     */
    @Column(name = "USER_EMAIL")
    private String userEmail;
    
    @Transient
    private List<UserGym> userGymList;

    @Transient
    private List<UserExerciseRange> userExerciseRangeList;
    
	public List<UserExerciseRange> getUserExerciseRangeList() {
		return userExerciseRangeList;
	}

	public void setUserExerciseRangeList(List<UserExerciseRange> userExerciseRangeList) {
		this.userExerciseRangeList = userExerciseRangeList;
	}

	public List<UserGym> getUserGymList() {
		return userGymList;
	}

	public void setUserGymList(List<UserGym> userGymList) {
		this.userGymList = userGymList;
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
     * getter사용자로그인ID
     *
     * @return USER_LOGIN_ID - 사용자로그인ID
     */
    public String getUserLoginId() {
        return userLoginId;
    }

    /**
     * setter사용자로그인ID
     *
     * @param userLoginId 사용자로그인ID
     */
    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    /**
     * getter사용자패스워드
     *
     * @return USER_PASSWORD - 사용자패스워드
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * setter사용자패스워드
     *
     * @param userPassword 사용자패스워드
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * getter사용자이름
     *
     * @return USER_NM - 사용자이름
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * setter사용자이름
     *
     * @param userNm 사용자이름
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    /**
     * getter키
     *
     * @return USER_HEIGHT - 키
     */
    public BigDecimal getUserHeight() {
        return userHeight;
    }

    /**
     * setter키
     *
     * @param userHeight 키
     */
    public void setUserHeight(BigDecimal userHeight) {
        this.userHeight = userHeight;
    }

    /**
     * getter몸무게
     *
     * @return USER_WEIGHT - 몸무게
     */
    public BigDecimal getUserWeight() {
        return userWeight;
    }

    /**
     * setter몸무게
     *
     * @param userWeight 몸무게
     */
    public void setUserWeight(BigDecimal userWeight) {
        this.userWeight = userWeight;
    }

    /**
     * getter핸드폰번호
     *
     * @return USER_PHONE - 핸드폰번호
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * setter핸드폰번호
     *
     * @param userPhone 핸드폰번호
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * getter권한타입
     *
     * @return AUTH_CD - 권한타입
     */
    public Integer getAuthCd() {
        return authCd;
    }

    /**
     * setter권한타입
     *
     * @param authCd 권한타입
     */
    public void setAuthCd(Integer authCd) {
        this.authCd = authCd;
    }

    /**
     * getter성별
     *
     * @return USER_SEX - 성별
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * setter성별
     *
     * @param userSex 성별
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * getter사용자이메일
     *
     * @return USER_EMAIL - 사용자이메일
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * setter사용자이메일
     *
     * @param userEmail 사용자이메일
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}