(ns app.routes
  (:require [re-frame.core :as rf]
            [app.views.about.home :refer [home]]))

(defn routes
  []
  (let [active-nav @(rf/subscribe [:active-nav])]
    (case active-nav
      :about [home]
      :work [:<>]
      :find-me [:<>]
      [home])))