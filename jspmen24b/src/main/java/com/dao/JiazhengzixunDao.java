package com.dao;

import com.entity.JiazhengzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhengzixunVO;
import com.entity.view.JiazhengzixunView;


/**
 * 家政资讯
 * 
 * @author 
 * @email 
 * @date 2021-02-23 10:16:20
 */
public interface JiazhengzixunDao extends BaseMapper<JiazhengzixunEntity> {
	
	List<JiazhengzixunVO> selectListVO(@Param("ew") Wrapper<JiazhengzixunEntity> wrapper);
	
	JiazhengzixunVO selectVO(@Param("ew") Wrapper<JiazhengzixunEntity> wrapper);
	
	List<JiazhengzixunView> selectListView(@Param("ew") Wrapper<JiazhengzixunEntity> wrapper);

	List<JiazhengzixunView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhengzixunEntity> wrapper);
	
	JiazhengzixunView selectView(@Param("ew") Wrapper<JiazhengzixunEntity> wrapper);
	
}
