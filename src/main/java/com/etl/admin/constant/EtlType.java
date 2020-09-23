package com.etl.admin.constant;

import com.etl.admin.adapter.DriverConfigAdapter;
import com.etl.admin.adapter.MySqlConfigAdapter;
import com.etl.admin.adapter.OracleConfigAdapter;

/**
 * @author 林骏
 * version: v1
 * date: 2020-09-15
 */
public enum EtlType {
    MySql("mysql",new MySqlConfigAdapter()),
    Oracle("oracle",new OracleConfigAdapter());



    private String type;
    private DriverConfigAdapter adapter;
    EtlType(String type,DriverConfigAdapter adapter){
        this.type = type;
        this.adapter = adapter;
    }

    public static void init(String type,String cfg){
        valueOf(type).adapter.initialize(cfg);
    }



}
