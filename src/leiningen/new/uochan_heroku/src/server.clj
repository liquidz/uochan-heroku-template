(ns {{name}}.server
  (:require
    [{{name}}.core          :as core]
    [ring.adapter.jetty     :refer [run-jetty]]
    [ring.middleware.reload :refer [wrap-reload]]))

(def ^{:private true} DEFAULT_PORT 8080)

(defn run
  [route & [port]]
  (run-jetty
    route
    {:port  (Integer. (or port DEFAULT_PORT))
     :join? false}))

(def -main #(apply run core/app %&))
(def -dev-main #(apply run (wrap-reload core/app) %&))
