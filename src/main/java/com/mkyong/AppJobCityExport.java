package com.mkyong;

/**
 * http://www.mkyong.com/spring-batch/spring-batch-example-csv-file-to-database/
 *
 */
 
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

/*
  job city służy do kopiowania z csv do bazy mysql   
*/

public class AppJobCityExport {

    private final static Logger fLogger = Logger.getLogger("AppJobCityExport");

    public static void main(String[] args) {
        fLogger.log(Level.INFO, "Export city csv to mysql");
        String[] springConfig
                = {"spring/batch/config/database.xml",
                    "spring/batch/config/context.xml",
                    "spring/batch/jobs/csvexport/job-city-export.xml"
                };

        ApplicationContext context
                = new ClassPathXmlApplicationContext(springConfig);

        JobLauncher jobCityLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job cityJob = (Job) context.getBean("cityExportJob");

        try {
            JobExecution execution = jobCityLauncher.run(cityJob, new JobParameters());
            fLogger.log(Level.INFO, "Exit Status : {0}", execution.getStatus());
        } catch (JobParametersInvalidException e) {
            e.getMessage();
        } catch (JobExecutionAlreadyRunningException e) {
            e.getMessage();
        } catch (JobInstanceAlreadyCompleteException e) {
            e.getMessage();
        } catch (JobRestartException e) {
            e.getMessage();
        }
        fLogger.log(Level.INFO, "Done");
    }
}
