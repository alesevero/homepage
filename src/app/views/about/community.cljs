(ns app.views.about.community
  (:require [stylefy.core :refer [use-style]]
            [app.views.about.styles :refer [community-container
                                            community-contents
                                            community-title
                                            latest-articles-container
                                            latest-articles-title-container
                                            latest-articles-title
                                            articles-container
                                            article-title
                                            link
                                            article-container
                                            strong-yellow
                                            text-gray]]
            [re-frame.core :as rf]))

(defn community
  []
  [:div community-container
   [:div community-contents
    [:h2 (use-style community-title
                    {:class "highlight"})
     "Community"]
    [:p text-gray
     "As a human being, I’m always looking forward to build rich experiences
          for us as a community. "
     [:strong strong-yellow "Sharing"]
     " and "
     [:strong strong-yellow "collaborating"]
     " is an intrinsic part of me."]
    (let [latest-articles @(rf/subscribe [:latest-articles])]
      [:div latest-articles-container
       [:div latest-articles-title-container
        [:h3 latest-articles-title "Latest Articles"]]
       [:div articles-container
        (for [{:keys [id title subtitle href]} latest-articles]
          [:div (use-style article-container
                           {:key id})
           [:h4 article-title title]
           [:p text-gray subtitle]
           [:div {:style {:display "flex"
                          :width "100%"}}
            [:a (use-style link
                           {:href href})
             "Read it"]]
           [:hr {:style {:border "1px solid #EBEBEB"
                         :margin-bottom "16px"}}]])]])]])
