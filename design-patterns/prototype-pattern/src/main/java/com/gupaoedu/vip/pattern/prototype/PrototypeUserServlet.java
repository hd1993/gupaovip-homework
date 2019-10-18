package com.gupaoedu.vip.pattern.prototype;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

public class PrototypeUserServlet extends HttpServlet {

    private void regist(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User msg =  new User();
        String checkcode_session = (String) request.getSession().getAttribute("checkcode_session");
        HashMap<String, String> error = new HashMap<>();
        try {
            BeanUtils.populate(msg, request.getParameterMap());

            if (!msg.getVerifycode().equals(checkcode_session)) {
                error.put("verifycode", "验证码不正确！");
                msg.setError(error);
                request.setAttribute("msg", msg);
                System.out.println("验证码不正确！");
            }else{
                System.out.println("注册成功！即将跳转到登录页面...");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            response.getWriter().println("注册失败!异常信息："+e.getMessage());
        }

    }
}
