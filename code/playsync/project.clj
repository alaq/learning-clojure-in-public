(defproject playsync "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"] [org.clojure/core.async "0.1.346.0-17112a-alpha"]]
  :main ^:skip-aot playsync.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
