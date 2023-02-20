package com.tedu.exc;

import java.io.Serializable;
import java.util.Date;

class SysLog implements Serializable {
    private static final long serialVersionUID = -5296788134693797316L;

    static String Name = "lily";
    String pwd = "1234567";

    /**日志id**/
    private Integer id;
    /**操作用户**/
    private String username;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "SysLog{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
