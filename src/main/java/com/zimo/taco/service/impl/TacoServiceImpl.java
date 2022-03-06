package com.zimo.taco.service.impl;

import com.zimo.taco.mapper.TacoMapper;
import com.zimo.taco.pojo.Taco;
import com.zimo.taco.service.TacoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create by zimo at 2021/12/16
 */
@Service
public class TacoServiceImpl implements TacoService {

    Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private TacoMapper tacoMapper;

    @Override
    public Integer addTaco(Taco taco) {
        log.info(String.valueOf(taco));
        return tacoMapper.addTaco(taco);
    }
}
