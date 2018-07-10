package com.dwebss.fitdiary.backend.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "message_log")
public class MessageLog {
    /**
     * 메세지ID
     */
    @Id
    @Column(name = "MESSAGE_ID")
    private Integer messageId;

    /**
     * 제목
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * 내용
     */
    @Column(name = "CONTENT")
    private String content;

    /**
     * 전송성공여부
     */
    @Column(name = "SEND_YN")
    private String sendYn;

    /**
     * 전송일자
     */
    @Column(name = "SEND_D")
    private Date sendD;

    /**
     * 전송일시
     */
    @Column(name = "SEND_T")
    private Integer sendT;

    /**
     * 전송자ID
     */
    @Column(name = "RECEIVER_ID")
    private Integer receiverId;

    /**
     * 수신자ID
     */
    @Column(name = "SENDER_ID")
    private Integer senderId;

    /**
     * getter메세지ID
     *
     * @return MESSAGE_ID - 메세지ID
     */
    public Integer getMessageId() {
        return messageId;
    }

    /**
     * setter메세지ID
     *
     * @param messageId 메세지ID
     */
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    /**
     * getter제목
     *
     * @return TITLE - 제목
     */
    public String getTitle() {
        return title;
    }

    /**
     * setter제목
     *
     * @param title 제목
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * getter내용
     *
     * @return CONTENT - 내용
     */
    public String getContent() {
        return content;
    }

    /**
     * setter내용
     *
     * @param content 내용
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * getter전송성공여부
     *
     * @return SEND_YN - 전송성공여부
     */
    public String getSendYn() {
        return sendYn;
    }

    /**
     * setter전송성공여부
     *
     * @param sendYn 전송성공여부
     */
    public void setSendYn(String sendYn) {
        this.sendYn = sendYn;
    }

    /**
     * getter전송일자
     *
     * @return SEND_D - 전송일자
     */
    public Date getSendD() {
        return sendD;
    }

    /**
     * setter전송일자
     *
     * @param sendD 전송일자
     */
    public void setSendD(Date sendD) {
        this.sendD = sendD;
    }

    /**
     * getter전송일시
     *
     * @return SEND_T - 전송일시
     */
    public Integer getSendT() {
        return sendT;
    }

    /**
     * setter전송일시
     *
     * @param sendT 전송일시
     */
    public void setSendT(Integer sendT) {
        this.sendT = sendT;
    }

    /**
     * getter전송자ID
     *
     * @return RECEIVER_ID - 전송자ID
     */
    public Integer getReceiverId() {
        return receiverId;
    }

    /**
     * setter전송자ID
     *
     * @param receiverId 전송자ID
     */
    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * getter수신자ID
     *
     * @return SENDER_ID - 수신자ID
     */
    public Integer getSenderId() {
        return senderId;
    }

    /**
     * setter수신자ID
     *
     * @param senderId 수신자ID
     */
    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }
}