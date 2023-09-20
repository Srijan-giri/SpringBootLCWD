package another.world;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoConfig {
	@Bean
	public Repo getRepo() {
		return new Repo();
	}

}
