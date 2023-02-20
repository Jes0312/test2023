package com.tedu.exc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestJdbcTemplate {
    public static void main(String[] args) throws SQLException {
        JdbcTemplate jt = new JdbcTemplate();
        jt.setDatasource(new DataSourceFactory().newDataSource());

        Connection conn = jt.getConnection();
        String sql = "delete from yonghedb where id = ?";
        jt.deleteObject(sql,new Object[]{10});
    }
}
