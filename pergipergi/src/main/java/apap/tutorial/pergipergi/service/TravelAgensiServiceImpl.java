package apap.tutorial.pergipergi.service;

import apap.tutorial.pergipergi.model.TravelAgensiModel;
<<<<<<< HEAD
=======

>>>>>>> d18d1a995f9a93efb8700fad0e023ae226694355
import apap.tutorial.pergipergi.repository.TravelAgensiDb;
import apap.tutorial.pergipergi.rest.AgensiDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import javax.transaction.Transactional;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TravelAgensiServiceImpl implements TravelAgensiService{

    @Autowired
    TravelAgensiDb travelAgensiDb;

    @Override
    public void addAgensi(TravelAgensiModel travelAgensi) {
        travelAgensiDb.save(travelAgensi);
    }

    @Override
    public List<TravelAgensiModel> getListAgensi() {
        return travelAgensiDb.findAll();
    }

    @Override
    public TravelAgensiModel getAgensiByNoAgensi(Long noAgensi) {
        Optional<TravelAgensiModel> agensi = travelAgensiDb.findByNoAgensi(noAgensi);
        if(agensi.isPresent()) return agensi.get();
        else return null;
    }

    @Override
    public TravelAgensiModel updateAgensi(TravelAgensiModel travelAgensi) {
        travelAgensiDb.save(travelAgensi);
        return travelAgensi;
    }

    @Override
    public void deleteAgensi(TravelAgensiModel travelAgensi) {
        travelAgensiDb.delete(travelAgensi);
    }

    @Override
    public boolean isClosed(LocalTime waktuBuka, LocalTime waktuTutup){
        LocalTime now = LocalTime.now();
        if (now.isBefore(waktuBuka) || now.isAfter(waktuTutup)){
            return true;
        }
        return false;
<<<<<<< HEAD
=======

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TravelAgensiServiceImpl implements TravelAgensiService{
    private ArrayList<TravelAgensiModel> listAgensi;

    public TravelAgensiServiceImpl(){
        listAgensi = new ArrayList<>();
    }

    @Override
    public void addAgensi(TravelAgensiModel travelAgensiModel){
        listAgensi.add(travelAgensiModel);
    }

    @Override
    public List<TravelAgensiModel> getListAgensi(){
        return listAgensi;
    }

    @Override
    public TravelAgensiModel getAgensiByIdAgensi(String idAgensi) {
        for (int i = 0; i < listAgensi.size(); i++) {
            if (listAgensi.get(i).getIdAgensi().equals(idAgensi)) {
                return listAgensi.get(i);
            }
        }
        return null;
>>>>>>> d18d1a995f9a93efb8700fad0e023ae226694355
    }

}
