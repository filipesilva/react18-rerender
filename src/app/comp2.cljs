(ns app.comp2
  (:require [reagent.core :as r]
            [app.comp3 :as comp3]))

(defn main []
  (println "render comp2")
  [:<>
   [:div "comp2"]
   [comp3/main]])
