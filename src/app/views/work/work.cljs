(ns app.views.work.work)

(def divider
  [:hr {:style {:width "100%"
                :border "0.5px solid #EBEBEB"}}])

(defn work
  []
  [:main
   [:section.front-page-container
    [:h1.front-page-title "Software engineering"
     [:br]
     "taken to the next level."]
    [:p.subtitle "A brief collection of my experiences and side-projects
                  I have been working so far."]]
   [:section.work-container
    [:div.work-contents
     [:h2.title "Healthcare." [:br] "Simplified."]
     [:div.work-details
      [:img {:src "assets/ch.png"
             :alt "Collective Health's system screenshot"
             :width "579"
             :height "325"
             :style {:z-index 2}}]
      [:div.work-description
       [:p "Collective Health "
        [:strong "replaces"]
        " a disjointed experience with one
        connected system to drive more value from your total healthcare
        investment."]
       [:div.link-container
        [:a.yellow {:href "https://collectivehealth.com"}
         "Visit the website."]]]]]]
   divider
   [:section.work-container
    [:div.work-contents
     [:h2.title
      "Sicredi's Credit Cards."
      [:br]
      "To live unique experiences."]
     [:div.work-details
      [:img {:src "assets/sicredi.png"
             :alt "Sicredi's website screenshot"
             :width "579"
             :height "327"
             :style {:z-index 2}}]
      [:div.work-description
       [:p "Sicredi has the ideal credit card for you to make "
        [:strong "your dreams come true,"]
        " while bringing "
        [:strong "simplicity"]
        " and "
        [:strong "security"]
        " to your daily routines."]
       [:div.link-container
        [:a.yellow {:href "https://www.sicredi.com.br/site/cartoes"}
         "Visit the website (Portuguese)."]]]]]]
   divider
   [:section.work-container
    [:div.work-contents
     [:h2.title "The art of" [:br] "money management."]
     [:div.work-details
      [:img {:src "assets/gobudget.png"
             :alt "Collection of Gobudget's screenshots"
             :width "608"
             :height "388"
             :style {:z-index 2}}]
      [:div.work-description
       [:p "GoBudget "
        [:strong "redefines"]
        " money management giving you control over your finances."]
       [:div.link-container
        [:a.yellow {:href "https://upbeat-raman-af363b.netlify.app"}
         "Check out the demo."]]]]]]
   divider
   [:section.work-container
    [:div.work-contents
     [:h2.title "EasyHabit"]
     [:div.work-details
      [:img {:src "assets/easyhabit.svg"
             :alt "Screenshots of EasyHabits mobile app in dark and light themes"
             :width "608"
             :height "388"
             :style {:z-index 2}}]
      [:div.work-description
       [:p "This easy-peasy-lemon-squeeze habit tracking app let's you "
        [:strong "focus on what matters."]]
       [:div.link-container
        [:a.yellow {:href "https://avsware.github.io/easyhabitapp/"}
         "Discover more about it."]]]]]]])