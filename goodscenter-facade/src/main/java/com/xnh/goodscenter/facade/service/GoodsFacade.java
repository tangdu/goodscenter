package com.xnh.goodscenter.facade.service;


import com.xnh.commons.knife.result.Result;
import com.xnh.goodscenter.facade.ro.GoodsQueryRO;
import com.xnh.goodscenter.facade.ro.GoodsRO;

import java.util.List;

/**
 * 商品查询服务接口
 *
 * @author tangdu
 * @version $: GoodsFacade.java, v 0.1 2017年12月22日 下午6:39 tangdu Exp $
 * @name 商品查询服务接口
 */
public interface GoodsFacade {

    /**
     * 根据ID查询商品信息
     * @param goodsQueryRO 商品查询
     * @return 商品信息对象列表
     */
    Result<List<GoodsRO>> queryGoodsList(GoodsQueryRO goodsQueryRO);


    /**
     * 根据商品ID查询商品信息
     * @param goodsId 商品ID
     * @return 商品信息对象
     */
    Result<GoodsRO> queryGoodsById(Long goodsId);

}
