(ns app.components.nav-item
  (:require [stylefy.core :as stylefy :refer [use-style]]))

(defn nav-item
  [{:keys [id  href name dispatch active-nav style]}]
  [:a (use-style (style id active-nav)
                 {:href href
                  :on-click dispatch
                  :class (when (= active-nav id) "highlight")})
   name])