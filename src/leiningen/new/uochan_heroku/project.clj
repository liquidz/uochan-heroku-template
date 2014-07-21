(defproject {{name}} "0.0.1"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]
                 [ring/ring-jetty-adapter "1.3.0"]
                 [ring/ring-devel "1.3.0"]]
  :uberjar-name "{{sanitized}}-standalone.jar"

  :profiles {:dev {:dependencies
                   [[midje "1.6.3" :exclusions [org.clojure/clojure]]
                    [ring-mock "0.1.5"]
                    [org.clojars.runa/conjure "2.2.0"] ]}}
  :plugins [[lein-midje "3.1.3"]]

  :aliases {"dev-run" ["run" "-m" "{{name}}.server/-dev-main"]}
  :min-lein-version "2.0.0"
  :main {{name}}.server)
