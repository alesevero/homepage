(ns app.views.about.styles
  (:require [stylefy.core :as stylefy]))

(def container {:width "100%"
                :display "flex"
                :flex-direction "column"
                :justify-content "center"
                :align-items "center"})

(def hello-container {:width "100%"
                      :max-width "1120px"
                      :display "flex"
                      :flex-direction "column"
                      :align-items "flex-start"
                      :justify-content "center"
                      :height "100vh"})

(def hello {:font-size "100px"
            :font-weight "800"
            ::stylefy/mode [[:after {:position "absolute"
                                     :background-color "#EBEBEB"
                                     :width "100%"
                                     :bottom "20%"
                                     :left 0
                                     :height "40px"
                                     :z-index -1}]]})

(def subtitle {:font-size "28px"
               :font-weight "400"
               :font-family "Playfair Display"})

(def about-container {:width "100%"
                      :background "#191C24"
                      :display "flex"
                      :flex-direction "column"
                      :align-items "center"
                      :justify-content "center"})

(def about-contents {:width "100%"
                     :max-width "1120px"
                     :display "flex"
                     :margin "164px 0"})

(def about-left {:display "flex"
                 :flex-direction "column"})

(def about-right {:margin-left "93px"})

(def about-header {:color "#FFD600"
                   :font-size "48px"
                   :font-weight "700"
                   :margin-bottom "46px"})

(def about-description {:color "#EBEBEB"
                        :font-size "24px"
                        :line-height "32px"
                        :padding-bottom "32px"
                        :font-family "Playfair Display"})

(def bold-container {:background "#EBEBEB"
                     :width "100%"
                     :display "flex"
                     :flex-direction "column"
                     :align-items "center"
                     :justify-content "center"})

(def bold-contents {:width "100%"
                    :max-width "1120px"})

(def bold-header-container {:display "flex"})

(def bold-header-title {:font-size "68px"
                        :font-weight "800"
                        :padding "16px"
                        :background "#FFD600"
                        :margin-top "-68px"})

(def bold-header-description {:padding-bottom "24px"
                              :padding-top "40px"
                              :padding-left "32px"
                              :font-size "24px"
                              :font-weight "32px"
                              :font-family "Playfair Display"})

(def groups-container {:display "flex"
                       :flex-direction "column"
                       :justify-content "center"
                       :align-items "flex-start"
                       :margin "128px 0"
                       :width "100%"
                       :max-width "1120px"})

(def craft-container {:display "flex"
                      :flex-direction "row"
                      :justify-content "space-between"
                      :margin "24px 0"})

(def craft-title-container {:min-width "400px"})

(def craft-title {:font-size "40px"
                  :font-height "32px"
                  :font-weight "700"})

(def craft-description {:font-size "24px"
                        :font-height "32px"
                        :font-family "Playfair Display"})

(def community-container {:width "100%"
                          :display "flex"
                          :flex-direction "column"
                          :align-items "center"
                          :justify-content "center"})

(def community-contents {:width "100%"
                         :max-width "1120px"
                         :margin-top "64px"
                         :margin-bottom "128px"})

(def community-title {:font-size "64px"
                      :font-weight "800"
                      ::stylefy/mode [[:after {:position "absolute"
                                               :background-color "#EBEBEB"
                                               :width "100%"
                                               :bottom "12%"
                                               :left 0
                                               :height "32px"
                                               :z-index -1}]]})

(def community-description {:font-size "24px"
                            :font-family "Playfair Display"
                            :padding "32px 0"})

(def latest-articles-container {:display "flex"})

(def latest-articles-title-container {:min-width "400px"})

(def latest-articles-title {:font-size "40px"
                            :font-weight "700"})

(def articles-container {:width "100%"})

(def article-container {:margin-bottom "48px"})

(def article-title {:font-size "32px"
                    :font-weight "500"})

(def article-subtitle {:font-size "24px"
                       :font-family "Playfair Display"
                       :padding "8px 0"})

(def article-link {:font-size "24px"
                   :font-weight "700"
                   :font-family "Playfair Display"
                   :padding "16px 0"
                   :margin-bottom "8px"
                   :transition "opacity 0.6s"
                   ::stylefy/mode [[:after {:position "absolute"
                                            :background-color "#EBEBEB"
                                            :width "100%"
                                            :bottom "28%"
                                            :left 0
                                            :height "12px"
                                            :z-index -1}]
                                   [:hover {:opacity "0.6"}]]})

(def more-container {:background "#EBEBEB"
                     :width "100%"
                     :display "flex"
                     :flex-direction "column"
                     :align-items "center"
                     :justify-content "center"})

(def more-contents {:width "100%"
                    :max-width "1120px"})

(def more-header-container {:display "flex"})

(def more-header-title {:font-size "68px"
                        :font-weight "800"
                        :padding "16px 64px 16px 16px"
                        :color "#EBEBEB"
                        :background "#191C24"
                        :margin-top "-68px"})

(def more-header-description {:padding-left "32px"
                              :padding-top "120px"
                              :font-size "24px"
                              :font-weight "700"
                              :font-family "Playfair Display"})

(def more-detail-container {:display "flex"
                            :width "100%"
                            :flex-direction "row"
                            :justify-content "space-between"
                            :margin "48px 0"})

(def more-title {:font-size "40px"
                 :font-height "32px"
                 :font-weight "700"})

(def more-description-container {:width "100%"
                                 :display "flex"
                                 :flex-direction "column"
                                 :align-items "flex-start"})

(def more-description {:font-size "24px"
                       :font-height "32px"
                       :margin-bottom "32px"
                       :font-family "Playfair Display"})

(def more-link {:font-size "24px"
                :font-weight "700"
                :font-family "Playfair Display"
                :padding "16px 0"
                :margin-bottom "8px"
                :transition "opacity 0.6s"
                :z-index 12031023
                ::stylefy/mode [[:hover {:opacity "0.6"}]
                                [:after {:position "absolute"
                                         :background-color "#FFD600"
                                         :width "100%"
                                         :bottom "28%"
                                         :left 0
                                         :height "12px"
                                         :z-index -1}]]})

(def footer {:width "100%"
             :max-width "1120px"
             :height "40px"
             :display "flex"
             :justify-content "space-between"
             ::stylefy/sub-styles {:text {:font-size "16px"
                                          :font-family "Playfair Display"}
                                   :strong {:font-size "16px"
                                            :font-family "Playfair Display"
                                            :font-weight "700"}}})