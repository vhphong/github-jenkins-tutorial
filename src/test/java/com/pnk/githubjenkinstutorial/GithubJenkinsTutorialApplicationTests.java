package com.pnk.githubjenkinstutorial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
class GithubJenkinsTutorialApplicationTests {

    public static Logger logger = LogManager.getLogger(GithubJenkinsTutorialApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case is executing..");

        assertEquals(true, true);
    }

}
