package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhengzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhengzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhengzixunView;


/**
 * 家政资讯
 *
 * @author 
 * @email 
 * @date 2021-02-23 10:16:20
 */
public interface JiazhengzixunService extends IService<JiazhengzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhengzixunVO> selectListVO(Wrapper<JiazhengzixunEntity> wrapper);
   	
   	JiazhengzixunVO selectVO(@Param("ew") Wrapper<JiazhengzixunEntity> wrapper);
   	
   	List<JiazhengzixunView> selectListView(Wrapper<JiazhengzixunEntity> wrapper);
   	
   	JiazhengzixunView selectView(@Param("ew") Wrapper<JiazhengzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhengzixunEntity> wrapper);
   	
}

