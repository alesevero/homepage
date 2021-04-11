(ns app.views.about.home
  (:require [stylefy.core :refer [use-style]]
            [app.views.about.styles :refer [hello
                                            container
                                            hello-container
                                            subtitle]]
            [app.views.about.about :refer [about]]
            [app.views.about.bold :refer [bold]]
            [app.views.about.community :refer [community]]
            [app.views.about.more :refer [more]]))

(defn home
  []
  [:div (use-style container)
   [:div (use-style hello-container)
    [:h1.highlight (use-style hello) "Hello"]
    [:p (use-style subtitle)
     "I'm Alexandre, a Software Engineer and UX Designer based in Brazil."]]
   [about]
   [bold]
   [community]
   [more]])