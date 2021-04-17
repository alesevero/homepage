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
                                            article-link
                                            article-container
                                            strong-black
                                            text-black]]
            [re-frame.core :as rf]))

(defn community
  []
  [:div community-container
   [:div community-contents
    [:h2 (use-style community-title
                    {:class "highlight"})
     "Community"]
    [:p text-black
     "As a human being, I’m always looking forward to build rich experiences
          for us as a community. "
     [:strong strong-black "Sharing"]
     " and "
     [:strong strong-black "collaborating"]
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
           [:p text-black subtitle]
           [:a {:href href}
            [:p (use-style article-link
                           {:class "highlight"})
             "Read it >"]]
           [:hr {:style {:border "1px solid #191C24"
                         :margin-bottom "16px"}}]])]])]])
