package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiazhengpingjiaDao;
import com.entity.JiazhengpingjiaEntity;
import com.service.JiazhengpingjiaService;
import com.entity.vo.JiazhengpingjiaVO;
import com.entity.view.JiazhengpingjiaView;

@Service("jiazhengpingjiaService")
public class JiazhengpingjiaServiceImpl extends ServiceImpl<JiazhengpingjiaDao, JiazhengpingjiaEntity> implements JiazhengpingjiaService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhengpingjiaEntity> page = this.selectPage(
                new Query<JiazhengpingjiaEntity>(params).getPage(),
                new EntityWrapper<JiazhengpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhengpingjiaEntity> wrapper) {
		  Page<JiazhengpingjiaView> page =new Query<JiazhengpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhengpingjiaVO> selectListVO(Wrapper<JiazhengpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhengpingjiaVO selectVO(Wrapper<JiazhengpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhengpingjiaView> selectListView(Wrapper<JiazhengpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhengpingjiaView selectView(Wrapper<JiazhengpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
