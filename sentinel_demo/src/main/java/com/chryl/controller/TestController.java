package com.chryl.controller;

import com.chryl.clinet.GoodsClinet;
import com.chryl.po.ChrGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chr.yl on 2020/7/24.
 *
 * @author Chr.yl
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    GoodsClinet goodsClinet;

    @GetMapping("/show")
    public Object show() {
        ChrGoods chrGoods = new ChrGoods();
        chrGoods.setGoodsId(2);
        return goodsClinet.getGood(chrGoods);
    }
}
