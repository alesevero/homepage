(ns app.state.effects.nav.subs
  (:require [re-frame.core :as rf]))

(rf/reg-sub
 :active-nav
 (fn [db _]
   (:active-nav db)))
