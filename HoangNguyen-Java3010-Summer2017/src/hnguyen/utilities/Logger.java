/*
 * This logger class has the following methods that use to called by TestLogger class
 * enableLogging, disableLogging, setLogLevel,logDebug, logInfo, logWarning, and logError
 */
package hnguyen.utilities;

/*
 * @author hoang nguyen
 */
public class Logger 
{
    // Create variables to determine the loggig level
    static boolean logEnabled;  
    public static int error = 1;
    public static int warning = 2;
    public static int informational = 3;
    public static int debug = 4;
    public static int logLevel = 0;
    
    // this method called by TestLogger to turn on
    public static void enableLogging()
    {
        logEnabled = true;
    }
    // this method called by TestLogger to turn off
    public static void disableLogging()
    {
        logEnabled = false;
    }     
    // This method is to diplay the debug log level message        
    public static void logDebug(String strMessage)
    {
        if (logEnabled && (logLevel >= 4))
        {
            System.out.println("DEBUG: " + strMessage);
        }
    }
    // This method is to diplay the info log level message 
    public static void logInfo(String strMessage)
    {
        if (logEnabled && (logLevel >= 3))
        {
            System.out.println("INFO: " + strMessage);
        }
    }
    // This method is to diplay the warning log level message 
    public static void logWarning(String strMessage)
    {
        if(logEnabled && (logLevel >= 2))
        System.out.println("WARNING: " + strMessage);
    }
    // This method diplay the error log level message 
    public static void logError(String strMessage)
    {
        if(logEnabled && (logLevel >= 1))
        System.out.println("ERROR: " + strMessage);     
    }
    // this method print four messages to indicate a problem in debug mode
    public static void setDetailDebug()
    {
        logLevel = debug;                         
    }   
    // this method print three test failed messages to indicate a problem 
    public static void setDetailInfo()
    {
        logLevel = informational;
    }
    // this method print two test failed messages to indicate a problem 
    public static void setDetailWarning()
    {
        logLevel = warning;
    }
    // this method only print one test failed message to indicate an error
    public static void setDetailError()
    {
        logLevel = error;
    }
}
