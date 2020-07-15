(defproject omnilisp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.graalvm.truffle/truffle-api "19.3.0"]
                 [org.antlr/antlr4-runtime "4.8"]
                 [org.antlr/antlr4 "4.8"]
                 [org.clojure/tools.logging "1.1.0"]
                 [org.apache.logging.log4j/log4j-core "2.13.0"]
                 [org.apache.logging.log4j/log4j-api "2.13.0"]
                 [org.apache.logging.log4j/log4j-jcl "2.13.0"]]
  :source-paths ["src/clj"]
  :java-source-paths ["src/java/"]
  :global-vars {*warn-on-reflection* true}
  :profiles {:dev {:source-paths ["src" "dev"]
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]]
                   :plugins [[cider/cider-nrepl "0.25.2"]]              
                   :repl-options {:init-ns user}
                   :init (println "here we are in" *ns*)}
             :uberjar {:main omnilisp.core
                       :aot :all}})




