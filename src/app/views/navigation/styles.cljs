(ns app.views.navigation.styles)

(defn link
  [id active-nav]
  {:color (if (= active-nav id) "#FFD600" "#EBEBEB")
   :font-size "16px"
   :font-weight (when (= active-nav id) "700")
   :margin "8px"
   :padding "0px"
   :transition "opacity 0.6s"})

(def container {:style {:width "100%"
                        :display "flex"
                        :justify-content "center"
                        :align-items "center"
                        :position "absolute"
                        :top 0
                        :padding "0 32px"}})

(def header-container {:style {:width "100%"
                               :max-width "1120px"
                               :display "flex"
                               :align-items "center"
                               :margin-top "32px"}})

(def nav-item-container {:style {:margin-left "auto"
                                 :height "48px"
                                 :display "flex"
                                 :align-items "center"}})

(def title {:font-size "32px"
            :font-weight "800"
            :display "inline-block"
            :position "relative"
            :color "#FFD600"})