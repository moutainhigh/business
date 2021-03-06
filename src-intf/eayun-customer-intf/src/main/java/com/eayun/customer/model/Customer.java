package com.eayun.customer.model;

import java.math.BigDecimal;
import java.util.Date;

// Generated 2015-9-8 19:22:59 by Hibernate Tools 3.4.0.CR1


/**
 * SysSelfcustomer generated by hbm2java
 * 客户扩展类
 */
public class Customer extends BaseCustomer {

	private static final long serialVersionUID = -6791842976507178893L;
	private String cusFalgName;//审核状态名称
	private String cusSexName;//性别名称
	private String parUserName;//商务人员名称
	private String teleCode ;//手机验证码
	private String imageCode;//图片验证码
	private String custypefag;//客户类型标示
	
	
	public String getCustypefag() {
		return custypefag;
	}
	public void setCustypefag(String custypefag) {
		this.custypefag = custypefag;
	}
	/**
	 * 项目数量、告警数量、超级管理员账号
	 * @author zengbo
	 */
	private int prjCount;//项目数量
	private int alarmCount;//告警数量
	private String adminAccount; //超级管理员账号
	
	/**
	 * 客户订单总量和待处理量
	 * @author zengbo
	 */
	private int workorderNum; //工单总量
	private int undealWorkorderNum; //待处理工单量
	
	/**
	 * 账户余额
	 * @author zengbo
	 */
	private BigDecimal balance;
	
	/**
	 * 即将到期资源数
	 * @author zengbo
	 */
	private int expireResourceNum;

	/**
	 *Comment for <code>workorderNo</code>
	 *注册工单编号
	 *@author zengbo
	 */
	private String workorderNo;
	
	/**
	 *Comment for <code>workorderCreateTime</code>
	 *注册工单生成时间
	 *@author zengbo
	 */
	private Date workorderCreateTime;
	
	
	public String getAdminAccount() {
		return adminAccount;
	}
	public void setAdminAccount(String adminAccount) {
		this.adminAccount = adminAccount;
	}
	public int getAlarmCount() {
		return alarmCount;
	}
	public void setAlarmCount(int alarmCount) {
		this.alarmCount = alarmCount;
	}
	public int getPrjCount() {
		return prjCount;
	}
	public void setPrjCount(int prjCount) {
		this.prjCount = prjCount;
	}
	public String getCusFalgName() {
		return cusFalgName;
	}
	public void setCusFalgName(String cusFalgName) {
		this.cusFalgName = cusFalgName;
	}
	public String getCusSexName() {
		return cusSexName;
	}
	public void setCusSexName(String cusSexName) {
		this.cusSexName = cusSexName;
	}
	public String getParUserName() {
		return parUserName;
	}
	public void setParUserName(String parUserName) {
		this.parUserName = parUserName;
	}
	public String getTeleCode() {
		return teleCode;
	}
	public void setTeleCode(String teleCode) {
		this.teleCode = teleCode;
	}
	public String getImageCode() {
		return imageCode;
	}
	public void setImageCode(String imageCode) {
		this.imageCode = imageCode;
	}
	public int getWorkorderNum() {
		return workorderNum;
	}
	public void setWorkorderNum(int workorderNum) {
		this.workorderNum = workorderNum;
	}
	public int getUndealWorkorderNum() {
		return undealWorkorderNum;
	}
	public void setUndealWorkorderNum(int undealWorkorderNum) {
		this.undealWorkorderNum = undealWorkorderNum;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public String getWorkorderNo() {
		return workorderNo;
	}
	public void setWorkorderNo(String workorderNo) {
		this.workorderNo = workorderNo;
	}
	public Date getWorkorderCreateTime() {
		return workorderCreateTime;
	}
	public void setWorkorderCreateTime(Date workorderCreateTime) {
		this.workorderCreateTime = workorderCreateTime;
	}
	
	
	public int getExpireResourceNum() {
		return expireResourceNum;
	}
	public void setExpireResourceNum(int expireResourceNum) {
		this.expireResourceNum = expireResourceNum;
	}
}
