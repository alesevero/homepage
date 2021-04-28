(ns app.views.about.styles
  (:require [stylefy.core :as stylefy :refer [use-style]]))

(def container (use-style {:width "100%"
                           :display "flex"
                           :flex-direction "column"
                           :justify-content "center"
                           :align-items "center"
                           :padding "32px"}))

(def hello-container (use-style {:width "100%"
                                 :max-width "1120px"
                                 :display "flex"
                                 :flex-direction "column"
                                 :align-items "flex-start"
                                 :justify-content "center"
                                 :height "100vh"}))

(def hello (use-style {:font-size "100px"
                       :font-weight "800"
                       :color "#FFD600"}))

(def subtitle (use-style {:font-size "28px"
                          :font-weight "400"
                          :font-family "Playfair Display"
                          :color "#EBEBEB"}))

(def about-container (use-style {:width "100%"
                                 :background "#191C24"
                                 :display "flex"
                                 :flex-direction "column"
                                 :align-items "center"
                                 :justify-content "center"}))

(def about-contents (use-style {:width "100%"
                                :max-width "1120px"
                                :display "flex"
                                :margin "164px 0"}))

(def about-left (use-style {:display "flex"
                            :flex-direction "column"}))

(def about-right (use-style {:margin-left "93px"}))

(def about-header (use-style {:color "#FFD600"
                              :font-size "48px"
                              :font-weight "700"
                              :margin-bottom "46px"}))

(def bold-container (use-style {:width "100%"
                                :display "flex"
                                :flex-direction "column"
                                :align-items "center"
                                :justify-content "center"}))

(def bold-contents (use-style {:width "100%"
                               :max-width "1120px"}))

(def bold-header-container (use-style {:display "flex"}))

(def bold-header-title (use-style {:font-size "54px"
                                   :font-weight "800"
                                   :padding "16px"
                                   :background "#FFD600"
                                   :margin-top "-32px"}))

(def header-description-div (use-style {:margin-bottom "24px"
                                        :margin-top "40px"
                                        :margin-left "32px"}))

(def groups-container (use-style {:display "flex"
                                  :flex-direction "column"
                                  :justify-content "center"
                                  :align-items "flex-start"
                                  :margin "64px 0 128px 0"
                                  :width "100%"
                                  :max-width "1120px"}))

(def craft-container {:display "flex"
                      :flex-direction "row"
                      :justify-content "space-between"
                      :margin "24px 0"})

(def craft-title-container (use-style {:min-width "400px"}))

(def craft-title (use-style {:font-size "40px"
                             :font-height "32px"
                             :font-weight "700"
                             :color "#FFD600"}))

(def community-container (use-style {:width "100%"
                                     :display "flex"
                                     :flex-direction "column"
                                     :align-items "center"
                                     :justify-content "center"
                                     :margin-bottom "64px"}))

(def community-contents (use-style {:width "100%"
                                    :max-width "1120px"
                                    :margin-bottom "128px"}))

(def community-title {:font-size "54px"
                      :font-weight "800"
                      :margin-bottom "20px"
                      :color "#FFD600"})

(def latest-articles-container (use-style {:display "flex"}))

(def latest-articles-title-container (use-style {:min-width "400px"}))

(def latest-articles-title (use-style {:font-size "40px"
                                       :font-weight "700"
                                       :color "#FFD600"}))

(def articles-container (use-style {:width "100%"}))

(def article-container (use-style {:margin-bottom "48px"}))

(def article-title (use-style {:font-size "28px"
                               :font-weight "500"
                               :color "#EBEBEB"}))

(def more-container (use-style {:width "100%"
                                :display "flex"
                                :flex-direction "column"
                                :align-items "center"
                                :justify-content "center"}))

(def more-contents (use-style {:width "100%"
                               :max-width "1120px"}))

(def more-header-container (use-style {:display "flex"
                                       :flex-direction "column"}))

(def more-title-container (use-style {:width "100%"
                                      :display "flex"
                                      :flex-direction "column"}))

(def more-header-description (use-style {:font-size "24px"
                                         :font-weight "700"
                                         :font-family "Playfair Display"
                                         :color "#EBEBEB"}))

(def more-detail-container {:style {:display "flex"
                                    :width "100%"
                                    :flex-direction "row"
                                    :justify-content "space-between"
                                    :margin "24px 0"}})

(def more-description-container (use-style {:width "100%"
                                            :display "flex"
                                            :flex-direction "column"
                                            :align-items "flex-start"}))

(def big-title {:style {:font-size "54px"
                        :font-weight "800"
                        :color "#FFD600"}})

(def small-title {:style {:font-size "40px"
                          :font-height "32px"
                          :font-weight "700"
                          :color "#FFD600"}})

(defn text
  [color]
  {:color color
   :font-size "20px"
   :line-height "32px"
   :margin-bottom "32px"
   :font-family "Playfair Display"})

(def text-gray
  (use-style (text "#EBEBEB")))

(def strong-yellow
  (use-style (merge (text "#FFD600")
                    {:font-weight "600"})))

(def link {:font-size "20px"
           :font-weight "700"
           :font-family "Playfair Display"
           :padding "16px 0"
           :margin-bottom "16px"
           :margin-left "auto"
           :color "#EBEBEB"
           :transition "opacity 0.6s"
           ::stylefy/mode [[:hover {:opacity "0.6"}]]})
