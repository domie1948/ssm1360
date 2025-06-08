package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhengleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhengleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhengleixingView;


/**
 * 家政类型
 *
 * @author 
 * @email 
 * @date 2021-02-23 10:16:19
 */
public interface JiazhengleixingService extends IService<JiazhengleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhengleixingVO> selectListVO(Wrapper<JiazhengleixingEntity> wrapper);
   	
   	JiazhengleixingVO selectVO(@Param("ew") Wrapper<JiazhengleixingEntity> wrapper);
   	
   	List<JiazhengleixingView> selectListView(Wrapper<JiazhengleixingEntity> wrapper);
   	
   	JiazhengleixingView selectView(@Param("ew") Wrapper<JiazhengleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhengleixingEntity> wrapper);
   	
}

