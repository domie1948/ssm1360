package com.entity.view;

import com.entity.JiazhengleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家政类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-23 10:16:19
 */
@TableName("jiazhengleixing")
public class JiazhengleixingView  extends JiazhengleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiazhengleixingView(){
	}
 
 	public JiazhengleixingView(JiazhengleixingEntity jiazhengleixingEntity){
 	try {
			BeanUtils.copyProperties(this, jiazhengleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
