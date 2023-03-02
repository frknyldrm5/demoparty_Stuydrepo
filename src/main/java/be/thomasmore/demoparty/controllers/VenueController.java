package be.thomasmore.demoparty.Controllers;


import be.thomasmore.demoparty.Model.Venue;
import be.thomasmore.party.repositories.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class VenueController {

    @Autowired
    private VenueRepository venueRepository;

    @GetMapping("/venuedetails")
    public String venueDetails(Model model){
//        Venue venue = new Venue("Roma","http://www.deroma.be");
//        model.addAttribute("venue",venue);

//        Venue venue = new Venue("DEN AALMOEZENIER","https://www.denaalmoezenier.com/");
//        venue.setCapacity(2000);
//        venue.setFoodProvided(true);
//        venue.setIndoor(true);
//        venue.setOutdoor(false);
//        venue.setFreeParkingAvailable(false);
//        venue.setDistanceFromPublicTransportInKm(1.0);
//        venue.setCity("Antwerpen");


        Optional<Venue> optionalVenue = venueRepository.findById(1);
        if (optionalVenue.isPresent()) {
            model.addAttribute("venue", optionalVenue.get());
        }


        return "venuedetails";
    }




}
