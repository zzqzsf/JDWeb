package org.lanqiao.jd.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
 
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration loginRegistry = registry.addInterceptor(new CheckLogInterceptor()).addPathPatterns("/**");
        // 拦截路径
        loginRegistry.addPathPatterns("/**");
        // 排除路径
//        loginRegistry.excludePathPatterns("/");
        loginRegistry.excludePathPatterns("/login.html");
        loginRegistry.excludePathPatterns("/check");
        // 排除资源请求
        loginRegistry.excludePathPatterns("/css/*.css");
        loginRegistry.excludePathPatterns("/js/*.js");
        loginRegistry.excludePathPatterns("/image/*.png");
        super.addInterceptors(registry);
    }
}