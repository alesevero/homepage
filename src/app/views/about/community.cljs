(ns app.views.about.community
  (:require [re-frame.core :as rf]))

(defn community
  []
  [:section.community-contents
   [:h2.title "Community"]
   [:p
    "As a human being, I’m always looking forward to build rich experiences
          for us as a community. "
    [:strong "Sharing"]
    " and "
    [:strong "collaborating"]
    " is an intrinsic part of me."]
   (let [latest-articles @(rf/subscribe [:latest-articles])]
     [:div.latest-articles-container
      [:div.latest-articles-title
       [:h3.latest-articles-title "Latest Articles"]]
      [:div.articles
       (for [{:keys [id title subtitle href]} latest-articles]
         [:div.article {:key id}
          [:h4.article-title title]
          [:p subtitle]
          [:div {:style {:display "flex"
                         :width "100%"}}
           [:a.white {:href href} "Read it"]]
          [:hr {:style {:border "1px solid #EBEBEB"
                        :margin-bottom "16px"}}]])]])])
