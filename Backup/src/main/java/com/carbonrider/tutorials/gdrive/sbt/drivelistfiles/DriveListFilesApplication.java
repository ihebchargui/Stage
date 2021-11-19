package com.carbonrider.tutorials.gdrive.sbt.drivelistfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class DriveListFilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriveListFilesApplication.class, args);
	}

}
