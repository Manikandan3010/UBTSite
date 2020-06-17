package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.cucumber.listener.Reporter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@IncorrectDataValidation",
		      
		   plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
           glue = "com.automation.steps",
        dryRun = false,
          
        features = "src/test/java/features/")
public class TestRunner {
	@BeforeClass
    public static void setup() {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(8/06/2020));
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("cucumber-reports/"+timeStamp.replace(":","_").replace(".","_")+".html");
    }


    @AfterClass
    public static void writeExtentReport() {
    	
    	Reporter.loadXMLConfig("C:\\Users\\manikandan.r\\workspace\\Test\\src\\test\\resources\\extent-config.xml");
        //Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
    }
      }
 
	

