package com.lotus.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by Administrator on 2017/8/23.
 */
@WebListener
public class DemoListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("--->DemoListener初始化,,,<---");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("--->DemoListener销毁,,,<---");
    }
}
