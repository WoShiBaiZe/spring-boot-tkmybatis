package com.baize.hello.springboot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_item")
public class TbItem {
    /**
     * ��Ʒid��ͬʱҲ����Ʒ���
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ��Ʒ����
     */
    private String title;

    /**
     * ��Ʒ����
     */
    @Column(name = "sell_point")
    private String sellPoint;

    /**
     * ��Ʒ�۸񣬵�λΪ����
     */
    private Long price;

    /**
     * �������
     */
    private Integer num;

    /**
     * ��Ʒ������
     */
    private String barcode;

    /**
     * ��ƷͼƬ
     */
    private String image;

    /**
     * ������Ŀ��Ҷ����Ŀ
     */
    private Long cid;

    /**
     * ��Ʒ״̬��1-������2-�¼ܣ�3-ɾ��
     */
    private Byte status;

    /**
     * ����ʱ��
     */
    private Date created;

    /**
     * ����ʱ��
     */
    private Date updated;

    /**
     * ��ȡ��Ʒid��ͬʱҲ����Ʒ���
     *
     * @return id - ��Ʒid��ͬʱҲ����Ʒ���
     */
    public Long getId() {
        return id;
    }

    /**
     * ������Ʒid��ͬʱҲ����Ʒ���
     *
     * @param id ��Ʒid��ͬʱҲ����Ʒ���
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ��Ʒ����
     *
     * @return title - ��Ʒ����
     */
    public String getTitle() {
        return title;
    }

    /**
     * ������Ʒ����
     *
     * @param title ��Ʒ����
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ��ȡ��Ʒ����
     *
     * @return sell_point - ��Ʒ����
     */
    public String getSellPoint() {
        return sellPoint;
    }

    /**
     * ������Ʒ����
     *
     * @param sellPoint ��Ʒ����
     */
    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    /**
     * ��ȡ��Ʒ�۸񣬵�λΪ����
     *
     * @return price - ��Ʒ�۸񣬵�λΪ����
     */
    public Long getPrice() {
        return price;
    }

    /**
     * ������Ʒ�۸񣬵�λΪ����
     *
     * @param price ��Ʒ�۸񣬵�λΪ����
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * ��ȡ�������
     *
     * @return num - �������
     */
    public Integer getNum() {
        return num;
    }

    /**
     * ���ÿ������
     *
     * @param num �������
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * ��ȡ��Ʒ������
     *
     * @return barcode - ��Ʒ������
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * ������Ʒ������
     *
     * @param barcode ��Ʒ������
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * ��ȡ��ƷͼƬ
     *
     * @return image - ��ƷͼƬ
     */
    public String getImage() {
        return image;
    }

    /**
     * ������ƷͼƬ
     *
     * @param image ��ƷͼƬ
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * ��ȡ������Ŀ��Ҷ����Ŀ
     *
     * @return cid - ������Ŀ��Ҷ����Ŀ
     */
    public Long getCid() {
        return cid;
    }

    /**
     * ����������Ŀ��Ҷ����Ŀ
     *
     * @param cid ������Ŀ��Ҷ����Ŀ
     */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /**
     * ��ȡ��Ʒ״̬��1-������2-�¼ܣ�3-ɾ��
     *
     * @return status - ��Ʒ״̬��1-������2-�¼ܣ�3-ɾ��
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * ������Ʒ״̬��1-������2-�¼ܣ�3-ɾ��
     *
     * @param status ��Ʒ״̬��1-������2-�¼ܣ�3-ɾ��
     */
    public void setStatus(Byte status) {
        this.status = status;
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
}