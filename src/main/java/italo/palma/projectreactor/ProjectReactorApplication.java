package italo.palma.projectreactor;

import italo.palma.projectreactor.service.Execute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectReactorApplication {
	public static void main(String[] args) {

		SpringApplication.run(ProjectReactorApplication.class, args);

		Execute execute = new Execute();
		execute.execute();

	}

}
