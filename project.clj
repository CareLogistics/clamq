(defproject carelogistics/clamq "0.5.0-SNAPSHOT"
 :description "Clojure APIs for Message Queues"
 :dev-dependencies
    [[lein-sub "0.1.2"]]
  :sub
    ["clamq-core"
     "clamq-jms"
     "clamq-activemq"
     "clamq-rabbitmq"
     "clamq-runner"]
  :plugins [[lein-sub "0.3.0"]])
