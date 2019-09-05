package com.baize.hello.springboot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_order_shipping")
public class TbOrderShipping {
    /**
     * ����ID
     */
    @Id
    @Column(name = "order_id")
    private String orderId;

    /**
     * �ջ���ȫ��
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * �̶��绰
     */
    @Column(name = "receiver_phone")
    private String receiverPhone;

    /**
     * �ƶ��绰
     */
    @Column(name = "receiver_mobile")
    private String receiverMobile;

    /**
     * ʡ��
     */
    @Column(name = "receiver_state")
    private String receiverState;

    /**
     * ����
     */
    @Column(name = "receiver_city")
    private String receiverCity;

    /**
     * ��/��
     */
    @Column(name = "receiver_district")
    private String receiverDistrict;

    /**
     * �ջ���ַ���磺xx·xx��
     */
    @Column(name = "receiver_address")
    private String receiverAddress;

    /**
     * ��������,�磺310001
     */
    @Column(name = "receiver_zip")
    private String receiverZip;

    private Date created;

    private Date updated;

    /**
     * ��ȡ����ID
     *
     * @return order_id - ����ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * ���ö���ID
     *
     * @param orderId ����ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * ��ȡ�ջ���ȫ��
     *
     * @return receiver_name - �ջ���ȫ��
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * �����ջ���ȫ��
     *
     * @param receiverName �ջ���ȫ��
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * ��ȡ�̶��绰
     *
     * @return receiver_phone - �̶��绰
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * ���ù̶��绰
     *
     * @param receiverPhone �̶��绰
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    /**
     * ��ȡ�ƶ��绰
     *
     * @return receiver_mobile - �ƶ��绰
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * �����ƶ��绰
     *
     * @param receiverMobile �ƶ��绰
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * ��ȡʡ��
     *
     * @return receiver_state - ʡ��
     */
    public String getReceiverState() {
        return receiverState;
    }

    /**
     * ����ʡ��
     *
     * @param receiverState ʡ��
     */
    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    /**
     * ��ȡ����
     *
     * @return receiver_city - ����
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * ���ó���
     *
     * @param receiverCity ����
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    /**
     * ��ȡ��/��
     *
     * @return receiver_district - ��/��
     */
    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    /**
     * ������/��
     *
     * @param receiverDistrict ��/��
     */
    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    /**
     * ��ȡ�ջ���ַ���磺xx·xx��
     *
     * @return receiver_address - �ջ���ַ���磺xx·xx��
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * �����ջ���ַ���磺xx·xx��
     *
     * @param receiverAddress �ջ���ַ���磺xx·xx��
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    /**
     * ��ȡ��������,�磺310001
     *
     * @return receiver_zip - ��������,�磺310001
     */
    public String getReceiverZip() {
        return receiverZip;
    }

    /**
     * ������������,�磺310001
     *
     * @param receiverZip ��������,�磺310001
     */
    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
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
}