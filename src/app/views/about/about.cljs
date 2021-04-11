(ns app.views.about.about
  (:require [stylefy.core :refer [use-style]]
            [app.views.about.styles :refer [about-container
                                            about-contents
                                            about-left
                                            about-header
                                            about-description
                                            about-right
                                            strong-yellow]]))

(defn about
  []
  [:div (use-style about-container)
   [:div (use-style about-contents)
    [:div (use-style about-left)
     [:p (use-style about-header)
      "\"Technology is about leveraging human beings' capabilities\""]
     [:p (use-style about-description)
      "I’m a 29 years old being that is passionated about our species.
          Music, photography, arts and tech define me as a person.
          I’m passionate for different cultures and the beauties they bring."]
     [:p (use-style about-description)
      "As a computer engineer, I strive to build tools that leverages what we
          have best as humans. My goal is to bring "
      [:strong (use-style strong-yellow) "innovative software development"]
      " and "
      [:strong (use-style strong-yellow) "human-centred design"]
      " together to give power to the
          people."]]
    [:div (use-style about-right)
     [:img {:src "assets/avatar.svg"
            :width "360px"
            :height "382px"}]]]])