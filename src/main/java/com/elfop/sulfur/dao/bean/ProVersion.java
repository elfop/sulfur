package com.elfop.sulfur.dao.bean;

import java.util.Date;

public class ProVersion {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_version.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_version.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_version.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_version.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_version.utime
     *
     * @mbg.generated
     */
    private Date utime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_version.id
     *
     * @return the value of pro_version.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_version.id
     *
     * @param id the value for pro_version.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_version.content
     *
     * @return the value of pro_version.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_version.content
     *
     * @param content the value for pro_version.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_version.type
     *
     * @return the value of pro_version.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_version.type
     *
     * @param type the value for pro_version.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_version.ctime
     *
     * @return the value of pro_version.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_version.ctime
     *
     * @param ctime the value for pro_version.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_version.utime
     *
     * @return the value of pro_version.utime
     *
     * @mbg.generated
     */
    public Date getUtime() {
        return utime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_version.utime
     *
     * @param utime the value for pro_version.utime
     *
     * @mbg.generated
     */
    public void setUtime(Date utime) {
        this.utime = utime;
    }
}