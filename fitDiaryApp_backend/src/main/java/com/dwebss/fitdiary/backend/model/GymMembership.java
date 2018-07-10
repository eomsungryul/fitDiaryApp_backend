package com.dwebss.fitdiary.backend.model;

import javax.persistence.*;

@Table(name = "gym_membership")
public class GymMembership {
    /**
     * 회원제강좌매핑ID
     */
    @Id
    @Column(name = "MEMBERSHIP_CLASS_MAPPING_ID")
    private Integer membershipClassMappingId;

    /**
     * 헬스장ID
     */
    @Column(name = "GYM_ID")
    private Integer gymId;

    /**
     * 회원제코드
     */
    @Column(name = "USER_MEMBERSHIP_CD")
    private Integer userMembershipCd;

    /**
     * 강좌구분코드
     */
    @Column(name = "CLASS_CATEGORY_CD")
    private Integer classCategoryCd;

    /**
     * getter회원제강좌매핑ID
     *
     * @return MEMBERSHIP_CLASS_MAPPING_ID - 회원제강좌매핑ID
     */
    public Integer getMembershipClassMappingId() {
        return membershipClassMappingId;
    }

    /**
     * setter회원제강좌매핑ID
     *
     * @param membershipClassMappingId 회원제강좌매핑ID
     */
    public void setMembershipClassMappingId(Integer membershipClassMappingId) {
        this.membershipClassMappingId = membershipClassMappingId;
    }

    /**
     * getter헬스장ID
     *
     * @return GYM_ID - 헬스장ID
     */
    public Integer getGymId() {
        return gymId;
    }

    /**
     * setter헬스장ID
     *
     * @param gymId 헬스장ID
     */
    public void setGymId(Integer gymId) {
        this.gymId = gymId;
    }

    /**
     * getter회원제코드
     *
     * @return USER_MEMBERSHIP_CD - 회원제코드
     */
    public Integer getUserMembershipCd() {
        return userMembershipCd;
    }

    /**
     * setter회원제코드
     *
     * @param userMembershipCd 회원제코드
     */
    public void setUserMembershipCd(Integer userMembershipCd) {
        this.userMembershipCd = userMembershipCd;
    }

    /**
     * getter강좌구분코드
     *
     * @return CLASS_CATEGORY_CD - 강좌구분코드
     */
    public Integer getClassCategoryCd() {
        return classCategoryCd;
    }

    /**
     * setter강좌구분코드
     *
     * @param classCategoryCd 강좌구분코드
     */
    public void setClassCategoryCd(Integer classCategoryCd) {
        this.classCategoryCd = classCategoryCd;
    }
}