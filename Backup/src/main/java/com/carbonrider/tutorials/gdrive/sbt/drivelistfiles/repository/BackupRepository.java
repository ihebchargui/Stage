package com.carbonrider.tutorials.gdrive.sbt.drivelistfiles.repository;

import com.carbonrider.tutorials.gdrive.sbt.drivelistfiles.entity.ParametrageBackup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BackupRepository extends JpaRepository<ParametrageBackup, Long> {

}
