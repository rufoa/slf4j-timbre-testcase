package org.example.blacklistingtest;

import org.apache.log4j.Logger;

public class Log4jEmitter
{
	final static Logger logger = Logger.getLogger(Log4jEmitter.class);

	public static void emitError (String msg)
	{
		logger.error(msg);
	}
}