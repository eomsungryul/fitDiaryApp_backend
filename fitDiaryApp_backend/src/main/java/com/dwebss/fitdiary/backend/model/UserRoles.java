package com.dwebss.fitdiary.backend.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_roles")
public class UserRoles {
    /**
     * 사용자 헬스장 매핑 ID
     */
    @Id
    @Column(name = "UESR_GYM_ID")
    private Integer uesrGymId;

    /**
     * 사용자유형코드
     */
    @Column(name = "USER_ROLE_CD")
    private Integer userRoleCd;

    /**
     * 시작일자
     */
    @Column(name = "ROLE_START_D")
    private Date roleStartD;

    /**
     * 종료일자
     */
    @Column(name = "ROLE_END_D")
    private Date roleEndD;

    /**
     * 활성화여부
     */
    @Column(name = "ACTIVE_YN")
    private String activeYn;

    /**
     * getter사용자 헬스장 매핑 ID
     *
     * @return UESR_GYM_ID - 사용자 헬스장 매핑 ID
     */
    public Integer getUesrGymId() {
        return uesrGymId;
    }

    /**
     * setter사용자 헬스장 매핑 ID
     *
     * @param uesrGymId 사용자 헬스장 매핑 ID
     */
    public void setUesrGymId(Integer uesrGymId) {
        this.uesrGymId = uesrGymId;
    }

    /**
     * getter사용자유형코드
     *
     * @return USER_ROLE_CD - 사용자유형코드
     */
    public Integer getUserRoleCd() {
        return userRoleCd;
    }

    /**
     * setter사용자유형코드
     *
     * @param userRoleCd 사용자유형코드
     */
    public void setUserRoleCd(Integer userRoleCd) {
        this.userRoleCd = userRoleCd;
    }

    /**
     * getter시작일자
     *
     * @return ROLE_START_D - 시작일자
     */
    public Date getRoleStartD() {
        return roleStartD;
    }

    /**
     * setter시작일자
     *
     * @param roleStartD 시작일자
     */
    public void setRoleStartD(Date roleStartD) {
        this.roleStartD = roleStartD;
    }

    /**
     * getter종료일자
     *
     * @return ROLE_END_D - 종료일자
     */
    public Date getRoleEndD() {
        return roleEndD;
    }

    /**
     * setter종료일자
     *
     * @param roleEndD 종료일자
     */
    public void setRoleEndD(Date roleEndD) {
        this.roleEndD = roleEndD;
    }

    /**
     * getter활성화여부
     *
     * @return ACTIVE_YN - 활성화여부
     */
    public String getActiveYn() {
        return activeYn;
    }

    /**
     * setter활성화여부
     *
     * @param activeYn 활성화여부
     */
    public void setActiveYn(String activeYn) {
        this.activeYn = activeYn;
    }
}