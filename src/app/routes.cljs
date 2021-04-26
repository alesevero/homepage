(ns app.routes
  (:require [re-frame.core :as rf]
            [app.views.about.home :refer [home]]
            [app.views.findme.findme :refer [findme]]
            [app.views.work.work :refer [work]]))

(defn routes
  []
  (let [active-nav @(rf/subscribe [:active-nav])]
    (case active-nav
      :about [home]
      :work [work]
      :find-me [findme]
      [home])))