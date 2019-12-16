package com.filter;

/*解决中文字符集乱码*/

import javax.servlet.*;
import java.io.IOException;

public class chineseGarbled implements javax.servlet.Filter {

    public chineseGarbled() {
        System.out.println("过滤器构造");
    }

    public void destroy() {
        System.out.println("销毁过滤器");
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        req.setCharacterEncoding("utf-8");//将编码改为utf-8
        resp.setContentType("text/html;charset=utf-8");
        chain.doFilter(req, resp);
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {
        System.out.println("初始化过滤器");
    }

}
