package xyz.mxue.printing.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import xyz.mxue.printing.entity.TbOrderDay;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import xyz.mxue.printing.entity.TbPrintOrder;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 日记录 Mapper 接口
 * </p>
 *
 * @author mxuexxmy
 * @since 2020-12-07
 */
public interface TbOrderDayMapper extends BaseMapper<TbOrderDay> {

}
