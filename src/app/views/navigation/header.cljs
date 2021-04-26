(ns app.views.navigation.header
  (:require [app.components.nav-item :refer [nav-item]]
            [re-frame.core :as rf]
            [app.views.navigation.styles :refer [link
                                                 container
                                                 header-container
                                                 nav-item-container]]))


(defn header
  []
  (let [active-nav @(rf/subscribe [:active-nav])]
    [:div container
     [:div header-container
      [:div nav-item-container
       [nav-item {:id :about
                  :name "About"
                  :dispatch #(rf/dispatch [:set-active-nav :about])
                  :href "#about"
                  :active-nav active-nav
                  :style link}]
       [nav-item {:id :work
                  :name "Work"
                  :dispatch #(rf/dispatch [:set-active-nav :work])
                  :href "#work"
                  :active-nav active-nav
                  :style link}]
       [nav-item {:id :find-me
                  :name "Find Me"
                  :dispatch #(rf/dispatch [:set-active-nav :find-me])
                  :href "#find-me"
                  :active-nav active-nav
                  :style link}]]]]))
