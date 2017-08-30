/*
package com.lotus.config;

import com.lotus.web.filter.DemoFilter;
import com.lotus.web.listener.DemoListener;
import com.lotus.web.servlet.DemoServlet;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletListenerRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

*/
/**
 * Created by Administrator on 2017/8/23.
 * 通过配置的方式(Bean)实现Servlet、Filter、Listener的使用
 *//*

@Configuration
public class WebConfig extends WebMvcAutoConfiguration {

    @Bean
    public FilterRegistrationBean getDemoFilter(){
        DemoFilter filter = new DemoFilter();
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(filter);

        List<String> urlPatterns=new ArrayList<String>();
        urlPatterns.add("*/
/*");//拦截路径，可以添加多个
        registrationBean.setUrlPatterns(urlPatterns);
        registrationBean.setOrder(1);

        return registrationBean;
    }

    @Bean
    public ServletRegistrationBean getDeomoServlet(){
        DemoServlet servlet = new DemoServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
        registrationBean.setServlet(servlet);

        List<String> urlMappings=new ArrayList<String>();
        urlMappings.add("/demoservlet");////访问，可以添加多个
        registrationBean.setUrlMappings(urlMappings);
        registrationBean.setLoadOnStartup(1);

        return registrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean getDemoListener(){
        DemoListener listener = new DemoListener();
        ServletListenerRegistrationBean registrationBean = new ServletListenerRegistrationBean();
        registrationBean.setListener(listener);

        return registrationBean;
    }
}
*/
