(ns app.views.about.more
  (:require [re-frame.core :as rf]))

(defn more
  []
  [:section.more-contents
   [:div.more-header
    [:h2.title "Human. Learner. Thinker."]
    [:p "There's more than that, though."]]
   [:div.group
    (let [more-list @(rf/subscribe [:more])]
      (for [{:keys [id title description link-text href]} more-list]
        [:div.more-item {:key id}
         [:h3.small-title title]
         [:p description]
         [:a.white {:href href} link-text]
         [:hr {:style {:border "1px solid #EBEBEB"
                       :width "100%"}}]]))]])