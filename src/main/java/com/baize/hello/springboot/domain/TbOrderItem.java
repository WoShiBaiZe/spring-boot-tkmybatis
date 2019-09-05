package com.baize.hello.springboot.domain;

import javax.persistence.*;

@Table(name = "tb_order_item")
public class TbOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * ��Ʒid
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * ����id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * ��Ʒ��������
     */
    private Integer num;

    /**
     * ��Ʒ����
     */
    private String title;

    /**
     * ��Ʒ����
     */
    private Long price;

    /**
     * ��Ʒ�ܽ��
     */
    @Column(name = "total_fee")
    private Long totalFee;

    /**
     * ��ƷͼƬ��ַ
     */
    @Column(name = "pic_path")
    private String picPath;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ȡ��Ʒid
     *
     * @return item_id - ��Ʒid
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * ������Ʒid
     *
     * @param itemId ��Ʒid
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * ��ȡ����id
     *
     * @return order_id - ����id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * ���ö���id
     *
     * @param orderId ����id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * ��ȡ��Ʒ��������
     *
     * @return num - ��Ʒ��������
     */
    public Integer getNum() {
        return num;
    }

    /**
     * ������Ʒ��������
     *
     * @param num ��Ʒ��������
     */
    public void setNum(Integer num) {
        this.num = num;
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
     * @return price - ��Ʒ����
     */
    public Long getPrice() {
        return price;
    }

    /**
     * ������Ʒ����
     *
     * @param price ��Ʒ����
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * ��ȡ��Ʒ�ܽ��
     *
     * @return total_fee - ��Ʒ�ܽ��
     */
    public Long getTotalFee() {
        return totalFee;
    }

    /**
     * ������Ʒ�ܽ��
     *
     * @param totalFee ��Ʒ�ܽ��
     */
    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * ��ȡ��ƷͼƬ��ַ
     *
     * @return pic_path - ��ƷͼƬ��ַ
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * ������ƷͼƬ��ַ
     *
     * @param picPath ��ƷͼƬ��ַ
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}