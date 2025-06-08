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


import com.dao.JiazhengleixingDao;
import com.entity.JiazhengleixingEntity;
import com.service.JiazhengleixingService;
import com.entity.vo.JiazhengleixingVO;
import com.entity.view.JiazhengleixingView;

@Service("jiazhengleixingService")
public class JiazhengleixingServiceImpl extends ServiceImpl<JiazhengleixingDao, JiazhengleixingEntity> implements JiazhengleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhengleixingEntity> page = this.selectPage(
                new Query<JiazhengleixingEntity>(params).getPage(),
                new EntityWrapper<JiazhengleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhengleixingEntity> wrapper) {
		  Page<JiazhengleixingView> page =new Query<JiazhengleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhengleixingVO> selectListVO(Wrapper<JiazhengleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhengleixingVO selectVO(Wrapper<JiazhengleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhengleixingView> selectListView(Wrapper<JiazhengleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhengleixingView selectView(Wrapper<JiazhengleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
