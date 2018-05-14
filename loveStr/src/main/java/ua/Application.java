package ua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	}
	
	//static void addAdmin(ConfigurableApplicationContext run){
	//	UserEntityRepository repository = run.getBean(UserEntityRepository.class);
	//	UserEntity entity = repository.findForAuth("admin");
	//	if(entity==null){
	//		PasswordEncoder encoder = run.getBean(PasswordEncoder.class);
	//		entity = new UserEntity();
	//		entity.setEmail("admin");
	//		entity.setPassword(encoder.encode("admin"));
	//		entity.setRole(Role.ROLE_ADMIN);
	//		repository.save(entity);
	//}
	//}
}
