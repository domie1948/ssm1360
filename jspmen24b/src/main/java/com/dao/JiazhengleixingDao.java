package com.dao;

import com.entity.JiazhengleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhengleixingVO;
import com.entity.view.JiazhengleixingView;


/**
 * 家政类型
 * 
 * @author 
 * @email 
 * @date 2021-02-23 10:16:19
 */
public interface JiazhengleixingDao extends BaseMapper<JiazhengleixingEntity> {
	
	List<JiazhengleixingVO> selectListVO(@Param("ew") Wrapper<JiazhengleixingEntity> wrapper);
	
	JiazhengleixingVO selectVO(@Param("ew") Wrapper<JiazhengleixingEntity> wrapper);
	
	List<JiazhengleixingView> selectListView(@Param("ew") Wrapper<JiazhengleixingEntity> wrapper);

	List<JiazhengleixingView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhengleixingEntity> wrapper);
	
	JiazhengleixingView selectView(@Param("ew") Wrapper<JiazhengleixingEntity> wrapper);
	
}
