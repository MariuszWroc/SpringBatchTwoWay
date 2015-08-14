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
  job report służy do kopiowania z csv do bazy mysql   
*/
public class AppJobReportExport {

    private final static Logger fLogger = Logger.getLogger("AppJobReportExport");

    public static void main(String[] args) {
        fLogger.log(Level.INFO, "Export report csv to mysql");
        
        String[] springConfig
                = {"spring/batch/config/database.xml",
                    "spring/batch/config/context.xml",
                    "spring/batch/jobs/csvexport/job-report-export.xml",};

        ApplicationContext context
                = new ClassPathXmlApplicationContext(springConfig);

        JobLauncher jobReportLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job reportJob = (Job) context.getBean("reportExportJob");
        try {
            JobExecution execution = jobReportLauncher.run(reportJob, new JobParameters());
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
