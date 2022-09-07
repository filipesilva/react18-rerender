(ns app.core
  (:require ["react-dom/client" :refer [createRoot]]
            [app.comp1 :as comp1]
            [reagent.core :as r]
            [reagent.dom :as rd]))

(defonce root (createRoot (.getElementById js/document "app")))

(defn ^:dev/after-load render
  []
  (.render root (r/as-element [comp1/main]))
  ;; Fix #1 - render a comp with an anonymous fn, which always changes identity
  ;; (.render root (r/as-element [(fn [] comp1/main)]))
  )

(defn ^:export main
  []
  (render))
