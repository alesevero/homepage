(ns app.components.footer)

(defn footer
  []
  [:footer
   [:p "Crafted with love by "
    [:strong "Alexandre Severo."]]
   [:p "Built with "
    [:strong "ClojureScript"]
    " and "
    [:strong "Reagent."]]])