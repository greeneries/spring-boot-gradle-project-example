package springbootmultipartfileuploadgradle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import springbootmultipartfileuploadgradle.storage.StorageProperties;
import springbootmultipartfileuploadgradle.storage.StorageService;


/*
 * @EnableConfigurationProperties : custom property 파일 추가 
 */

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class SpringBootMultipartFileuploadGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultipartFileuploadGradleApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }
}
