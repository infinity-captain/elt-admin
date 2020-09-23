package com.etl.admin.service;

import com.alibaba.fastjson.JSON;
import com.etl.admin.bean.MySqlConfig;
import com.etl.admin.constant.EtlType;
import com.etl.admin.dao.EtlDataSourceMapper;
import com.etl.admin.po.EtlDataSource;
import com.etl.admin.po.EtlDataSourceExample;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author 林骏
 * version: v1
 * date: 2020-09-15
 */
@Service
public class EtlDataSourceService {

    @Resource
    private EtlDataSourceMapper etlDataSourceMapper;


    @PostConstruct
    public void query(){
        EtlDataSourceExample example = new EtlDataSourceExample();
        List<EtlDataSource> etlDataSources =  etlDataSourceMapper.selectByExample(example);
        for(EtlDataSource etlDataSource : etlDataSources){
            String type = etlDataSource.getType();
            String cfg = etlDataSource.getConfig();
            EtlType.init(type,cfg);
        }
    }

    public void save(EtlDataSource etlDataSource){
        etlDataSourceMapper.insert(etlDataSource);
    }


}
