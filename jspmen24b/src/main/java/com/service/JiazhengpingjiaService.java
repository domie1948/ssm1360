package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhengpingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhengpingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhengpingjiaView;


/**
 * 家政评价
 *
 * @author 
 * @email 
 * @date 2021-02-23 10:16:20
 */
public interface JiazhengpingjiaService extends IService<JiazhengpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhengpingjiaVO> selectListVO(Wrapper<JiazhengpingjiaEntity> wrapper);
   	
   	JiazhengpingjiaVO selectVO(@Param("ew") Wrapper<JiazhengpingjiaEntity> wrapper);
   	
   	List<JiazhengpingjiaView> selectListView(Wrapper<JiazhengpingjiaEntity> wrapper);
   	
   	JiazhengpingjiaView selectView(@Param("ew") Wrapper<JiazhengpingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhengpingjiaEntity> wrapper);
   	
}

