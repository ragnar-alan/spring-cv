package hu.borostomi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

@Configuration
public class ThymeLeafConfiguration {
	
	private ApplicationContext appContext;

	  public void setApplicationContext(ApplicationContext applicationContext) {
	    this.appContext = applicationContext;
	  }

	  @Bean
	  public ViewResolver viewResolver() {
	    ThymeleafViewResolver resolver = new ThymeleafViewResolver();
	    resolver.setTemplateEngine(templateEngine());
	    resolver.setCharacterEncoding("UTF-8");
	    return resolver;
	  }

	  @Bean
	  public TemplateEngine templateEngine() {
	    SpringTemplateEngine engine = new SpringTemplateEngine();
	    engine.setEnableSpringELCompiler(true);
	    engine.setTemplateResolver(templateResolver());
	    return engine;
	  }

	  private ITemplateResolver templateResolver() {
	    SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
	    resolver.setApplicationContext(appContext);
	    resolver.setPrefix("classpath:/templates/");
	    resolver.setTemplateMode("HTML5");
	    return resolver;
	  }
}
