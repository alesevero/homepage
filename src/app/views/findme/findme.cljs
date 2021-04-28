(ns app.views.findme.findme
  (:require [re-frame.core :as rf]))

(defn findme
  []
  [:main.find-me-contents
   [:h1.front-page-title "Glad to see you here."]
   [:p
    "In times like these of COVID-19, we must keep ourselves safe at home."
    [:br]
    "However, that doesn't mean we can't chat."]
   [:br]
   [:p "You can quickly reach me out through the channels bellow."]
   [:div.find-me-links
    (let [social-links @(rf/subscribe [:social-links])]
      (for [{:keys [id title href]} social-links]
        [:a.find-me-link {:href href
                          :key id}
         title]))]])