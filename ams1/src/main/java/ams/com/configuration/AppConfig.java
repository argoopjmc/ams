package ams.com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ams.com")
public class AppConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}
	
	@Override
	   public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    
	       // Css resource.
		   registry.addResourceHandler("/styles/**") //
        .addResourceLocations("/WEB-INF/resources/css/").setCachePeriod(31556926);
		   
		   registry.addResourceHandler("/images/**") //
        .addResourceLocations("/WEB-INF/resources/images/").setCachePeriod(31556926);
		   
		   registry.addResourceHandler("/js/**") //
        .addResourceLocations("/WEB-INF/resources/js/").setCachePeriod(31556926);
		   
		   registry.addResourceHandler("/template/**") //
        .addResourceLocations("/WEB-INF/resources/template/").setCachePeriod(31556926);
		   
		   registry.addResourceHandler("/fonts/**") //
        .addResourceLocations("/WEB-INF/resources/fonts/").setCachePeriod(31556926);
	        
	   }
	

}
