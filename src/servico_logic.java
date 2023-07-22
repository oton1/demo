import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PaginationService {

    private final WebClient webClient;

    public PaginationService() {
        this.webClient = WebClient.create();
    }

    public void paginate(String apiUrl, String cursor) {
        String response = webClient.get()
            .uri(apiUrl)
            .retrieve()
            .bodyToMono(String.class)
            .block();

        // TODO: parsear a resposta e extrair próximo cursor
        // TODO: Chamar o paginate () com o cursor de forma mais coerente
    }
}
