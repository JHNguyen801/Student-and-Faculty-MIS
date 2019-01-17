package ultilities;

/**
 * <p>
 * Logger utility class.  This class can be used to log information to the
 * screen while your programming is running in order to track the progress
 * of your application.
 *
 * @author Hoang Nguyen
 */
public class Logger  {

	// constants used to specify a detail level
	private static final int ERROR = 1;
	private static final int WARN = 2;
	private static final int INFO = 3;
	private static final int DEBUG = 4;

	/**
	 * <p>The current detail level.
	 */
	private static int detailLevel = ERROR;

	/**
	 * <p>Enables or disables the logger.
	 */
	private static boolean enableLogging = true;

	/**
	 * <p>
	 * This method will log a 'debug' message.  This message will only
	 * appear in the log if the logger is enabled.
	 *
	 * @param message the message that you would like to log.
	 */
	public static void logDebug(String message)	{
		if (enableLogging && (detailLevel >= DEBUG)) {
			System.out.println("DEBUG: " + message);
		}
	}

	/**
	 * <p>
	 * This method will log an 'information' message.  This message will only
	 * appear in the log if the logger is enabled and the current detail
	 * level is set to INFO, WARNING, or ERROR.
	 *
	 * @param message the message that you would like to log.
	 */
	public static void logInfo(String message)  {
		if (enableLogging && (detailLevel >= INFO)) {
			System.out.println("INFO: " + message);
		}
	}

	/**
	 * <p>
	 * This method will log a 'warning' message.  This message will only
	 * appear in the log if the logger is enabled and the current detail
	 * level is set to WARNING, or ERROR.
	 *
	 * @param message the message that you would like to log.
	 */
	public static void logWarning(String message) {
		if (enableLogging && (detailLevel >= WARN)) {
			System.out.println("WARNING: " + message);
		}
	}

	/**
	 * <p>
	 * This method will log an 'error' message.  This message will only
	 * appear in the log if the logger is enabled and the current detail
	 * level is set to ERROR.
	 *
	 * @param message the message that you would like to log.
	 */
	public static void logError(String message)	{
		if (enableLogging && (detailLevel >= ERROR)) {
			System.out.println("ERROR: " + message);
		}
	}

	/**
	 * <p>
	 * Enables the logger.
	 */
	public static void enableLogging() {
		enableLogging = true;
	}

	/**
	 * <p>
	 * Disables the logger.
	 */
	public static void disableLogging() {
		enableLogging = false;
	}

	/**
	 * <p>
	 * Sets the current detail level to DEBUG.  This will cause all messages to be
	 * displayed as long as the logger is enabled.
	 *
	 */
	public static void setDetailDebug() {
		detailLevel = DEBUG;
	}

	/**
	 * <p>
	 * Sets the current detail level to INFO.  This will cause all messages that are
	 * logged using {@link #logInfo(String)}, {@link #logWarning(String)}, or {@link #logError(String)}
	 * to be displayed as long as the logger is enabled.
	 *
	 */
	public static void setDetailInfo() {
		detailLevel = INFO;
	}

	/**
	 * <p>
	 * Sets the current detail level to WARN.  This will cause all messages that are
	 * logged using {@link #logWarning(String)} or {@link #logError(String)}
	 * to be displayed as long as the logger is enabled.
	 *
	 */
	public static void setDetailWarning() {
		detailLevel = WARN;
	}

	/**
	 * <p>
	 * Sets the current detail level to ERROR.  This will cause all messages that are
	 * logged using {@link #logError(String)} to be displayed as long as the logger is enabled.
	 *
	 */
	public static void setDetailError() {
		detailLevel = ERROR;
	}

	/**
	 * <p>
	 * This constructor was hidden by marking it private.  Since all of the methods
	 * and data in the logger are static, there is no need for a constructor.  Therefore,
	 * we prevent the creation of a Logger class by marking this constructor private.
	 */
	private Logger() {};

	
}
