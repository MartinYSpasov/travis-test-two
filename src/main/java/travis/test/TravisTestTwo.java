package travis.test;

import java.util.logging.Logger;

public class TravisTestTwo {

    Logger logger = Logger.getLogger(TravisTestTwo.class.getName());

    public void useProjectOne(){
        TravisTestOne travisTestOne = new TravisTestOne();
        logger.severe("Run travis-test-TWO LOGGER !!!");
        logger.severe(travisTestOne.runLogger().concat(" from TEST-TWO"));
    }
}
