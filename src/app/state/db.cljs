(ns app.state.db
  (:require [re-frame.core :as rf]))

(def db {:active-nav :about})

(rf/reg-event-db
 :initialize-db
 (fn [_ _]
   db))
