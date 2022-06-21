package tn.esprit.spring;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.EmployeServiceImpl;
import tn.esprit.spring.services.TimesheetServiceImpl;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TimeSheetTest {
    @Autowired
    TimesheetServiceImpl timesheetService ;
    @Autowired
    EmployeServiceImpl employeService ;

    @Test
    @Rollback(false)
    public void createMission() {
        Mission m = new Mission("mission1","desc1");
//        log.info("TESTING CREATION Missions IN PROGRESS");
           int id = timesheetService.ajouterMission(m);
        assertNotNull(id);


    }

 /*   @Test
    public void getAllEmployeByMission() {
        Mission m = new Mission("mission1","desc1");
//        log.info("TESTING GET ALL Employees IN PROGRESS");
        int id = timesheetService.ajouterMission(m);
        List<Employe> employes = timesheetService.getAllEmployeByMission(id);
        Assertions.assertThat(employes.size()).isGreaterThan(0);
    }
    @Test
    public void findAllMissionByEmployeJPQL() {
        Employe e = new Employe("aziz","bourguiba","azizbourguiba@gmail.com",true, Role.CHEF_DEPARTEMENT);
//        log.info("TESTING GET ALL Missions IN PROGRESS");
        int id = employeService.ajouterEmploye(e);
        List<Mission> missions = timesheetService.findAllMissionByEmployeJPQL(id);
        Assertions.assertThat(missions.size()).isGreaterThan(0);
    }*/
}