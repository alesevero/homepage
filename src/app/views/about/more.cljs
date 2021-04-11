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
                                            more-description
                                            more-link
                                            more-description-container]]
            [app.components.footer :refer [footer]]
            [re-frame.core :as rf]))

(defn more
  []
  [:div (use-style more-container)
   [:div (use-style more-contents)
    [:div (use-style more-header-container)
     [:h2 (use-style more-header-title)
      "Human." [:br] "Learner." [:br] "Thinker."]
     [:p (use-style more-header-description)
      "There's more than that, though."]]]
   [:div (use-style groups-container)
    (let [more-list @(rf/subscribe [:more])]
      (for [{:keys [id title description link-text href]} more-list]
        [:div (use-style more-detail-container
                         {:key id})
         [:div (use-style craft-title-container)
          [:h3 (use-style more-title) title]]
         [:div (use-style more-description-container)
          [:p (use-style more-description) description]
          [:a {:href href}
           [:p (use-style more-link
                          {:class "highlight"})
            link-text]]
          [:hr {:style {:border "1px solid #191C24"
                        :width "100%"}}]]]))]
   [footer "#EBEBEB"]])