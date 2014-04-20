(ns {{name}}.core
  (:require
    [compojure.core  :refer [defroutes GET]]
    [compojure.route :refer [not-found]]))

(defn greeting
  []
  "Hello, world")

(defroutes app
  (GET "/" [] (greeting))
  (not-found "page not found"))
