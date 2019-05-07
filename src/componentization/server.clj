(ns componentization.server
  (:gen-class)
  (:require [componentization.components :as server]))

(defn -main
  "I don't do a whole lot."
  [& args]
  (server/start-system))
