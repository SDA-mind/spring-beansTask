package app.config;

import app.model.AnimalsCage;
import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name="Cat")
    public Cat getCat() {
        return new Cat();
    }

    @Bean(name="Dog")
    public Dog getDog() {
        return new Dog();
    }

    @Bean(name="Timer")
    public Timer getTimer() {
        return new Timer();
    }

    @Bean(name="AnimalsCage")
    public AnimalsCage getAnimalsCage() {
        return new AnimalsCage();
    }
}
