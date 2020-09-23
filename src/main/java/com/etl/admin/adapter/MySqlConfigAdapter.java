package com.etl.admin.adapter;

import com.alibaba.fastjson.JSONObject;
import com.etl.admin.adapter.factory.DruidDataSourceFactory;
import com.etl.admin.bean.MySqlConfig;

/**
 * @author 林骏
 * version: v1
 * date: 2020-09-16
 */
public class MySqlConfigAdapter implements DriverConfigAdapter {

    @Override
    public void initialize(String cfg) {
        MySqlConfig mySqlConfig = JSONObject.parseObject(cfg,MySqlConfig.class);
        DruidDataSourceFactory factory = new DruidDataSourceFactory(
                mySqlConfig.getDriver(),
                mySqlConfig.getUrl(),
                mySqlConfig.getUsername(),
                mySqlConfig.getPassword());
        factory.initialize();
        System.out.println("= druid mysql data source init success =");
    }
}
