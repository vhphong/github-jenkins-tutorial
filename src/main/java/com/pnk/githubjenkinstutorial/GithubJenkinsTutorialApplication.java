package com.pnk.githubjenkinstutorial;

//import lombok.extern.log4j.Log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GithubJenkinsTutorialApplication {

    public static Logger logger = LogManager.getLogger(GithubJenkinsTutorialApplication.class);


    public static void message() {
        logger.info("Application started..");
    }


    public static void main(String[] args) {
        logger.info("Application started..");
        SpringApplication.run(GithubJenkinsTutorialApplication.class, args);
    }

}
