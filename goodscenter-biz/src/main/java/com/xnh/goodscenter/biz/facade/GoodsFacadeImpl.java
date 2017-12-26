package com.xnh.goodscenter.biz.facade;

import com.xnh.commons.knife.result.Result;
import com.xnh.commons.knife.result.Results;
import com.xnh.goodscenter.facade.ro.GoodsQueryRO;
import com.xnh.goodscenter.facade.ro.GoodsRO;
import com.xnh.goodscenter.facade.service.GoodsFacade;
import org.assertj.core.util.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 商品服务能力提供实现
 *
 * @author tangdu
 * @version $: GoodsFacadeImpl.java, v 0.1 2017年12月2017/12/23日 上午7:36 tangdu Exp $
 */
@Component("goodsFacade")
public class GoodsFacadeImpl implements GoodsFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoodsFacadeImpl.class);

    @Override
    public Result<GoodsRO> queryGoodsById(Long goodsId) {
        GoodsRO goodsRO = new GoodsRO();
        goodsRO.setGoodsName("一支铅笔");
        goodsRO.setGoodsId(1111111l);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            LOGGER.error("queryGoodsById", e);
        }
        return Results.success(goodsRO);
    }

    @Override
    public Result<List<GoodsRO>> queryGoodsList(GoodsQueryRO goodsQueryRO) {
        GoodsRO goodsRO = new GoodsRO();
        goodsRO.setGoodsName("一支铅笔");
        goodsRO.setGoodsId(1111111l);
        return Results.success(Lists.newArrayList(goodsRO));
    }
}
