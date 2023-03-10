package com.tedu.exc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionDemo1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //使用request对象的getSession()获取session，如果session不存在则创建一个
        HttpSession session = request.getSession();
        //将数据存储到session中
        session.setAttribute("data","孤傲苍狼");
        //获取session的Id
        String sessionId = session.getId();
        //判断session是不是新创建的
        if(session.isNew()){
            response.getWriter().println("session创建成功，session的id是"+sessionId);
        }else{
            response.getWriter().println("服务器已存在session，session的id是"+sessionId);
        }
    }


}





















