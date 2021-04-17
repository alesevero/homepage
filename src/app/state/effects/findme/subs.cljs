(ns app.state.effects.findme.subs
  (:require [re-frame.core :as rf]))

(rf/reg-sub
 :social-links
 (fn [db _]
   (get-in db [:social-links])))