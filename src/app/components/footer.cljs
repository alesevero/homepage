(ns app.components.footer
  (:require [stylefy.core :as stylefy :refer [use-style use-sub-style]]))

(def style {:width "100%"
            :max-width "1120px"
            :height "40px"
            :display "flex"
            :justify-content "space-between"
            :position "absolute"
            :bottom "0"
            ::stylefy/sub-styles {:text {:font-size "16px"
                                         :font-family "Playfair Display"}
                                  :strong {:font-size "16px"
                                           :font-family "Playfair Display"
                                           :font-weight "700"}}})

(defn footer
  []
  [:div (use-style style)
   [:p (use-sub-style style :text)
    "Crafted with love by "
    [:strong (use-sub-style style :strong) "Alexandre Severo."]]
   [:p (use-sub-style style :text)
    "Built with "
    [:strong (use-sub-style style :strong) "ClojureScript"]
    " and "
    [:strong (use-sub-style style :strong) "Reagent."]]])