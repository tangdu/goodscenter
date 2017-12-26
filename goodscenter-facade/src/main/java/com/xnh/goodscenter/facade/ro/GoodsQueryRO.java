package com.xnh.goodscenter.facade.ro;

import lombok.Data;

import java.io.Serializable;
/**
 * 商品查询对象
 *
 * @author tangdu
 * @version $: GoodsQueryRO.java, v 0.1 2017年12月23日 上午1:02 tangdu Exp $
 * @name 商品查询对象
 */
@Data
public class GoodsQueryRO implements Serializable {

    /**商品ID**/
    private Long goodsId;
    /**商品ID**/
    private String goodsName;
}
