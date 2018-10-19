package springbootschedulingtasksgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedulingTasksGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulingTasksGradleApplication.class, args);
	}
}
