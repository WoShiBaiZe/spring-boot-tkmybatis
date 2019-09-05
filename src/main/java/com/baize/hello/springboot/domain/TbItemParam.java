package com.baize.hello.springboot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_item_param")
public class TbItemParam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ��Ʒ��ĿID
     */
    @Column(name = "item_cat_id")
    private Long itemCatId;

    private Date created;

    private Date updated;

    /**
     * �������ݣ���ʽΪjson��ʽ
     */
    @Column(name = "param_data")
    private String paramData;

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
     * ��ȡ��Ʒ��ĿID
     *
     * @return item_cat_id - ��Ʒ��ĿID
     */
    public Long getItemCatId() {
        return itemCatId;
    }

    /**
     * ������Ʒ��ĿID
     *
     * @param itemCatId ��Ʒ��ĿID
     */
    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
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
     * ��ȡ�������ݣ���ʽΪjson��ʽ
     *
     * @return param_data - �������ݣ���ʽΪjson��ʽ
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * ���ò������ݣ���ʽΪjson��ʽ
     *
     * @param paramData �������ݣ���ʽΪjson��ʽ
     */
    public void setParamData(String paramData) {
        this.paramData = paramData;
    }
}