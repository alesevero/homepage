(ns app.views.findme.styles
  (:require [stylefy.core :as stylefy :refer [use-style]]))

(def container (use-style {:width "100%"
                           :display "flex"
                           :flex-direction "column"
                           :justify-content "center"
                           :align-items "center"}))

(def contents (use-style {:width "100%"
                          :max-width "1120px"
                          :display "flex"
                          :flex-direction "column"
                          :align-items "flex-start"
                          :justify-content "center"
                          :height "100vh"}))

(def title {:font-size "54px"
            :font-weight "800"
            :margin-bottom "32px"
            ::stylefy/mode [[:after {:position "absolute"
                                     :background-color "#EBEBEB"
                                     :width "100%"
                                     :bottom "20%"
                                     :left 0
                                     :height "20px"
                                     :z-index -1}]]})

(def text (use-style {:color "#191C24"
                      :font-size "20px"
                      :line-height "32px"
                      :margin-bottom "32px"
                      :font-family "Playfair Display"}))

(def links {:display "flex"
            :flex-direction "row"
            :align-items "center"})

(def link {:font-size "28px"
           :font-weight "700"
           :padding "16px 0"
           :margin-bottom "8px"
           :transition "opacity 0.6s"
           ::stylefy/mode [[:after {:position "absolute"
                                    :background-color "#EBEBEB"
                                    :width "100%"
                                    :bottom "28%"
                                    :left 0
                                    :height "16px"
                                    :z-index -1}]
                           [:hover {:opacity "0.6"}]]})