package com.baize.hello.springboot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_item_cat")
public class TbItemCat {
    /**
     * ��ĿID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ����ĿID=0ʱ���������һ������Ŀ
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * ��Ŀ����
     */
    private String name;

    /**
     * ״̬����ѡֵ:1(����),2(ɾ��)
     */
    private Integer status;

    /**
     * ������ţ���ʾͬ����Ŀ��չ�ִ�������ֵ��������ƴ������С�ȡֵ��Χ:�����������
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    /**
     * ����Ŀ�Ƿ�Ϊ����Ŀ��1Ϊtrue��0Ϊfalse
     */
    @Column(name = "is_parent")
    private Boolean isParent;

    /**
     * ����ʱ��
     */
    private Date created;

    /**
     * ����ʱ��
     */
    private Date updated;

    /**
     * ��ȡ��ĿID
     *
     * @return id - ��ĿID
     */
    public Long getId() {
        return id;
    }

    /**
     * ������ĿID
     *
     * @param id ��ĿID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ����ĿID=0ʱ���������һ������Ŀ
     *
     * @return parent_id - ����ĿID=0ʱ���������һ������Ŀ
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * ���ø���ĿID=0ʱ���������һ������Ŀ
     *
     * @param parentId ����ĿID=0ʱ���������һ������Ŀ
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * ��ȡ��Ŀ����
     *
     * @return name - ��Ŀ����
     */
    public String getName() {
        return name;
    }

    /**
     * ������Ŀ����
     *
     * @param name ��Ŀ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ״̬����ѡֵ:1(����),2(ɾ��)
     *
     * @return status - ״̬����ѡֵ:1(����),2(ɾ��)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ����״̬����ѡֵ:1(����),2(ɾ��)
     *
     * @param status ״̬����ѡֵ:1(����),2(ɾ��)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ��ȡ������ţ���ʾͬ����Ŀ��չ�ִ�������ֵ��������ƴ������С�ȡֵ��Χ:�����������
     *
     * @return sort_order - ������ţ���ʾͬ����Ŀ��չ�ִ�������ֵ��������ƴ������С�ȡֵ��Χ:�����������
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * ����������ţ���ʾͬ����Ŀ��չ�ִ�������ֵ��������ƴ������С�ȡֵ��Χ:�����������
     *
     * @param sortOrder ������ţ���ʾͬ����Ŀ��չ�ִ�������ֵ��������ƴ������С�ȡֵ��Χ:�����������
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * ��ȡ����Ŀ�Ƿ�Ϊ����Ŀ��1Ϊtrue��0Ϊfalse
     *
     * @return is_parent - ����Ŀ�Ƿ�Ϊ����Ŀ��1Ϊtrue��0Ϊfalse
     */
    public Boolean getIsParent() {
        return isParent;
    }

    /**
     * ���ø���Ŀ�Ƿ�Ϊ����Ŀ��1Ϊtrue��0Ϊfalse
     *
     * @param isParent ����Ŀ�Ƿ�Ϊ����Ŀ��1Ϊtrue��0Ϊfalse
     */
    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return created - ����ʱ��
     */
    public Date getCreated() {
        return created;
    }

    /**
     * ���ô���ʱ��
     *
     * @param created ����ʱ��
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return updated - ����ʱ��
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * ���ô���ʱ��
     *
     * @param updated ����ʱ��
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}