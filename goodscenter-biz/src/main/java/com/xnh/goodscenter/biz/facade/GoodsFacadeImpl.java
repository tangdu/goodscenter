package com.xnh.goodscenter.biz.facade;

import com.xnh.commons.knife.result.Result;
import com.xnh.commons.knife.result.Results;
import com.xnh.goodscenter.facade.ro.GoodsQueryRO;
import com.xnh.goodscenter.facade.ro.GoodsRO;
import com.xnh.goodscenter.facade.service.GoodsFacade;
import org.springframework.stereotype.Component;

/**
 * TODO: detail description
 *
 * @author tangdu
 * @version $: GoodsFacadeImpl.java, v 0.1 2017年12月2017/12/23日 上午7:36 tangdu Exp $
 * @name TODO: GoodsFacadeImpl
 */
@Component("goodsFacade")
public class GoodsFacadeImpl implements GoodsFacade {
    @Override
    public Result<GoodsRO> queryGoodsList(GoodsQueryRO goodsQueryRO) {
        GoodsRO goodsRO = new GoodsRO();
        goodsRO.setName("ssssl中历");
        return Results.success(goodsRO);
    }
}
