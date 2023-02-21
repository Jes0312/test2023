package com.tedu;


import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;

public class LogTest {
    private Logger log = Logger.getLogger(getClass());

    public static void main(String[] args) {
        LogTest l = new LogTest();
        l.log.info("这是一个 日志测试3333");
        l.log.error("这是一个错误日志");
        l.log.warn("这是一个警告日志");
        l.log.warn("这是一个警告日志");
    }
}
