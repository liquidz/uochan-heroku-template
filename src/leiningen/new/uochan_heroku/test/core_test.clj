(ns {{name}}.core-test
  (:require
    [{{name}}.core     :refer :all]
    [conjure.core      :refer [stubbing]]
    [ring.mock.request :refer [request]]
    [midje.sweet       :refer :all]))

(fact "FIXME"
  (let [res (app (request :get "/"))]
    (:status res) => 200
    (:body res)   => "Hello, world"))

