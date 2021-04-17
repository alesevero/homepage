(ns app.views.about.about
  (:require [app.views.about.styles :refer [about-container
                                            about-contents
                                            about-left
                                            about-header
                                            about-right
                                            text-gray
                                            strong-yellow]]))

(defn about
  []
  [:div about-container
   [:div about-contents
    [:div about-left
     [:h5 about-header
      "\"Technology is about leveraging human beings' capabilities\""]
     [:p text-gray
      "I’m a 29 years old being that is passionated about our species.
          Music, photography, arts and tech define me as a person.
          I’m passionate for different cultures and the beauties they bring."]
     [:p text-gray
      "As a computer engineer, I strive to build tools that leverages what we
          have best as humans. My goal is to bring "
      [:strong strong-yellow "innovative software development"]
      " and "
      [:strong strong-yellow "human-centred design"]
      " together to give power to the
          people."]]
    [:div about-right
     [:img {:src "assets/avatar.svg"
            :width "360px"
            :height "382px"}]]]])