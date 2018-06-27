package travis.test;

import org.junit.Test;


public class TravisTestTwoTest {

    @Test
    public void shouldRunLogger() throws Exception {
        TravisTestTwo travis = new TravisTestTwo();
        travis.useProjectOne();

    }

}