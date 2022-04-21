package com.mh.jishi.service;

import com.mh.jishi.util.RedisUtil;
import com.mh.jishi.util.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

/**
 * <h2>服务层</h2>
 * <p>
 *
 * </p>
 *
 * @author Evan
 * @since 2022年04月20日 17:48
 */
@Service
public class TsService {
    @Resource
    private RedisUtil redisUtil;


    /**
     * 随机获取一条唐诗信息
     *
     * @return Ts对象
     */
    public ResponseUtil getRandomTs() {
        String k = "ts:list";
        long size = redisUtil.lGetListSize(k);
        Random r = new Random();
        Object one = redisUtil.lGetIndex(k, r.nextInt((int) (size - 1)));

        return ResponseUtil.ok(one);
    }
}
