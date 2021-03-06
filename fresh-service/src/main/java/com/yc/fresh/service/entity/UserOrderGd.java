package com.yc.fresh.service.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单商品
 * </p>
 *
 * @author Quy
 * @since 2020-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserOrderGd implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 商品ID
     */
    private String goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 分类
     */
    private Integer categoryId;

    /**
     * 商品图片
     */
    private String goodsPic;

    /**
     * 购买数量
     */
    private Integer num;

    /**
     * 原价
     */
    private BigDecimal rawPrice;

    /**
     * 售价
     */
    private BigDecimal salePrice;

    /**
     * 成本价
     */
    private BigDecimal costPrice;

    /**
     * 绑定数量
     */
    private Integer bundles;

    /**
     * 计量值
     */
    private Integer saleCv;

    /**
     * 单位
     */
    private String unit;

    /**
     * 成本金额
     */
    private BigDecimal costAmt;

    /**
     * 销售金额
     */
    private BigDecimal saleAmt;

    /**
     * 折扣金额
     */
    private BigDecimal discAmt;

    /**
     * 实际金额
     */
    private BigDecimal realAmt;

    /**
     * 退款金额
     */
    private BigDecimal refundAmt;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后更新时间
     */
    private LocalDateTime lastModifiedTime;


    public static final String ID = "id";

    public static final String ORDER_ID = "order_id";

    public static final String GOODS_ID = "goods_id";

    public static final String GOODS_NAME = "goods_name";

    public static final String CATEGORY_ID = "category_id";

    public static final String GOODS_PIC = "goods_pic";

    public static final String NUM = "num";

    public static final String RAW_PRICE = "raw_price";

    public static final String SALE_PRICE = "sale_price";

    public static final String COST_PRICE = "cost_price";

    public static final String BUNDLES = "bundles";

    public static final String SALE_CV = "sale_cv";

    public static final String UNIT = "unit";

    public static final String COST_AMT = "cost_amt";

    public static final String SALE_AMT = "sale_amt";

    public static final String DISC_AMT = "disc_amt";

    public static final String REAL_AMT = "real_amt";

    public static final String REFUND_AMT = "refund_amt";

    public static final String REMARK = "remark";

    public static final String CREATE_TIME = "create_time";

    public static final String LAST_MODIFIED_TIME = "last_modified_time";

}
