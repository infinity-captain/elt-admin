package com.etl.admin.bean;

/**
 * @author 林骏
 * version: v1
 * date: 2020-09-15
 */
public class EtlDataSourceProperties {

    private String name;
    private String type;
    private String config;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
