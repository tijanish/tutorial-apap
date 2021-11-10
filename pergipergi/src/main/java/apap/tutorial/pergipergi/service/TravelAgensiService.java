package apap.tutorial.pergipergi.service;

import apap.tutorial.pergipergi.model.TravelAgensiModel;
import apap.tutorial.pergipergi.rest.AgensiDetail;
import reactor.core.publisher.Mono;

import java.time.LocalTime;
import java.util.List;

public interface TravelAgensiService {
    void addAgensi(TravelAgensiModel travelAgensi);
    List<TravelAgensiModel> getListAgensi();
    TravelAgensiModel getAgensiByNoAgensi(Long noAgensi);
    TravelAgensiModel updateAgensi(TravelAgensiModel travelAgensi);
    void deleteAgensi(TravelAgensiModel travelAgensi);
    boolean isClosed(LocalTime waktuBuka, LocalTime waktuTutup);
}
