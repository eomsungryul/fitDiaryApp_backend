package com.dwebss.fitdiary.backend.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_memberships")
public class UserMemberships {
    /**
     * 사용자 헬스장 매핑 ID
     */
    @Id
    @Column(name = "UESR_GYM_ID")
    private Integer uesrGymId;

    /**
     * 사용자회원제코드
     */
    @Column(name = "USER_MEMBERSHIP_CD")
    private Integer userMembershipCd;

    /**
     * 시작일자
     */
    @Column(name = "MEMBERSHIP_START_D")
    private Date membershipStartD;

    /**
     * 종료일자
     */
    @Column(name = "MEMBERSHIP_END_D")
    private Date membershipEndD;

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
     * getter사용자회원제코드
     *
     * @return USER_MEMBERSHIP_CD - 사용자회원제코드
     */
    public Integer getUserMembershipCd() {
        return userMembershipCd;
    }

    /**
     * setter사용자회원제코드
     *
     * @param userMembershipCd 사용자회원제코드
     */
    public void setUserMembershipCd(Integer userMembershipCd) {
        this.userMembershipCd = userMembershipCd;
    }

    /**
     * getter시작일자
     *
     * @return MEMBERSHIP_START_D - 시작일자
     */
    public Date getMembershipStartD() {
        return membershipStartD;
    }

    /**
     * setter시작일자
     *
     * @param membershipStartD 시작일자
     */
    public void setMembershipStartD(Date membershipStartD) {
        this.membershipStartD = membershipStartD;
    }

    /**
     * getter종료일자
     *
     * @return MEMBERSHIP_END_D - 종료일자
     */
    public Date getMembershipEndD() {
        return membershipEndD;
    }

    /**
     * setter종료일자
     *
     * @param membershipEndD 종료일자
     */
    public void setMembershipEndD(Date membershipEndD) {
        this.membershipEndD = membershipEndD;
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