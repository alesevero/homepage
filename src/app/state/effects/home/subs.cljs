(ns app.state.effects.home.subs
  (:require [re-frame.core :as rf]))

(rf/reg-sub
 :latest-articles
 (fn [db _]
   (get-in db [:articles])))

(rf/reg-sub
 :more
 (fn [db _]
   (get-in db [:more])))