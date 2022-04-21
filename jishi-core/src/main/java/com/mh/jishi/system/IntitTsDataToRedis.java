package com.mh.jishi.system;

import com.mh.jishi.entity.Ts;
import com.mh.jishi.mapper.TsMapper;
import com.mh.jishi.service.impl.TsServiceImpl;
import com.mh.jishi.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

/**
 * <h2>初始化唐诗数据到redis</h2>
 * <p>
 *
 * </p>
 *
 * @author Evan
 * @since 2022年04月20日 17:45
 */
@Component
public class IntitTsDataToRedis {
    @Autowired
    @Lazy
    private TsServiceImpl service;

    @Resource
    private RedisUtil redisUtil;


    @PostConstruct
    public void init(){
        String key = "ts:list";
        List<Ts> list = service.list();
        for(Ts t : list){
            redisUtil.lSet(key, t);
        }
    }
}
