(defproject blacklisting-test "0.1.0-SNAPSHOT"
	:dependencies
		[[org.clojure/clojure "1.8.0"]
		[org.slf4j/log4j-over-slf4j "1.7.21"]
		[com.fzakaria/slf4j-timbre "0.3.2"]
		[com.taoensso/timbre "4.3.1"]]
	:source-paths ["src" "src/clojure"]
	:java-source-paths ["src/java"]
	:main blacklisting-test.core)