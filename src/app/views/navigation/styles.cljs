(ns app.views.navigation.styles)

(defn link
  [id active-nav]
  {:style {:color "#191C24"
           :text-decoration "none"
           :font-size "16px"
           :font-weight (when (= active-nav id) "700")
           :transition "opacity 0.2s"
           :margin "8px"
           :padding "0px"
           :border-bottom (when (= active-nav id) "8px solid #EBEBEB")
           :hover {:opacity "0.6"}}})
