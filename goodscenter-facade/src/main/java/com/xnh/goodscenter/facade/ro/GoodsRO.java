package com.xnh.goodscenter.facade.ro;

import lombok.Data;

import java.io.Serializable;
/**
 * 商品信息对象
 *
 * @author tangdu
 * @version $: GoodsRO.java, v 0.1 2017年12月23日 上午1:04 tangdu Exp $
 * @name 商品对象
 */
@Data
public class GoodsRO implements Serializable{

    /**商品名称**/
    private String name;

}
