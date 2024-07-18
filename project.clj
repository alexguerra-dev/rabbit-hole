(defproject rabbit-hole "0.1.0-SNAPSHOT"
  :description "Advetures of Alice in Wonderland In Clojure"
  :url "https://github.com/alexguerra-dev/rabbit-hole"
  :license {:name "The MIT License"
            :url "https://opensource.org/license/mit"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot rabbit-hole.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
