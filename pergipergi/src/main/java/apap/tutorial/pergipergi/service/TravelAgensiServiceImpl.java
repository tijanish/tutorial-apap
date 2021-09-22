package apap.tutorial.pergipergi.service;

import apap.tutorial.pergipergi.model.TravelAgensiModel;
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
    }

}
