package com.mh.jishi.app;

import com.mh.jishi.service.TsService;
import com.mh.jishi.util.ResponseUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Evan
 * @since 2022-04-20
 */
@RestController
public class TsController {

    @Autowired
    private TsService service;

    /**
     * 随机获取一条唐诗信息
     *
     * @return Ts对象
     */
    @ApiOperation(value = "随机获取一条唐诗信息")
    @GetMapping(value = "getRandomTs")
    public ResponseUtil getRandomTs() {
        return ResponseUtil.ok(service.getRandomTs());
    }
}
