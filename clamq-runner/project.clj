(defproject carelogistics/clamq-runner "0.5.0-SNAPSHOT"
 :description "Clojure APIs for Message Queues"
 :dependencies [[org.slf4j/slf4j-api "1.7.21"]
                [org.slf4j/slf4j-simple "1.7.21"]
                [carelogistics/clamq-activemq "0.5.0-SNAPSHOT"]
                [carelogistics/clamq-rabbitmq "0.5.0-SNAPSHOT"]]
 :aot [clamq.runner.main]
 :main clamq.runner.main)
