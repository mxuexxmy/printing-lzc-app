package xyz.mxue.printing.service;

import xyz.mxue.printing.commons.model.PageInfo;
import xyz.mxue.printing.entity.TbPrintOrder;
import com.baomidou.mybatisplus.extension.service.IService;
import xyz.mxue.printing.entity.TbPrintfInfo;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 打印订单 服务类
 * </p>
 *
 * @author mxuexxmy
 * @since 2020-12-06
 */
public interface TbPrintOrderService extends IService<TbPrintOrder> {

    PageInfo<TbPrintOrder> page(int start, int length, int draw, TbPrintOrder tbPrintOrder) ;

    /**
     * 统计份数
     * @param startDate 开始时间
     * @param endDate 结束时间
     * @return Integer
     */
    Integer sumPrintNumber(Date startDate, Date endDate);


    /**
     * 保持打印订单信息和订单信息
     * @param tbPrintOrder 订单信息
     * @param printfInfoList 打印信息
     * @return boolean
     */
    boolean saveOrderInfoAndPrintfInfo(TbPrintOrder tbPrintOrder, List<TbPrintfInfo> printfInfoList);

    /**
     * 指定天的打印单数
     * @param startDate 开始时间
     * @param endDate 结束时间
     * @return Integer
     */
    Integer getDayOfPrintfNumber(Date startDate, Date endDate);

    /**
     * 指定天的打印收入
     * @param startDate 开始时间
     * @param endDate 结束时间
     * @return BigDecimal
     */
    BigDecimal getPrintfIncomeByDate(Date startDate, Date endDate);


}
