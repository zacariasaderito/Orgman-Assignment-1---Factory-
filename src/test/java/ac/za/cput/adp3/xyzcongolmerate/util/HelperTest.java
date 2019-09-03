package ac.za.cput.adp3.xyzcongolmerate.util;

import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelperTest {

    @Test
    public void generateRandomGivenSuffix() {
        Helper helper = new Helper();
        RaceFactory race = new RaceFactory();
        String suffix = helper.getSuffixFromClassName(race.getClass());

        String suffixKey = helper.generateRandomGivenSuffix(suffix);
        System.out.println(suffixKey);

    }

    @Test
    public void getClassName() {
    }

    @Test
    public void getSuffixFromClassName() {

        RaceFactory race = new RaceFactory();
        Helper helper = new Helper();

        String suffix = helper.getSuffixFromClassName(race.getClass());
        assertEquals("RF", suffix);
        System.out.println(suffix);

    }
}