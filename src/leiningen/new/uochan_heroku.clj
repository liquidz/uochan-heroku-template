(ns leiningen.new.uochan-heroku
  (:require
    [leiningen.new.templates :refer [renderer name-to-path ->files]]
    [leiningen.core.main     :as main]))

(def render (renderer "uochan-heroku"))

(defn uochan-heroku
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' uochan-heroku project.")
    (->files data
             ["LICENSE" (render "LICENSE" data)]
             ["README.md" (render "README.md" data)]
             ["project.clj" (render "project.clj" data)]
             ["Procfile" (render "Procfile" data)]
             [".gitignore" (render ".gitignore" data)]
             ["src/{{sanitized}}/core.clj" (render "src/core.clj" data)]
             ["src/{{sanitized}}/server.clj" (render "src/server.clj" data)]
             ["test/{{sanitized}}/core_test.clj" (render "test/core_test.clj" data)]
             )))
