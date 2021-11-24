package apap.tutorial.pergipergi.service;
import apap.tutorial.pergipergi.model.TravelAgensiModel;
import apap.tutorial.pergipergi.rest.AgensiDetail;
import apap.tutorial.pergipergi.rest.Setting;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalTime;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public interface TravelAgensiRestService {
    public TravelAgensiModel createAgensi(TravelAgensiModel agensi);
    public List<TravelAgensiModel> retrieveListAgensi();
    public TravelAgensiModel getAgensiByNoAgensi(Long noAgensi);
    public TravelAgensiModel updateAgensi(Long noAgensi, TravelAgensiModel AgensiUpdate);
    public void deleteAgensi(Long noAgensi);
    Mono<String> getStatus(Long noAgensi);
    Mono<AgensiDetail> postStatus();

}
