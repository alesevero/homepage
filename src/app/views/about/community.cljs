(ns app.views.about.community
  (:require [stylefy.core :refer [use-style]]
            [app.views.about.styles :refer [community-container
                                            community-contents
                                            community-title
                                            community-description
                                            latest-articles-container
                                            latest-articles-title-container
                                            latest-articles-title
                                            articles-container
                                            article-title
                                            article-subtitle
                                            article-link
                                            article-container
                                            strong-black]]
            [re-frame.core :as rf]))

(defn community
  []
  [:div (use-style community-container)
   [:div (use-style community-contents)
    [:h2 (use-style community-title
                    {:class "highlight"})
     "Community"]
    [:p (use-style community-description)
     "As a human being, I’m always looking forward to build rich experiences
          for us as a community. "
     [:strong (use-style strong-black) "Sharing"]
     " and "
     [:strong (use-style strong-black) "collaborating"]
     " is an intrinsic part of me."]
    (let [latest-articles @(rf/subscribe [:latest-articles])]
      [:div (use-style latest-articles-container)
       [:div (use-style latest-articles-title-container)
        [:h3 (use-style latest-articles-title) "Latest Articles"]]
       [:div (use-style articles-container)
        (for [{:keys [id title subtitle href]} latest-articles]
          [:div (use-style article-container
                           {:key id})
           [:h4 (use-style article-title) title]
           [:p (use-style article-subtitle) subtitle]
           [:a {:href href}
            [:p (use-style article-link
                           {:class "highlight"})
             "Read it >"]]
           [:hr {:style {:border "1px solid #191C24"}}]])]])]])