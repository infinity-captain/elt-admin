package com.etl.admin.adapter.factory;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author 林骏
 * version: v1
 * date: 2020-07-18
 */
public class DruidDataSourceFactory {

    private String jdbcDriver;
    private String jdbcUrl;
    private String jdbcUser;
    private String jdbcPassword;

    public DruidDataSourceFactory(String jdbcDriver, String jdbcUrl, String jdbcUser, String jdbcPassword){
        this.jdbcDriver = jdbcDriver;
        this.jdbcUrl = jdbcUrl;
        this.jdbcUser = jdbcUser;
        this.jdbcPassword = jdbcPassword;
    }


    public DruidDataSource initialize(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcDriver);
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(jdbcUser);
        dataSource.setPassword(jdbcPassword);
        dataSource.setInitialSize(8);
        dataSource.setMinIdle(5);
        dataSource.setMaxActive(10);
        dataSource.setMaxWait(60000);
        dataSource.setTestOnBorrow(true);
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        dataSource.setMinEvictableIdleTimeMillis(300000);
        dataSource.setPoolPreparedStatements(false);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
        dataSource.setValidationQuery("select 1");
        return dataSource;
    }

}
