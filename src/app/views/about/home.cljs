(ns app.views.about.home
  (:require [app.views.about.styles :refer [hello
                                            container
                                            hello-container
                                            subtitle]]
            [app.views.about.about :refer [about]]
            [app.views.about.bold :refer [bold]]
            [app.views.about.community :refer [community]]
            [app.views.about.more :refer [more]]
            [stylefy.core :refer [use-style]]))

(defn home
  []
  [:div container
   [:div hello-container
    [:h1.highlight (use-style hello) "Hello"]
    [:p subtitle
     "I'm Alexandre, a Software Engineer and UX Designer based in Brazil."]]
   [about]
   [bold]
   [community]
   [more]])