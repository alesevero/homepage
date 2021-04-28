(ns app.views.about.bold
  (:require [re-frame.core :as rf]))

(defn bold
  []
  [:section
   [:div.crafts-contents
    [:div.crafts-header
     [:div.crafts-header-title
      [:h2.crafts-title "Bold."]
      [:h2.crafts-title "Creative."]
      [:h2.crafts-title "Strategic."]]
     [:div.crafts-description
      [:p
       "My Bachelor's Degree in Computer Engineering and my two MBAs in User
          Experience and Startup Development give me an wide array of tools to
          transit between business, design and engineering teams, "
       [:strong "streamlining communication,"]
       " creating a "
       [:strong
        "safe, noise-free collaboration environment,"]
       " in order to deliver high-quality software."]]]]
   [:div.group
    (let [crafts @(rf/subscribe [:crafts])]
      (for [{:keys [id title description]} crafts]
        [:div.group-item {:key id}
         [:div.small-title-div
          [:h3.small-title title]]
         [:p description]]))]])