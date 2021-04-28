(ns app.views.work.styles
  (:require [stylefy.core :as stylefy :refer [use-style]]))

(def main-container (use-style {:width "100%"
                                :display "flex"
                                :flex-direction "column"
                                :justify-content "center"
                                :align-items "center"}))

(def title-container (use-style {:width "100%"
                                 :max-width "1120px"
                                 :display "flex"
                                 :flex-direction "column"
                                 :align-items "flex-start"
                                 :justify-content "center"
                                 :height "100vh"}))

(def title {:font-size "64px"
            :font-weight "800"
            :display "inline"
            :color "#FFD600"})

(def subtitle (use-style {:font-size "28px"
                          :font-weight "400"
                          :font-family "Playfair Display"
                          :color "#EBEBEB"
                          :margin-top "16px"}))

(def container (use-style {:width "100%"
                           :background "#191C24"
                           :display "flex"
                           :flex-direction "column"
                           :align-items "center"
                           :justify-content "center"}))

(def contents (use-style {:width "100%"
                          :max-width "1120px"
                          :display "flex"
                          :flex-direction "column"
                          :margin "128px 0"}))

(def section-title {:font-size "48px"
                    :font-weight "700"
                    :margin-bottom "46px"})

(def yellow-title (use-style (merge section-title
                                    {:color "#FFD600"})))

(def details (use-style {:display "flex"
                         :align-items "center"
                         :height "380px"}))

(def text-container (use-style {:width "100%"
                                :height "380px"
                                :margin-left "-128px"
                                :padding "64px 16px 64px 164px"
                                :display "flex"
                                :flex-direction "column"
                                :justify-content "space-around"}))

(def link (use-style {:width "100%"
                      :display "flex"
                      :justify-content "flex-end"}))


(defn text
  [color]
  (use-style {:font-family "Playfair Display"
              :color color
              :font-size "20px"}))

(def gray-text (text "#EBEBEB"))

(defn text-bold
  [color]
  {:style {:font-family "Playfair Display"
           :color color
           :font-size "20px"
           :font-weight "700"}})

(def yellow-bold (text-bold "#FFD600"))
