
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.*;
public class ExtReport {
	static ExtentReports reports;
	static ExtentTest logger;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * changes for git
		 */
		SimpleDateFormat simpledateformatter = new SimpleDateFormat("'sampledemo_'yyyyMMddHHmm'.html'");
		Date currentDate =new Date();
		String filename = simpledateformatter.format(currentDate);
		String path = "C:\\Users\\auhum\\Desktop\\ExtendReport\\"+filename;
		reports = new ExtentReports (path);
		logger = reports.startTest("Login into the gmail");
		logger.log(LogStatus.INFO, "we have entered valid mail");
		logger.log(LogStatus.PASS, " enter mail id");
		logger.log(LogStatus.INFO, " enter the valid password");
		logger.log(LogStatus.PASS, " enter password");
		logger.log(LogStatus.INFO, " press the login");
		logger.log(LogStatus.PASS,"logged in");
		
		
		logger = reports.startTest("remember me");
		logger.log(LogStatus.INFO, "we have entered valid mail");
		logger.log(LogStatus.PASS, " enter mail id");
		logger.log(LogStatus.INFO, " enter the valid password");
		logger.log(LogStatus.PASS, " enter password");
		logger.log(LogStatus.INFO, " remember me");
		logger.log(LogStatus.PASS, " remembers me");
		logger.log(LogStatus.INFO, " press the login");
		logger.log(LogStatus.FAIL,"logged in");
		reports.endTest(logger);
		reports.flush(); 
	}
	

}
