import com.alibaba.fastjson.JSON;
import com.etl.admin.Application;
import com.etl.admin.bean.MySqlConfig;
import com.etl.admin.constant.EtlType;
import com.etl.admin.po.EtlDataSource;
import com.etl.admin.service.EtlDataSourceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 描述:
 * 版本: v1
 * 作者: 林骏
 * <p>
 * 日期: 2020-03-08 17:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class EtlDatasourceTest {

    @Resource
    private EtlDataSourceService etlDataSourceService;

    @Test
    public void saveEtl(){
        MySqlConfig cfg = new MySqlConfig();
        cfg.setDriver("com.mysql.jdbc.Driver");
        cfg.setUrl("jdbc:mysql://rm-bp1o1w10r2yij601sqo.mysql.rds.aliyuncs.com:3306/mysql-es?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull");
        cfg.setUsername("api");
        cfg.setPassword("queryapi@123");
        EtlDataSource etlDataSource = new EtlDataSource();
        etlDataSource.setConfig(JSON.toJSONString(cfg));
        etlDataSource.setName("从mysql取数据,保存到es");
        etlDataSource.setType(EtlType.MySql.name());
        etlDataSourceService.save(etlDataSource);
    }
}
