package com.entity.model;

import com.entity.JiazhengfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 家政服务
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-23 10:16:20
 */
public class JiazhengfuwuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
