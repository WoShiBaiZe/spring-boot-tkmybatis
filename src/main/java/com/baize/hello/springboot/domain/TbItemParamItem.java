package com.baize.hello.springboot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_item_param_item")
public class TbItemParamItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ��ƷID
     */
    @Column(name = "item_id")
    private Long itemId;

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