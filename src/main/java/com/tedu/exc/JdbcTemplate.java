package com.tedu.exc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTemplate {

    DataSource datasource;
    public void setDatasource(DataSource dataSource){
        this.datasource = dataSource;
    }

    public Connection getConnection() throws SQLException {
        return datasource.getConnection();
    }

    public int deleteObject(String sql,Object[] args) {

        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = datasource.getConnection();
            pst = conn.prepareStatement(sql);

            for(int i=0;i<args.length;i++){
                pst.setObject(i+1,args[i]);
            }
            int rows = pst.executeUpdate();
            return rows;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }finally{
            if(pst !=null){
                try {
                    pst.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(conn !=null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }



}
