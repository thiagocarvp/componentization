(ns componentization.components
  (:require [com.stuartsierra.component :as component]
            [io.pedestal.http :as http]
            [componentization.components.service :as service]
            [componentization.routes :as routes]))

(def system (atom {}))

(defn create-system
  [env]
  (component/system-map
    :service-map {:env          env
                  ::http/routes routes/routes
                  ::http/type   :jetty
                  ::http/port   8080
                  ::http/join?  false
                  ::http/host   "0.0.0.0"
                  ;::http/allowed-origins {:creds true :allowed-origins (constantly true)}
                  }

    :service (component/using (service/new-service) [:service-map])))

(defn start-system
  []
  (->> (create-system :prod)
       component/start-system
       (reset! system)))

(defn stop-system
  []
  (->> (component/stop-system @system)
       (reset! system)))
