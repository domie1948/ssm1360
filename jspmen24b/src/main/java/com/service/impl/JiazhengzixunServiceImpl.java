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


import com.dao.JiazhengzixunDao;
import com.entity.JiazhengzixunEntity;
import com.service.JiazhengzixunService;
import com.entity.vo.JiazhengzixunVO;
import com.entity.view.JiazhengzixunView;

@Service("jiazhengzixunService")
public class JiazhengzixunServiceImpl extends ServiceImpl<JiazhengzixunDao, JiazhengzixunEntity> implements JiazhengzixunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhengzixunEntity> page = this.selectPage(
                new Query<JiazhengzixunEntity>(params).getPage(),
                new EntityWrapper<JiazhengzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhengzixunEntity> wrapper) {
		  Page<JiazhengzixunView> page =new Query<JiazhengzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhengzixunVO> selectListVO(Wrapper<JiazhengzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhengzixunVO selectVO(Wrapper<JiazhengzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhengzixunView> selectListView(Wrapper<JiazhengzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhengzixunView selectView(Wrapper<JiazhengzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
