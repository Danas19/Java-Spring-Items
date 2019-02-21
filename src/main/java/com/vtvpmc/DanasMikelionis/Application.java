package com.vtvpmc.DanasMikelionis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class Application {
	//private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
//	@Bean
//	public CommandLineRunner demo(ItemRepository itemRepository) {
//		return (args) -> {
//			
//			log.info("Items found with findAll():");
//			log.info("-----------------------------");
//			for (Item item : itemRepository.findAll()) {
//				log.info(item.toString());
//			}
//			
//			System.out.println(itemRepository.findById(33L));
//		};
//	}
	
	@Bean
	public Docket SwaggerDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.vtvpmc.DanasMikelionis"))
				.build();
	}	
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
		.title("REST Documentation")
		.version("0.0.1-SNAPSHOT")
		.build();
	}
}
