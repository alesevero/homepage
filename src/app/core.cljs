(ns app.core
  (:require [reagent.core :as r]
            [re-frame.core :as rf]
            [stylefy.core :as stylefy]
            [app.state.db]
            [app.state.effects.nav.subs]
            [app.state.effects.nav.events]
            [app.state.effects.home.subs]
            [app.state.effects.findme.subs]
            [app.routes :refer [routes]]
            [app.views.navigation.header :refer [header]]))

(defn app
  []
  [:<>
   [header]
   [routes]])

(defn ^:dev/after-load render
  "Render the toplevel component for this app."
  []
  (r/render [app] (.getElementById js/document "app")))

(defn ^:export main
  "Run application startup logic."
  []
  (rf/dispatch-sync [:initialize-db])
  (stylefy/init)
  (render))
