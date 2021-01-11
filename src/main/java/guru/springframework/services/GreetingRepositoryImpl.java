package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getGermanGreeting() {
        return "Hello in German";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getEnglishGreeting() {
        return "Hello - primary greeting service";
    }
}
