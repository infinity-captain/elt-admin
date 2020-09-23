package com.etl.admin.adapter;

/**
 * @author 林骏
 * version: v1
 * date: 2020-09-23
 */
public class OracleConfigAdapter implements DriverConfigAdapter {
    @Override
    public void initialize(String cfg) {
        System.out.println(" oracle cfg : "+cfg);
    }
}
