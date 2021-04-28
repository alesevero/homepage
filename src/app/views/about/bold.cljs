(ns app.views.about.bold
  (:require [stylefy.core :refer [use-style]]
            [re-frame.core :as rf]
            [app.views.about.styles :refer [groups-container
                                            craft-title-container
                                            craft-title
                                            bold-container
                                            bold-contents
                                            bold-header-container
                                            bold-header-title
                                            craft-container
                                            header-description-div
                                            strong-yellow
                                            text-gray]]))

(defn bold
  []
  [:div bold-container
   [:div bold-contents
    [:div bold-header-container
     [:h2 bold-header-title
      "Bold. Creative. Strategic."]
     [:div header-description-div
      [:p text-gray
       "My Bachelor's Degree in Computer Engineering and my two MBAs in User
          Experience and Startup Development give me an wide array of tools to
          transit between business, design and engineering teams, "
       [:strong strong-yellow "streamlining communication,"]
       " creating a "
       [:strong strong-yellow
        "safe, noise-free collaboration environment,"]
       " in order to deliver high-quality software."]]]]
   [:div groups-container
    (let [crafts @(rf/subscribe [:crafts])]
      (for [{:keys [id title description]} crafts]
        [:div (use-style craft-container
                         {:key id})
         [:div craft-title-container
          [:h3 craft-title title]]
         [:p text-gray description]]))]])