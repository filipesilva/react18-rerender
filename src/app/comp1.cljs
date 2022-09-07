(ns 
 ;; Fix #2 - hint shadow-cljs to always reload the ns with the comp being rendered in root
 ;; ^:dev/always
 app.comp1
  (:require [reagent.core :as r]
            [app.comp2 :as comp2]))

(defn main []
  (println "render comp1")
  [:<>
   [:div "comp1"] 
   [comp2/main]])
