package apap.tutorial.pergipergi.controller;

import apap.tutorial.pergipergi.model.DestinasiModel;
import apap.tutorial.pergipergi.model.TourGuideModel;
import apap.tutorial.pergipergi.model.TravelAgensiModel;
import apap.tutorial.pergipergi.service.DestinasiService;
import apap.tutorial.pergipergi.service.TravelAgensiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TravelAgensiController {

    @Qualifier("travelAgensiServiceImpl")
    @Autowired
    private TravelAgensiService travelAgensiService;

    @Qualifier("destinasiServiceImpl")
    @Autowired
    private DestinasiService destinasiService;

    @GetMapping("/agensi/add")
    public String addAgensiFormPage(Model model){
        TravelAgensiModel agensi = new TravelAgensiModel();
        List<DestinasiModel> listDestinasi = destinasiService.getListDestinasi();
        List<DestinasiModel> listDestinasiNew = new ArrayList<DestinasiModel>();

        agensi.setListDestinasi(listDestinasiNew);
        agensi.getListDestinasi().add(new DestinasiModel());

        model.addAttribute("agensi", agensi);
        model.addAttribute("listDestinasiExisting", listDestinasi);
        return "form-add-agensi";
    }

    @PostMapping(value = "/agensi/add", params = {"save"})
    public String addAgensiSubmit(
            @ModelAttribute TravelAgensiModel agensi,
            Model model
    ) {
        if (agensi.getListDestinasi() == null) {
            agensi.setListDestinasi(new ArrayList<>());
        }
        travelAgensiService.addAgensi(agensi);
        model.addAttribute("noAgensi", agensi.getNoAgensi());
        return "add-agensi";
    }

    @PostMapping(value = "/agensi/add", params = {"addRow"})
    private String addRowDestinasiMultiple(
            @ModelAttribute TravelAgensiModel agensi,
            Model model
    ) {
        if (agensi.getListDestinasi() == null || agensi.getListDestinasi().size() == 0) {
            agensi.setListDestinasi(new ArrayList<>());
        }
        agensi.getListDestinasi().add(new DestinasiModel());
        List<DestinasiModel> listDestinasi = destinasiService.getListDestinasi();

        model.addAttribute("agensi", agensi);
        model.addAttribute("listDestinasiExisting", listDestinasi);

        return "form-add-agensi";
    }

    @PostMapping(value = "/agensi/add", params = {"deleteRow"})
    private String deleteRowDestinasiMultiple(
            @ModelAttribute TravelAgensiModel agensi,
            @RequestParam("deleteRow") Integer row,
            Model model
    ) {
        final Integer rowId = Integer.valueOf(row);
        agensi.getListDestinasi().remove(rowId.intValue());

        List<DestinasiModel> listDestinasi = destinasiService.getListDestinasi();

        model.addAttribute("agensi", agensi);
        model.addAttribute("listDestinasiExisting", listDestinasi);

        return "form-add-agensi";
    }

    @GetMapping("/agensi/viewall")
    public String listAgensi(Model model){
        List<TravelAgensiModel> listAgensi = travelAgensiService.getListAgensi();
        model.addAttribute("listAgensi", listAgensi);
        return "viewall-agensi";
    }

    @GetMapping("/agensi/view")
    public String viewDetailAgensiPage(
            @RequestParam(value = "noAgensi") Long noAgensi,
            Model model
    ){
        TravelAgensiModel agensi = travelAgensiService.getAgensiByNoAgensi(noAgensi);
        List<TourGuideModel> listTourGuide = agensi.getListTourGuide();

        model.addAttribute("agensi", agensi);
        model.addAttribute("listTourGuide", listTourGuide);
        model.addAttribute("listDestinasi", agensi.getListDestinasi());

<<<<<<< HEAD
        return "view-agensi";
    }

=======

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

    @GetMapping("/agensi/update/{noAgensi}")
    public String updateAgensiFormPage(
            @PathVariable Long noAgensi,
            Model model
    ){
        TravelAgensiModel agensi = travelAgensiService.getAgensiByNoAgensi(noAgensi);
        model.addAttribute("agensi", agensi);
        return "form-update-agensi";
    }

    @PostMapping("/agensi/update")
    public String updateAgensiSubmitPage(
            @ModelAttribute TravelAgensiModel agensi,
            Model model
    ){
        TravelAgensiModel updatedAgensi = travelAgensiService.updateAgensi(agensi);
        model.addAttribute("noAgensi", updatedAgensi.getNoAgensi());
        return "update-agensi";
    }

    @GetMapping("/agensi/delete/{noAgensi}")
    public String deleteAgensi(@PathVariable Long noAgensi, Model model) {
        LocalTime now = LocalTime.now();
        TravelAgensiModel agensi = travelAgensiService.getAgensiByNoAgensi(noAgensi);
        if ((now.isBefore(agensi.getWaktuBuka()) || now.isAfter(agensi.getWaktuTutup()))
                && agensi.getListTourGuide().isEmpty()) {
            travelAgensiService.deleteAgensi(agensi);
            model.addAttribute("noAgensi", agensi.getNoAgensi());
            return "delete-agensi";
        }
        return "error-notfound";
    }
}

}


>>>>>>> d18d1a995f9a93efb8700fad0e023ae226694355
    @GetMapping("/agensi/update/{noAgensi}")
    public String updateAgensiFormPage(
            @PathVariable Long noAgensi,
            Model model
    ){
        TravelAgensiModel agensi = travelAgensiService.getAgensiByNoAgensi(noAgensi);
        model.addAttribute("agensi", agensi);
        return "form-update-agensi";
    }

    @PostMapping("/agensi/update")
    public String updateAgensiSubmitPage(
            @ModelAttribute TravelAgensiModel agensi,
            Model model
    ){
        TravelAgensiModel updatedAgensi = travelAgensiService.updateAgensi(agensi);
        model.addAttribute("noAgensi", updatedAgensi.getNoAgensi());
        return "update-agensi";
    }

    @GetMapping("/agensi/delete/{noAgensi}")
    public String deleteAgensi(@PathVariable Long noAgensi, Model model) {
        LocalTime now = LocalTime.now();
        TravelAgensiModel agensi = travelAgensiService.getAgensiByNoAgensi(noAgensi);
        if ((now.isBefore(agensi.getWaktuBuka()) || now.isAfter(agensi.getWaktuTutup()))
                && agensi.getListTourGuide().isEmpty()) {
            travelAgensiService.deleteAgensi(agensi);
            model.addAttribute("noAgensi", agensi.getNoAgensi());
            return "delete-agensi";
        }
        return "error-notfound";
    }
<<<<<<< HEAD
}
=======
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

>>>>>>> d18d1a995f9a93efb8700fad0e023ae226694355
