package com.zj.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


/**
 * Created by zhujie on 16/10/9.
 */
@Api(value = "country－国别相关接口", description = "country－国别相关接口")
@RestController
@RequestMapping(value = "/country")
public class CountryWeb {

    @ApiOperation(value = "测试get(路径／传参)", notes = "测试get(路径／传参)")
    @RequestMapping(value = "/geta/{name}", method = RequestMethod.GET)
    public void geta(@PathVariable String name) {
        System.out.println(name);
    }

    @ApiOperation(value = "测试get(路径？传参)", notes = "测试get(路径？传参)")
    @RequestMapping(value = "/getb", method = RequestMethod.GET)
    public void getb(@RequestParam String name) {
        System.out.println(name);

    }

    @ApiOperation(value = "测试get(路径/？传参)", notes = "测试get(路径？传参)")
    @RequestMapping(value = "/getc/{name}", method = RequestMethod.GET)
    public void getc(@PathVariable String name,@RequestParam String age) {
        System.out.println(name);
        System.out.println(age);
    }
    //@RequestBody     produces = "text/plain"
}
