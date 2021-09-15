package apap.tutorial.pergipergi.controller;

import apap.tutorial.pergipergi.model.TravelAgensiModel;
import apap.tutorial.pergipergi.service.TravelAgensiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class TravelAgensiController {
    @Autowired
    private TravelAgensiService travelAgensiService;

    //Routing URL
    @RequestMapping("agensi/add")
    public String addAgensi(
            @RequestParam(value = "idAgensi", required = true) String idAgensi,
            @RequestParam(value = "namaAgensi", required = true) String namaAgensi,
            @RequestParam(value = "alamat", required = true) String alamat,
            @RequestParam(value = "noTelepon", required = true) String noTelepon,
            Model model
    ) {
        TravelAgensiModel agensi = new TravelAgensiModel(idAgensi, namaAgensi, alamat, noTelepon);
        travelAgensiService.addAgensi(agensi);
        model.addAttribute("idAgensi", idAgensi);
        return "add-agensi";
    }

    @RequestMapping("agensi/viewAll")
    public String listAgensi(Model model) {
        List<TravelAgensiModel> listAgensi = travelAgensiService.getListAgensi();
        model.addAttribute("listAgensi", listAgensi);
        return "viewall-agensi";
    }

    @RequestMapping("agensi/view")
    public String detailAgensi(
            @RequestParam(value = "idAgensi") String idAgensi,
            Model model
    ) {
        TravelAgensiModel agensi = travelAgensiService.getAgensiByIdAgensi(idAgensi);
        model.addAttribute("agensi", agensi);

        return "view-agensi";
    }

    @RequestMapping("agensi/view/id-agensi/{idAgensi}")
    public String viewIdAgensi(
            @PathVariable(value = "idAgensi") String idAgensi,
            Model model) {
        TravelAgensiModel agensi = travelAgensiService.getAgensiByIdAgensi(idAgensi);
        model.addAttribute("agensi", agensi);

        return "view-agensi";
    }


    @RequestMapping("agensi/delete/id-agensi/{idAgensi}")
    public String deleteIdAgensi(
            @PathVariable(value = "idAgensi") String idAgensi,
            Model model) {
        for (int i = 0; i < travelAgensiService.getListAgensi().size(); i++) {
            if (travelAgensiService.getListAgensi().get(i).getIdAgensi().equals(idAgensi)) {
                travelAgensiService.getListAgensi().remove(travelAgensiService.getListAgensi().get(i));
            }
        }
        return "delete-agensi";
    }

    @RequestMapping("agensi/update/id-agensi/{idAgensi}/no-telepon/{noTelepon}")
    public String updateAgensi(
            @PathVariable(value = "idAgensi") String idAgensi,
            @PathVariable(value = "noTelepon") String noTelepon,
            Model model) {

        TravelAgensiModel agensi = travelAgensiService.getAgensiByIdAgensi(idAgensi);
        agensi.setNoTelepon(noTelepon);
        return "update-agensi";
    }

}
