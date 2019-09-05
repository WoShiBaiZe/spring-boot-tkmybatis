package com.baize.hello.springboot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_item_desc")
public class TbItemDesc {
    /**
     * ��ƷID
     */
    @Id
    @Column(name = "item_id")
    private Long itemId;

    /**
     * ����ʱ��
     */
    private Date created;

    /**
     * ����ʱ��
     */
    private Date updated;

    /**
     * ��Ʒ����
     */
    @Column(name = "item_desc")
    private String itemDesc;

    /**
     * ��ȡ��ƷID
     *
     * @return item_id - ��ƷID
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * ������ƷID
     *
     * @param itemId ��ƷID
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
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
     * ���ø���ʱ��
     *
     * @param updated ����ʱ��
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * ��ȡ��Ʒ����
     *
     * @return item_desc - ��Ʒ����
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * ������Ʒ����
     *
     * @param itemDesc ��Ʒ����
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}