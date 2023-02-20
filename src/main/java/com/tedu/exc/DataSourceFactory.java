package com.tedu.exc;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class DataSourceFactory {

    static DataSource newDataSource(){
        HikariDataSource ds = new HikariDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/yonghedb?serverTimeZone=GMT");
        ds.setUsername("root");
        ds.setPassword("123456");
        return ds;

    }

}
