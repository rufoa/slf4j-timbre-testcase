(ns blacklisting-test.core
	(:require
		[taoensso.timbre :as timbre]
		[taoensso.timbre.appenders.core :as appenders])
	(:import
		(org.example.blacklistingtest Log4jEmitter)))

(defn -main
	[& _]
	(timbre/with-config {:level :trace :appenders {:println (appenders/println-appender)}}
		(Log4jEmitter/emitError "this should be visible"))
	(timbre/with-config {:level :trace :appenders {:println (appenders/println-appender)} :ns-blacklist ["org.example.*"]}
		(Log4jEmitter/emitError "this should be hidden")))