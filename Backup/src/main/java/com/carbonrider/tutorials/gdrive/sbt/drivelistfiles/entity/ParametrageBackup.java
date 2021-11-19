package com.carbonrider.tutorials.gdrive.sbt.drivelistfiles.entity;


import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ParametrageBackup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String urlBD;
    private String emailReceiverBackup;
    private String emailSenderBackup;
    private String patternShedular;
    private String client;



}
