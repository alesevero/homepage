(ns app.views.about.more
  (:require [stylefy.core :refer [use-style]]
            [app.views.about.styles :refer [craft-title-container
                                            more-container
                                            more-contents
                                            more-header-container
                                            more-header-title
                                            more-header-description
                                            more-detail-container
                                            groups-container
                                            more-title
                                            text-black
                                            link
                                            more-description-container]]
            [app.components.footer :refer [footer]]
            [re-frame.core :as rf]))

(defn more
  []
  [:div more-container
   [:div more-contents
    [:div more-header-container
     [:h2 more-header-title
      "Human." [:br] "Learner." [:br] "Thinker."]
     [:p more-header-description
      "There's more than that, though."]]
    [:div groups-container
     (let [more-list @(rf/subscribe [:more])]
       (for [{:keys [id title description link-text href]} more-list]
         [:div (use-style more-detail-container
                          {:key id})
          [:div craft-title-container
           [:h3 more-title title]]
          [:div more-description-container
           [:p text-black description]
           [:a (use-style link {:href href})
            link-text]
           [:hr {:style {:border "1px solid #191C24"
                         :width "100%"}}]]]))]]
   [footer "#EBEBEB"]])