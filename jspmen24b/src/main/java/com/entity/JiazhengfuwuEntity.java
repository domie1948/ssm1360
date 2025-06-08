package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 家政服务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-23 10:16:20
 */
@TableName("jiazhengfuwu")
public class JiazhengfuwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiazhengfuwuEntity() {
		
	}
	
	public JiazhengfuwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 家政姓名
	 */
					
	private String jiazhengxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 服务类型
	 */
					
	private String fuwuleixing;
	
	/**
	 * 家政类型
	 */
					
	private String jiazhengleixing;
	
	/**
	 * 服务费用
	 */
					
	private Integer fuwufeiyong;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 工作年数
	 */
					
	private Integer gongzuonianshu;
	
	/**
	 * 家政图片
	 */
					
	private String jiazhengtupian;
	
	/**
	 * 个人简介
	 */
					
	private String gerenjianjie;
	
	/**
	 * 工作内容
	 */
					
	private String gongzuoneirong;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：家政姓名
	 */
	public void setJiazhengxingming(String jiazhengxingming) {
		this.jiazhengxingming = jiazhengxingming;
	}
	/**
	 * 获取：家政姓名
	 */
	public String getJiazhengxingming() {
		return jiazhengxingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：服务类型
	 */
	public void setFuwuleixing(String fuwuleixing) {
		this.fuwuleixing = fuwuleixing;
	}
	/**
	 * 获取：服务类型
	 */
	public String getFuwuleixing() {
		return fuwuleixing;
	}
	/**
	 * 设置：家政类型
	 */
	public void setJiazhengleixing(String jiazhengleixing) {
		this.jiazhengleixing = jiazhengleixing;
	}
	/**
	 * 获取：家政类型
	 */
	public String getJiazhengleixing() {
		return jiazhengleixing;
	}
	/**
	 * 设置：服务费用
	 */
	public void setFuwufeiyong(Integer fuwufeiyong) {
		this.fuwufeiyong = fuwufeiyong;
	}
	/**
	 * 获取：服务费用
	 */
	public Integer getFuwufeiyong() {
		return fuwufeiyong;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：工作年数
	 */
	public void setGongzuonianshu(Integer gongzuonianshu) {
		this.gongzuonianshu = gongzuonianshu;
	}
	/**
	 * 获取：工作年数
	 */
	public Integer getGongzuonianshu() {
		return gongzuonianshu;
	}
	/**
	 * 设置：家政图片
	 */
	public void setJiazhengtupian(String jiazhengtupian) {
		this.jiazhengtupian = jiazhengtupian;
	}
	/**
	 * 获取：家政图片
	 */
	public String getJiazhengtupian() {
		return jiazhengtupian;
	}
	/**
	 * 设置：个人简介
	 */
	public void setGerenjianjie(String gerenjianjie) {
		this.gerenjianjie = gerenjianjie;
	}
	/**
	 * 获取：个人简介
	 */
	public String getGerenjianjie() {
		return gerenjianjie;
	}
	/**
	 * 设置：工作内容
	 */
	public void setGongzuoneirong(String gongzuoneirong) {
		this.gongzuoneirong = gongzuoneirong;
	}
	/**
	 * 获取：工作内容
	 */
	public String getGongzuoneirong() {
		return gongzuoneirong;
	}

}
