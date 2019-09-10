package C_zentrix_Services.C_zentrix_Services;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;
public class Service extends Method3 
{
	ExtentReports extent;
	 ExtentTest   logger;
	@BeforeTest
	public void before()
	{
		   extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/STMExtentReport.html",true);
		   extent.addSystemInfo("Host name", "softwsre Testing Material");
		   extent.addSystemInfo("Environment", "Automation Testing");
		   extent.addSystemInfo("User Name", "Himanshu");
		   Method3.methodTest();
	}
  @Test
	public void  cz_dialer_data_pl()
	{
	 try {
	      System.out.println("start cz_dialer_data_pl service  test");
		 s2=se1;
      	System.out.println(s2);
      	  j=s1.indexOf(s2);
           System.out.println(j);
        if(j!=-1)
           {
        	  logger = extent.startTest("cz_dialer_data_pl service");
     	      //Assert.assertTrue(true);
         	  logger.log(LogStatus.PASS, " cz_dialer_data_pl service  is running");
          	 System.out.println("string match");
           }
           else
           {
        	   logger = extent.startTest("cz_dialer_data_pl");
   	    //	Assert.assertTrue(true);
   	    	logger.log(LogStatus.FAIL, "cz_dialer_data_pl service  is not running");
         	  System.out.println("string is not match");
           }
    	  System.out.println("cz_dialer_data_pl service test is closed");
 	     }
		  catch(Exception e)
		  {
			  e.printStackTrace();
			  System.out.println(e.getMessage()+" catch block");
			 
		  }
	}
  @Test
   public void channel_health_pl()
   {
	   try {
		      System.out.println("start channel_health_pl service  test");
			
	     	 s2=se2;
	      	System.out.println(s2);
	      	  j=s1.indexOf(s2);
	           System.out.println(j);
	        if(j!=-1)
	           {
	          	 System.out.println("string match");
	          	  logger = extent.startTest("channel_health_pl service");
		 	      //Assert.assertTrue(true);
		     	  logger.log(LogStatus.PASS, " channel_health_pl service  is running");
	           }
	           else
	           {
	        	   logger = extent.startTest("channel_health_pl service");
			 	      //Assert.assertTrue(true);
			     	  logger.log(LogStatus.FAIL, "channel_health_pl service  is not running");
	         	  System.out.println("string is not match");
	           }
	    	  System.out.println("channel_health_pl service test is closed");
	 	     }
			  catch(Exception e)
			  {
				  System.out.println(e.getMessage()+" catch block");
			  }
   }
   @Test
   public void dialer_manager_listen_pl()
   {
	   try {
		     
	     	 s2=se3;
	      	System.out.println(s2);
	      	  j=s1.indexOf(s2);
	           System.out.println(j);
	        if(j!=-1)
	           {
	        	 System.out.println("start dialer_manager_listen_pl service  test");
				  logger = extent.startTest("dialer_manager_listen_pl service");
		 	      //Assert.assertTrue(true);
		     	  logger.log(LogStatus.PASS, " dialer_manager_listen_pl service  is running");
	          	 System.out.println("string match");
	           }
	           else
	           {
	        	   System.out.println("start dialer_manager_listen_pl service  test");
	 			  logger = extent.startTest("dialer_manager_listen_pl service");
	 	 	      //Assert.assertTrue(true);
	 	     	  logger.log(LogStatus.FAIL, " dialer_manager_listen_pl service  is not running");
	         	  System.out.println("string is not match");
	           }
	    	  System.out.println("dialer_manager_listen_pl service test is closed");
	 	     }
			  catch(Exception e)
			  {
				  System.out.println(e.getMessage()+" catch block");
			  }
   }
   @Test
   public void erp_manager_pl()
   {
	   System.out.println("start erp_manager_pl service  test");
		
  	 s2=se4;
   	System.out.println(s2);
   	  j=s1.indexOf(s2);
        System.out.println(j);
     if(j!=-1)
        {
    	  logger = extent.startTest("erp_manager_pl service");
	      //Assert.assertTrue(true);
  	  logger.log(LogStatus.PASS, " erp_manager_pl service  is running");
       	 System.out.println("string match");
        }
        else
        {
        	  logger = extent.startTest("erp_manager_pl service");
    	      //Assert.assertTrue(true);
      	  logger.log(LogStatus.FAIL, " erp_manager_pl service  is not running");
      	  System.out.println("string is not match");
        }
 	  System.out.println("erp_manager_pl service test is closed");
   }
   @Test
   public void dialer_reporter_pl()
   {
	   try {
		      System.out.println("start dialer_reporter_pl service  test");
			
	     	 s2=se5;
	      	System.out.println(s2);
	      	  j=s1.indexOf(s2);
	           System.out.println(j);
	        if(j!=-1)
	           {
	        	  logger = extent.startTest("dialer_reporter_pl service");
		 	      //Assert.assertTrue(true);
		     	  logger.log(LogStatus.PASS, " dialer_reporter_pl service  is running");
	          	 System.out.println("string match");
	           }
	           else
	           {
	        	   logger = extent.startTest("dialer_reporter_pl service");
	 	 	      //Assert.assertTrue(true);
	 	     	  logger.log(LogStatus.FAIL, " dialer_reporter_pl service  is not running");
	         	  System.out.println("string is not match");
	           }
	    	  System.out.println("dialer_reporter_pl service test is closed");
	 	     }
			  catch(Exception e)
			  {
				  System.out.println(e.getMessage()+" catch block");
			  }
   }
   @Test
   public void czentrix_dialer_pl()
   {
	   try {
		      System.out.println("start czentrix_dialer_pl service  test");
			 
	     	 s2=se6;
	      	System.out.println(s2);
	      	  j=s1.indexOf(s2);
	           System.out.println(j);
	        if(j!=-1)
	           {
	        	 logger = extent.startTest("czentrix_dialer_pl service");
		 	      //Assert.assertTrue(true);
		     	  logger.log(LogStatus.PASS, " czentrix_dialer_pl service  is running");
	          	 System.out.println("string match");
	           }
	           else
	           {
	        	   logger = extent.startTest("czentrix_dialer_pl service");
	 	 	      //Assert.assertTrue(true);
	 	     	  logger.log(LogStatus.FAIL, " czentrix_dialer_pl service  is not running");
	         	  System.out.println("string is not match");
	           }
	    	  System.out.println("czentrix_dialer_pl service test is closed");
	 	     }
			  catch(Exception e)
			  {
				  System.out.println(e.getMessage()+" catch block");
			  }
   }
   @Test
   public void ftp_client_pl()
   {
	   try {
		      System.out.println("start ftp_client_pl service  test");
			 
	     	 s2=se7;
	      	System.out.println(s2);
	      	  j=s1.indexOf(s2);
	           System.out.println(j);
	        if(j!=-1)
	           {
	        	 logger = extent.startTest("ftp_client_pl service");
		 	      //Assert.assertTrue(true);
		     	  logger.log(LogStatus.PASS, " ftp_client_pl service  is running");
	          	 System.out.println("string match");
	           }
	           else
	           {
	        	   logger = extent.startTest("ftp_client_pl service");
	 	 	      //Assert.assertTrue(true);
	 	     	  logger.log(LogStatus.FAIL, " ftp_client_pl service  is not running");
	         	  System.out.println("string is not match");
	           }
	    	  System.out.println("ftp_client_pl service test is closed");
	 	     }
			  catch(Exception e)
			  {
				  System.out.println(e.getMessage()+" catch block");
			  }
   }
   
	@AfterMethod
	 public void getResult(ITestResult result)
	 {     
	  if(result.getStatus()==ITestResult.FAILURE) 
	   {
	    logger.log(LogStatus.FAIL, "Test case failed is "+result.getName());
	    logger.log(LogStatus.FAIL, "Test case failed is "+result.getThrowable());
	   }
	  else if(result.getStatus()==ITestResult.SKIP)
	   {
	    logger.log(LogStatus.SKIP, "Test case skipped is"+result.getName());
	   }
	   extent.endTest(logger);
	}
	    @AfterTest
	    public void endReport()
	    {
	    	extent.flush();
	    	//extent.close();
	    }
}
