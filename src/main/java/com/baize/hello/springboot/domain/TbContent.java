package com.baize.hello.springboot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_content")
public class TbContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ������ĿID
     */
    @Column(name = "category_id")
    private Long categoryId;

    /**
     * ���ݱ���
     */
    private String title;

    /**
     * �ӱ���
     */
    @Column(name = "sub_title")
    private String subTitle;

    /**
     * ��������
     */
    @Column(name = "title_desc")
    private String titleDesc;

    /**
     * ����
     */
    private String url;

    /**
     * ͼƬ����·��
     */
    private String pic;

    /**
     * ͼƬ2
     */
    private String pic2;

    private Date created;

    private Date updated;

    /**
     * ����
     */
    private String content;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ������ĿID
     *
     * @return category_id - ������ĿID
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * ����������ĿID
     *
     * @param categoryId ������ĿID
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * ��ȡ���ݱ���
     *
     * @return title - ���ݱ���
     */
    public String getTitle() {
        return title;
    }

    /**
     * �������ݱ���
     *
     * @param title ���ݱ���
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ��ȡ�ӱ���
     *
     * @return sub_title - �ӱ���
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * �����ӱ���
     *
     * @param subTitle �ӱ���
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * ��ȡ��������
     *
     * @return title_desc - ��������
     */
    public String getTitleDesc() {
        return titleDesc;
    }

    /**
     * ���ñ�������
     *
     * @param titleDesc ��������
     */
    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc;
    }

    /**
     * ��ȡ����
     *
     * @return url - ����
     */
    public String getUrl() {
        return url;
    }

    /**
     * ��������
     *
     * @param url ����
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * ��ȡͼƬ����·��
     *
     * @return pic - ͼƬ����·��
     */
    public String getPic() {
        return pic;
    }

    /**
     * ����ͼƬ����·��
     *
     * @param pic ͼƬ����·��
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * ��ȡͼƬ2
     *
     * @return pic2 - ͼƬ2
     */
    public String getPic2() {
        return pic2;
    }

    /**
     * ����ͼƬ2
     *
     * @param pic2 ͼƬ2
     */
    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * @param updated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * ��ȡ����
     *
     * @return content - ����
     */
    public String getContent() {
        return content;
    }

    /**
     * ��������
     *
     * @param content ����
     */
    public void setContent(String content) {
        this.content = content;
    }
}