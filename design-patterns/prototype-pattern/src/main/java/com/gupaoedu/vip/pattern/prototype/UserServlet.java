package com.gupaoedu.vip.pattern.prototype;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

public class UserServlet extends HttpServlet {

    private void regist(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String nickname = request.getParameter("nickname");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String birthday = request.getParameter("birthday");
        String isActiving = request.getParameter("isActiving");
        String verifycode = request.getParameter("verifycode");
        String activeCode = UUID.randomUUID().toString();

        User msg =  new User();
        msg.setUsername(username);
        msg.setNickname(nickname);
        msg.setPassword(password);
        msg.setEmail(email);
        msg.setBirthday(birthday);
        msg.setIsActiving(Integer.valueOf(isActiving));
        msg.setVerifycode(verifycode);
        msg.setActiveCode(activeCode);

        String checkcode_session = (String) request.getSession().getAttribute("checkcode_session");
        HashMap<String, String> error = new HashMap<>();
        if (!msg.getVerifycode().equals(checkcode_session)) {
            error.put("verifycode", "验证码不正确！");
            msg.setError(error);
            request.setAttribute("msg", msg);
            System.out.println("验证码不正确！");
        }else{
            System.out.println("注册成功！即将跳转到登录页面...");
        }

    }
}
