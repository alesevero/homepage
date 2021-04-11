(ns app.views.about.bold
  (:require [stylefy.core :refer [use-style]]
            [re-frame.core :as rf]
            [app.views.about.styles :refer [groups-container
                                            craft-title-container
                                            craft-title
                                            craft-description
                                            bold-container
                                            bold-contents
                                            bold-header-container
                                            bold-header-title
                                            bold-header-description
                                            craft-container
                                            strong-black]]))

(defn bold
  []
  [:div (use-style bold-container)
   [:div (use-style bold-contents)
    [:div (use-style bold-header-container)
     [:h2 (use-style bold-header-title)
      "Bold. Creative. Strategic."]
     [:p (use-style bold-header-description)
      "My Bachelor's Degree in Computer Engineering and my two MBAs in User
          Experience and Startup Development give me an wide array of tools to
          transit between busines, design and engineering teams, "
      [:strong (use-style strong-black) "streamlining communication,"]
      " creating a "
      [:strong (use-style strong-black)
       "safe, noise-free collaboration environment,"]
      " in order to deliver high-quality software."]]]
   [:div (use-style groups-container)
    (let [crafts @(rf/subscribe [:crafts])]
      (for [{:keys [id title description]} crafts]
        [:div (use-style craft-container
                         {:key id})
         [:div (use-style craft-title-container)
          [:h3 (use-style craft-title) title]]
         [:p (use-style craft-description) description]]))]])