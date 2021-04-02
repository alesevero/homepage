(ns app.views.navigation.header
  (:require [app.components.nav-item :refer [nav-item]]
            [re-frame.core :as rf]
            [app.views.navigation.styles :refer [link]]))


(defn header
  []
  (let [active-nav @(rf/subscribe [:active-nav])]
    [:div {:style {:width "100%"
                   :max-width "1120px"
                   :display "flex"
                   :align-items "center"
                   :padding-top "32px"}}
     [:h1 {:style {:font-size "32px"
                   :font-weight "800"
                   :padding "0px"}} "A|"]
     [:div {:style {:margin-left "auto"}}
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
                 :style link}]]]))
