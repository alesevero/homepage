(ns app.views.about.more
  (:require [stylefy.core :refer [use-style]]
            [app.views.about.styles :refer [craft-title-container
                                            more-container
                                            more-contents
                                            more-header-container
                                            more-header-description
                                            more-detail-container
                                            groups-container
                                            small-title
                                            big-title
                                            text-gray
                                            link
                                            more-title-container]]
            [app.components.footer :refer [footer]]
            [re-frame.core :as rf]))

(defn more
  []
  [:div more-container
   [:div more-contents
    [:div more-header-container
     [:h2 big-title "Human. Learner. Thinker."]
     [:p more-header-description
      "There's more than that, though."]]
    [:div groups-container
     (let [more-list @(rf/subscribe [:more])]
       (for [{:keys [id title description link-text href]} more-list]
         [:div (merge more-detail-container
                      {:key id})
          [:div more-title-container
           [:h3 small-title title]
           [:p text-gray description]
           [:a (use-style link {:href href})
            link-text]
           [:hr {:style {:border "1px solid #EBEBEB"
                         :width "100%"}}]]]))]]
   [footer "#EBEBEB"]])