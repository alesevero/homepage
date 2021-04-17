(ns app.views.findme.findme
  (:require [stylefy.core :refer [use-style]]
            [re-frame.core :as rf]
            [app.components.footer :refer [footer]]
            [app.views.findme.styles :refer [container
                                             contents
                                             title
                                             text
                                             links
                                             link]]))

(defn findme
  []
  [:div container
   [:div contents
    [:h1.highlight (use-style title) "Glad to see you here."]
    [:p text
     "In times like these of COVID-19, we must keep ourselves safe at home."
     [:br]
     "However, that doesn't mean we can't chat."]
    [:p text "You can quickly reach me out through the channels bellow."]
    [:div links
     (let [social-links @(rf/subscribe [:social-links])]
       (for [{:keys [id title href]} social-links]
         [:a {:href href
              :style {:margin-right "48px"}
              :key id}
          [:p (use-style link
                         {:class "highlight"})
           title]]))]
    [footer]]])