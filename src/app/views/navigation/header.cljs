(ns app.views.navigation.header
  (:require [app.components.nav-item :refer [nav-item]]
            [stylefy.core :refer [use-style]]
            [re-frame.core :as rf]
            [app.views.navigation.styles :refer [link
                                                 container
                                                 header-container
                                                 nav-item-container
                                                 title]]))


(defn header
  []
  (let [active-nav @(rf/subscribe [:active-nav])]
    [:div container
     [:div header-container
      (when (not (= active-nav :about))
        [:h1 (use-style title {:class "highlight"}) "A|"])
      [:div nav-item-container
       [nav-item {:id :about
                  :name "ABOUT"
                  :dispatch #(rf/dispatch [:set-active-nav :about])
                  :href "#about"
                  :active-nav active-nav
                  :style link}]
       [nav-item {:id :work
                  :name "WORK"
                  :dispatch #(rf/dispatch [:set-active-nav :work])
                  :href "#work"
                  :active-nav active-nav
                  :style link}]
       [nav-item {:id :find-me
                  :name "FIND ME"
                  :dispatch #(rf/dispatch [:set-active-nav :find-me])
                  :href "#find-me"
                  :active-nav active-nav
                  :style link}]]]]))
