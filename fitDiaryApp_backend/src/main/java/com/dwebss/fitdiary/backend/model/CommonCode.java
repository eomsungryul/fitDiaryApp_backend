package com.dwebss.fitdiary.backend.model;

import javax.persistence.*;

@Table(name = "common_code")
public class CommonCode {
    /**
     * 코드
     */
    @Id
    @Column(name = "CODE")
    private Integer code;

    /**
     * 코드카테고리
     */
    @Column(name = "CODE_CATEGORY")
    private String codeCategory;

    /**
     * 코드값
     */
    @Column(name = "CODE_VALUE")
    private String codeValue;

    /**
     * 코드설명
     */
    @Column(name = "CODE_DESC")
    private String codeDesc;

    /**
     * getter코드
     *
     * @return CODE - 코드
     */
    public Integer getCode() {
        return code;
    }

    /**
     * setter코드
     *
     * @param code 코드
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * getter코드카테고리
     *
     * @return CODE_CATEGORY - 코드카테고리
     */
    public String getCodeCategory() {
        return codeCategory;
    }

    /**
     * setter코드카테고리
     *
     * @param codeCategory 코드카테고리
     */
    public void setCodeCategory(String codeCategory) {
        this.codeCategory = codeCategory;
    }

    /**
     * getter코드값
     *
     * @return CODE_VALUE - 코드값
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * setter코드값
     *
     * @param codeValue 코드값
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    /**
     * getter코드설명
     *
     * @return CODE_DESC - 코드설명
     */
    public String getCodeDesc() {
        return codeDesc;
    }

    /**
     * setter코드설명
     *
     * @param codeDesc 코드설명
     */
    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }
}