(ns app.views.navigation.styles
  (:require [stylefy.core :as stylefy]))

(defn link
  [id active-nav]
  {:color "#191C24"
   :text-decoration "none"
   :font-size "16px"
   :font-weight (when (= active-nav id) "700")
   :margin "8px"
   :padding "0px"
   :transition "opacity 0.6s"
   ::stylefy/mode [[:hover {:opacity "0.6"}]
                   [:after {:position "absolute"
                            :background-color "#EBEBEB"
                            :width "100%"
                            :bottom "2%"
                            :left 0
                            :height "12px"
                            :z-index -1}]]})

(def container {:style {:width "100%"
                        :display "flex"
                        :justify-content "center"
                        :align-items "center"
                        :position "absolute"}})

(def header-container {:style {:width "100%"
                               :max-width "1120px"
                               :display "flex"
                               :align-items "center"
                               :margin-top "32px"}})

(def nav-item-container {:style {:margin-left "auto"
                                 :height "48px"
                                 :display "flex"
                                 :align-items "center"}})

(def title {:font-size "32px"
            :font-weight "800"
            :display "inline-block"
            :position "relative"
            ::stylefy/mode [[:after {:position "absolute"
                                     :background-color "#EBEBEB"
                                     :width "100%"
                                     :bottom "20%"
                                     :left 0
                                     :height "12px"
                                     :z-index -1}]]})