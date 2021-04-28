(ns app.views.work.work
  (:require [stylefy.core :refer [use-style]]
            [app.components.footer :refer [footer]]
            [app.views.work.styles :refer [main-container
                                           title-container
                                           title
                                           subtitle
                                           container
                                           contents
                                           yellow-title
                                           details
                                           text-container
                                           link
                                           yellow-bold
                                           gray-text]]))

(def divider
  [:hr {:style {:width "1120px"
                :border "0.5px solid #EBEBEB"}}])

(defn work
  []
  [:div main-container
   [:div title-container
    [:h1 (use-style title) "Software engineering"
     [:br]
     "taken to the next level."]
    [:p subtitle "A brief collection of my experiences and side-projects
         I have been working so far."]]
   [:div container
    [:div contents
     [:h1 yellow-title "Healthcare." [:br] "Simplified."]
     [:div details
      [:img {:src "assets/ch.png"
             :alt "Collective Health's system screenshot"
             :width "579"
             :height "325"
             :style {:z-index 2}}]
      [:div text-container
       [:p gray-text "Collective Health "
        [:strong yellow-bold "replaces"]
        " a disjointed experience with one
        connected system to drive more value from your total healthcare
        investment."]
       [:div link
        [:a (merge {:href "https://collectivehealth.com"}
                   yellow-bold) "Visit the website."]]]]]]
   divider
   [:div container
    [:div contents
     [:h1 yellow-title
      "Sicredi's Credit Cards."
      [:br]
      "To live unique experiences."]
     [:div details
      [:img {:src "assets/sicredi.png"
             :alt "Sicredi's website screenshot"
             :width "579"
             :height "327"
             :style {:z-index 2}}]
      [:div text-container
       [:p gray-text "Sicredi has the ideal credit card for you to make "
        [:strong yellow-bold "your dreams come true,"]
        " while bringing "
        [:strong yellow-bold "simplicity"]
        " and "
        [:strong yellow-bold "security"]
        " to your daily routines."]
       [:div link
        [:a (merge {:href "https://www.sicredi.com.br/site/cartoes"}
                   yellow-bold) "Visit the website (Portuguese)."]]]]]]
   divider
   [:div container
    [:div contents
     [:h1 yellow-title "The art of" [:br] "money management."]
     [:div details
      [:img {:src "assets/gobudget.png"
             :alt "Collection of Gobudget's screenshots"
             :width "608"
             :height "388"
             :style {:z-index 2}}]
      [:div text-container
       [:p gray-text "GoBudget "
        [:strong.highlight yellow-bold "redefines"]
        " money management giving you control over your finances."]
       [:div link
        [:a (merge {:href "https://upbeat-raman-af363b.netlify.app"}
                   yellow-bold) "Check out the demo."]]]]]]
   divider
   [:div container
    [:div contents
     [:h1 yellow-title "EasyHabit"]
     [:div details
      [:img {:src "assets/easyhabit.svg"
             :alt "Screenshots of EasyHabits mobile app in dark and light themes"
             :width "608"
             :height "388"
             :style {:z-index 2}}]
      [:div text-container
       [:p gray-text "This easy-peasy-lemon-squeeze habit tracking app let's you "
        [:strong.highlight yellow-bold "focus on what matters."]]
       [:div link
        [:a (merge {:href "https://avsware.github.io/easyhabitapp/"}
                   yellow-bold) "Discover more about it."]]]]]]
   [:div {:style {:height "64px"}}]
   [footer]])