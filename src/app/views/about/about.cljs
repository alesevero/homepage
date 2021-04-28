(ns app.views.about.about)

(defn about
  []
  [:section.about-contents
   [:div.about-left
    [:h5.about-header
     "\"Technology is about leveraging human beings' capabilities\""]
    [:p
     "I’m a 29 years old being that is passionated about our species.
          Music, photography, arts and tech define me as a person.
          I’m passionate for different cultures and the beauties they bring."]
    [:p
     "As a computer engineer, I strive to build tools that leverages what we
          have best as humans. My goal is to bring "
     [:strong "innovative software development"]
     " and "
     [:strong "human-centred design"]
     " together to give power to the
          people."]]
   [:div.about-right
    [:img {:src "assets/avatar.svg"
           :alt "Black and white photo of me smiling"}]]])