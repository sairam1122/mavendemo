package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {


   
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

  
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoApplication.class);
    }
    
    
    @Bean(name="JspViewResolver")
    public ViewResolver viewResolver()
    {
    	InternalResourceViewResolver resolver=null;
    	
    	resolver=new InternalResourceViewResolver();
    	resolver.setPrefix("/WEB-INF/view/");
    	resolver.setSuffix(".jsp");
    	return resolver;
    	
    }
    
    
    

}
