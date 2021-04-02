(ns app.core
  (:require [reagent.core :as r]
            [re-frame.core :as rf]
            [app.state.db]
            [app.state.effects.nav.subs]
            [app.state.effects.nav.events]
            [app.views.navigation.header :refer [header]]))

(defn app
  []
  [:div {:style {:width "100%"
                 :display "flex"
                 :justify-content "center"}}
   [header]])

(defn ^:dev/after-load render
  "Render the toplevel component for this app."
  []
  (r/render [app] (.getElementById js/document "app")))

(defn ^:export main
  "Run application startup logic."
  []
  (rf/dispatch-sync [:initialize-db])
  (render))
