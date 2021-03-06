package com.yc.fresh.service;

import com.yc.fresh.service.entity.WarehouseStock;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 库存 服务类
 * </p>
 *
 * @author Quy
 * @since 2019-11-22
 */
public interface IWarehouseStockService extends IService<WarehouseStock> {


    List<WarehouseStock> findBySkuId(Long skuId);
}
