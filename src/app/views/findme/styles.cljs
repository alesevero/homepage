(ns app.views.findme.styles
  (:require [stylefy.core :as stylefy :refer [use-style]]))

(def container (use-style {:width "100%"
                           :display "flex"
                           :flex-direction "column"
                           :justify-content "center"
                           :align-items "center"
                           :background "#191C24"}))

(def contents (use-style {:width "100%"
                          :max-width "1120px"
                          :display "flex"
                          :flex-direction "column"
                          :align-items "flex-start"
                          :justify-content "center"
                          :height "calc(100vh - 40px)"}))

(def title {:font-size "64px"
            :font-weight "800"
            :margin-bottom "32px"
            :color "#FFD600"})

(def text (use-style {:color "#EBEBEB"
                      :font-size "20px"
                      :line-height "32px"
                      :margin-bottom "32px"
                      :font-family "Playfair Display"}))

(def links {:display "flex"
            :flex-direction "row"
            :align-items "center"})

(def link {:font-size "28px"
           :font-weight "700"
           :color "#FFD600"
           :margin-right "48px"
           :padding "16px 0"
           :margin-bottom "8px"
           :transition "opacity 0.6s"})