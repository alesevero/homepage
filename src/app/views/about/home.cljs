(ns app.views.about.home
  (:require [app.views.about.about :refer [about]]
            [app.views.about.bold :refer [bold]]
            [app.views.about.community :refer [community]]
            [app.views.about.more :refer [more]]))

(defn home
  []
  [:main
   [:div.front-page-container
    [:h1.home-title "Hello"]
    [:p.subtitle
     "I'm Alexandre, a Software Engineer and UX Designer based in Brazil."]]
   [about]
   [bold]
   [community]
   [more]])