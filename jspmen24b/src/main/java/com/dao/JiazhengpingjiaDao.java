package com.dao;

import com.entity.JiazhengpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhengpingjiaVO;
import com.entity.view.JiazhengpingjiaView;


/**
 * 家政评价
 * 
 * @author 
 * @email 
 * @date 2021-02-23 10:16:20
 */
public interface JiazhengpingjiaDao extends BaseMapper<JiazhengpingjiaEntity> {
	
	List<JiazhengpingjiaVO> selectListVO(@Param("ew") Wrapper<JiazhengpingjiaEntity> wrapper);
	
	JiazhengpingjiaVO selectVO(@Param("ew") Wrapper<JiazhengpingjiaEntity> wrapper);
	
	List<JiazhengpingjiaView> selectListView(@Param("ew") Wrapper<JiazhengpingjiaEntity> wrapper);

	List<JiazhengpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhengpingjiaEntity> wrapper);
	
	JiazhengpingjiaView selectView(@Param("ew") Wrapper<JiazhengpingjiaEntity> wrapper);
	
}
