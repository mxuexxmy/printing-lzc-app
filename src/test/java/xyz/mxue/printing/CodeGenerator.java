package xyz.mxue.printing;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;


public class CodeGenerator {

    @Test
    public void run(){
        // 1、创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 配置 GlobalConfig
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("F:\\Project\\rongrong\\printing\\src\\main\\java"); // 绝对路径写法
        gc.setAuthor("mxuexxmy");
        gc.setOpen(false); // 生成后是否打开资源管理器
        gc.setFileOverride(true); // 重新生成文件时是否覆盖
        gc.setServiceName("%sService"); // 去掉Service接口的首字母I
        gc.setIdType(IdType.AUTO); // 主键策略
        gc.setDateType(DateType.ONLY_DATE); // 定义生成的实体类中日期类型
        // gc.setSwagger2(false); // 开启Swagger2模式
        gc.setBaseResultMap(true);
        gc.setBaseResultMap(true);
        mpg.setGlobalConfig(gc);

        // 配置 DataSourceConfig
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/printing?useSSL=false&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setDbType(DbType.MYSQL);

        mpg.setDataSource(dsc);

        // 4、包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("xyz.mxue"); // 包名
        pc.setModuleName("printing"); // 模块名
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setService("service");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        // 5、策略配置
        StrategyConfig strategy = new StrategyConfig();

//        strategy.setInclude("fields", "task", "task_list", "task_type");
        strategy.setInclude("tb_printf_info");

        strategy.setNaming(NamingStrategy.underline_to_camel); // 数据库表映射到实体的命名策略
        strategy.setTablePrefix(pc.getModuleName() + "_"); // 生成实体是去掉表前缀

        strategy.setColumnNaming(NamingStrategy.underline_to_camel); // 数据库表字段映射到实体的命名策略
        strategy.setEntityLombokModel(true); // lombok 模型 @Accessors(chain=true) setter 链式操作

        strategy.setRestControllerStyle(true); // restful api 风格
        strategy.setControllerMappingHyphenStyle(true); // url中驼峰转连字符
        mpg.setStrategy(strategy);

        // 6、执行
        mpg.execute();

    }
}