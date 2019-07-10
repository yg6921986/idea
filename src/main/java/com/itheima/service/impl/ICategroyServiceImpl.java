package com.itheima.service.impl;

import com.itheima.domain.Categroy;
import com.itheima.mapper.CategroyMapper;
import com.itheima.service.ICategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Francis.G.Yang
 * @version v1.0
 * @date 2019/7/9 19:34
 * @description TODO
 **/

@Service("categroyService")
public class ICategroyServiceImpl implements ICategroyService {
    @Autowired
    private CategroyMapper categroyMapper;
    @Override
    public List<Categroy> queryAllCategroy() {
        return categroyMapper.queryAllCategroy();
    }
}
