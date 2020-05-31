package top.wycfight.tw.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.wycfight.tw.mapper.UmsAdminMapper;
import top.wycfight.tw.model.UmsAdmin;

/**
 * @author: wycfight@163.com
 * @description: HelloController
 * @create: 2020-05-31 17:08
 * @modify By:
 **/
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private UmsAdminMapper umsMapper;

    @RequestMapping("/hello")
    public UmsAdmin hello() {
        UmsAdmin umsAdmin = umsMapper.selectByPrimaryKey(1L);
        return umsAdmin;
    }
}
