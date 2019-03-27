package com.bunac.tutorials.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("com.bunac.tutorials")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver internalResourceViewResolver() {
        /* Note: /WEB-INF/views must be located nuder main folder along with java
        folder and resource folder*/

        InternalResourceViewResolver viewResolverBean = new InternalResourceViewResolver();
        viewResolverBean.setViewClass(JstlView.class);
        viewResolverBean.setPrefix("/WEB-INF/views/");
        viewResolverBean.setSuffix(".jsp");
        return viewResolverBean;

    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/jsp/**")
                .addResourceLocations("classpath:/WEB-INF/views/");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        registry.viewResolver(internalResourceViewResolver());
//        //additional resources added
//
//    }




//
//    @Bean
//    public ViewResolver resourceBundleViewResolver() {
//        ResourceBundleViewResolver bean = new ResourceBundleViewResolver();
//        bean.setBasename("views");
//        return bean;
//    }
}


/*
    Please note this article below:
    https://www.logicbig.com/tutorials/spring-framework/spring-boot/boot-serve-dynamic.html
    https://www.mkyong.com/spring-boot/spring-boot-hello-world-example-jsp/


    Run using mvn spring-boot:run not java -jar target/the-packaged-file.war (Or in IDE, right click and run java application)
    To Run in Intelij with desired outout,. run on
    1. Edit Configuraiton
    2. add Maven
    3. rename what ever you whatn, for me, RUN
    4. ADD spring-boot:run ON command line field
 */