package com.shravs.runner;

import com.shravs.Entity.CitizenPlan;
import com.shravs.Repository.CitizenPlanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private CitizenPlanRepo repo;


    @Override
    public void run(ApplicationArguments args) throws Exception{
        CitizenPlan pl1 = new CitizenPlan("John","john@gmail", 8064011480L,"Male", 54354765L,"Cash","Approved", LocalDate.now(),LocalDate.now().plusMonths(6));
        CitizenPlan pl2 = new CitizenPlan("Sam","sam@gmail", 6011480L,"Female",54354765L,"Cash","Denied",null,null);
        CitizenPlan pl3= new CitizenPlan("Pat","pat@gmail", 641480L,"Male",5454765L,"Food","Denied",null,null);
        CitizenPlan pl4= new CitizenPlan("Abhi","abhi@gmail", 940641480L,"Male",4354765L,"Food","Approved",LocalDate.now(),LocalDate.now().plusMonths(6));
        CitizenPlan pl5 = new CitizenPlan("Harry","harry@gmail", 34011480L,"Male", 3354765L,"Medical","Approved", LocalDate.now(),LocalDate.now().plusMonths(6));
        CitizenPlan pl6 = new CitizenPlan("Ron","ron@gmail", 11480L,"Female",354765L,"Medical","Denied",null,null);
        List<CitizenPlan> records = Arrays.asList(pl1,pl2,pl3,pl4,pl5,pl6);
        repo.saveAll(records);

    }
}
