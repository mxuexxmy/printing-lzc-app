package xyz.mxue.printing.mapper;

import org.apache.ibatis.annotations.Select;
import xyz.mxue.printing.entity.TbOrderMonth;
import xyz.mxue.printing.entity.TbOrderYear;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import xyz.mxue.printing.entity.TbPrintOrder;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 年记录 Mapper 接口
 * </p>
 *
 * @author mxuexxmy
 * @since 2020-12-07
 */
public interface TbOrderYearMapper extends BaseMapper<TbOrderYear> {

}
