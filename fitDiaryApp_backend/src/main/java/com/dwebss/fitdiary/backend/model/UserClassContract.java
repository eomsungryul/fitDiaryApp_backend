package com.dwebss.fitdiary.backend.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_class_contract")
public class UserClassContract {
    /**
     * 강좌계약정보ID
     */
    @Id
    @Column(name = "USER_CLASS_CONTRACT_ID")
    private Integer userClassContractId;

    /**
     * 강좌정보ID
     */
    @Column(name = "CLASS_INFO_ID")
    private Integer classInfoId;

    /**
     * 계약회차
     */
    @Column(name = "CONTRACT_CLASS_TURNS")
    private Integer contractClassTurns;

    /**
     * 계약일자
     */
    @Column(name = "CONTRACT_CLASS_D")
    private Date contractClassD;

    /**
     * 사용자ID
     */
    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * getter강좌계약정보ID
     *
     * @return USER_CLASS_CONTRACT_ID - 강좌계약정보ID
     */
    public Integer getUserClassContractId() {
        return userClassContractId;
    }

    /**
     * setter강좌계약정보ID
     *
     * @param userClassContractId 강좌계약정보ID
     */
    public void setUserClassContractId(Integer userClassContractId) {
        this.userClassContractId = userClassContractId;
    }

    /**
     * getter강좌정보ID
     *
     * @return CLASS_INFO_ID - 강좌정보ID
     */
    public Integer getClassInfoId() {
        return classInfoId;
    }

    /**
     * setter강좌정보ID
     *
     * @param classInfoId 강좌정보ID
     */
    public void setClassInfoId(Integer classInfoId) {
        this.classInfoId = classInfoId;
    }

    /**
     * getter계약회차
     *
     * @return CONTRACT_CLASS_TURNS - 계약회차
     */
    public Integer getContractClassTurns() {
        return contractClassTurns;
    }

    /**
     * setter계약회차
     *
     * @param contractClassTurns 계약회차
     */
    public void setContractClassTurns(Integer contractClassTurns) {
        this.contractClassTurns = contractClassTurns;
    }

    /**
     * getter계약일자
     *
     * @return CONTRACT_CLASS_D - 계약일자
     */
    public Date getContractClassD() {
        return contractClassD;
    }

    /**
     * setter계약일자
     *
     * @param contractClassD 계약일자
     */
    public void setContractClassD(Date contractClassD) {
        this.contractClassD = contractClassD;
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
}