package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {
        Date date = new Date();
        UserDemography userDemography= UserDemographyFactory.buildUserDemography("user@cput.ca.za", "Dean", "M", "B", date);
        assertNotNull(userDemography);
        System.out.println(userDemography.toString());
    }
}