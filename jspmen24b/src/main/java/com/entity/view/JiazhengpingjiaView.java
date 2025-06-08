package com.entity.view;

import com.entity.JiazhengpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家政评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-23 10:16:20
 */
@TableName("jiazhengpingjia")
public class JiazhengpingjiaView  extends JiazhengpingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiazhengpingjiaView(){
	}
 
 	public JiazhengpingjiaView(JiazhengpingjiaEntity jiazhengpingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, jiazhengpingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
