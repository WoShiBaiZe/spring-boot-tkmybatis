package com.baize.hello.springboot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_order")
public class TbOrder {
    /**
     * ����id
     */
    @Id
    @Column(name = "order_id")
    private String orderId;

    /**
     * ʵ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     */
    private String payment;

    /**
     * ֧�����ͣ�1������֧����2����������
     */
    @Column(name = "payment_type")
    private Integer paymentType;

    /**
     * �ʷѡ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     */
    @Column(name = "post_fee")
    private String postFee;

    /**
     * ״̬��1��δ���2���Ѹ��3��δ������4���ѷ�����5�����׳ɹ���6�����׹ر�
     */
    private Integer status;

    /**
     * ��������ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ��������ʱ��
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * ����ʱ��
     */
    @Column(name = "payment_time")
    private Date paymentTime;

    /**
     * ����ʱ��
     */
    @Column(name = "consign_time")
    private Date consignTime;

    /**
     * �������ʱ��
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * ���׹ر�ʱ��
     */
    @Column(name = "close_time")
    private Date closeTime;

    /**
     * ��������
     */
    @Column(name = "shipping_name")
    private String shippingName;

    /**
     * ��������
     */
    @Column(name = "shipping_code")
    private String shippingCode;

    /**
     * �û�id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * �������
     */
    @Column(name = "buyer_message")
    private String buyerMessage;

    /**
     * ����ǳ�
     */
    @Column(name = "buyer_nick")
    private String buyerNick;

    /**
     * ����Ƿ��Ѿ�����
     */
    @Column(name = "buyer_rate")
    private Integer buyerRate;

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
     * ��ȡʵ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     *
     * @return payment - ʵ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     */
    public String getPayment() {
        return payment;
    }

    /**
     * ����ʵ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     *
     * @param payment ʵ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    /**
     * ��ȡ֧�����ͣ�1������֧����2����������
     *
     * @return payment_type - ֧�����ͣ�1������֧����2����������
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * ����֧�����ͣ�1������֧����2����������
     *
     * @param paymentType ֧�����ͣ�1������֧����2����������
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * ��ȡ�ʷѡ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     *
     * @return post_fee - �ʷѡ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     */
    public String getPostFee() {
        return postFee;
    }

    /**
     * �����ʷѡ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     *
     * @param postFee �ʷѡ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     */
    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    /**
     * ��ȡ״̬��1��δ���2���Ѹ��3��δ������4���ѷ�����5�����׳ɹ���6�����׹ر�
     *
     * @return status - ״̬��1��δ���2���Ѹ��3��δ������4���ѷ�����5�����׳ɹ���6�����׹ر�
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ����״̬��1��δ���2���Ѹ��3��δ������4���ѷ�����5�����׳ɹ���6�����׹ر�
     *
     * @param status ״̬��1��δ���2���Ѹ��3��δ������4���ѷ�����5�����׳ɹ���6�����׹ر�
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ��ȡ��������ʱ��
     *
     * @return create_time - ��������ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ö�������ʱ��
     *
     * @param createTime ��������ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ��������ʱ��
     *
     * @return update_time - ��������ʱ��
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * ���ö�������ʱ��
     *
     * @param updateTime ��������ʱ��
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return payment_time - ����ʱ��
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * ���ø���ʱ��
     *
     * @param paymentTime ����ʱ��
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return consign_time - ����ʱ��
     */
    public Date getConsignTime() {
        return consignTime;
    }

    /**
     * ���÷���ʱ��
     *
     * @param consignTime ����ʱ��
     */
    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    /**
     * ��ȡ�������ʱ��
     *
     * @return end_time - �������ʱ��
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * ���ý������ʱ��
     *
     * @param endTime �������ʱ��
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * ��ȡ���׹ر�ʱ��
     *
     * @return close_time - ���׹ر�ʱ��
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * ���ý��׹ر�ʱ��
     *
     * @param closeTime ���׹ر�ʱ��
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * ��ȡ��������
     *
     * @return shipping_name - ��������
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * ������������
     *
     * @param shippingName ��������
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    /**
     * ��ȡ��������
     *
     * @return shipping_code - ��������
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * ������������
     *
     * @param shippingCode ��������
     */
    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    /**
     * ��ȡ�û�id
     *
     * @return user_id - �û�id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * �����û�id
     *
     * @param userId �û�id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ�������
     *
     * @return buyer_message - �������
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * �����������
     *
     * @param buyerMessage �������
     */
    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    /**
     * ��ȡ����ǳ�
     *
     * @return buyer_nick - ����ǳ�
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * ��������ǳ�
     *
     * @param buyerNick ����ǳ�
     */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    /**
     * ��ȡ����Ƿ��Ѿ�����
     *
     * @return buyer_rate - ����Ƿ��Ѿ�����
     */
    public Integer getBuyerRate() {
        return buyerRate;
    }

    /**
     * ��������Ƿ��Ѿ�����
     *
     * @param buyerRate ����Ƿ��Ѿ�����
     */
    public void setBuyerRate(Integer buyerRate) {
        this.buyerRate = buyerRate;
    }
}