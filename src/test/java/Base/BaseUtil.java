package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

import java.io.File;

/**
 * Created by Prasanth on 21/09/2019.
 */

public class BaseUtil {

    public static WebDriver Driver;

    public ExtentReports extent;

    public static ExtentTest scenarioDef;

    public static ExtentTest features;

    public static String reportLocation = System.getProperty("user.dir")+File.separator+"target";

}
