(ns app.views.about.home
  (:require [stylefy.core :refer [use-style use-sub-style]]
            [app.views.about.styles :refer [hello
                                            container
                                            hello-container
                                            subtitle
                                            about-container
                                            about-contents
                                            about-left
                                            about-header
                                            about-description
                                            about-right
                                            bold-container
                                            bold-contents
                                            bold-header-container
                                            bold-header-title
                                            bold-header-description
                                            craft-container
                                            craft-title-container
                                            craft-title
                                            craft-description
                                            community-container
                                            community-contents
                                            community-title
                                            community-description
                                            latest-articles-container
                                            latest-articles-title-container
                                            latest-articles-title
                                            articles-container
                                            article-title
                                            article-subtitle
                                            article-link
                                            article-container
                                            more-container
                                            more-contents
                                            more-header-container
                                            more-header-title
                                            more-header-description
                                            more-detail-container
                                            groups-container
                                            more-title
                                            more-description
                                            more-link
                                            more-description-container
                                            footer]]
            [re-frame.core :as rf]))

(defn home
  []
  [:div (use-style container)
   [:div (use-style hello-container)
    [:h1.highlight (use-style hello) "Hello"]
    [:p (use-style subtitle)
     "I'm Alexandre, a Software Engineer and UX Designer based in Brazil."]]
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
       [:strong {:style {:font-weight "600"
                         :font-family "Playfair Display"
                         :font-size "24px"
                         :color "#FFD600"}} "innovative software development"]
       " and "
       [:strong {:style {:font-weight "600"
                         :font-family "Playfair Display"
                         :font-size "24px"
                         :color "#FFD600"}} "human-centred design"]
       " together to give power to the
          people."]]
     [:div (use-style about-right)
      [:img {:src "assets/avatar.svg"
             :width "360px"
             :height "382px"}]]]]
   [:div (use-style bold-container)
    [:div (use-style bold-contents)
     [:div (use-style bold-header-container)
      [:h2 (use-style bold-header-title)
       "Bold. Creative. Strategic."]
      [:p (use-style bold-header-description)
       "My Bachelor's Degree in Computer Engineering and my two MBAs in User
          Experience and Startup Development give me an wide array of tools to
          transit between busines, design and engineering teams, "
       [:strong {:style {:font-weight "600"
                         :font-family "Playfair Display"
                         :font-size "24px"
                         :color "#191C24"}} "streamlining communication,"]
       " creating a "
       [:strong {:style {:font-weight "600"
                         :font-family "Playfair Display"
                         :font-size "24px"
                         :color "#191C24"}}
        "safe, noise-free collaboration environment,"]
       " in order to deliver high-quality software."]]]
    [:div (use-style groups-container)
     [:div (use-style craft-container)
      [:div (use-style craft-title-container)
       [:h3 (use-style craft-title) "Business"]]
      [:p (use-style craft-description)
       "There is no such thing as engineering without business. Having worked
           in large and small companies, I am able to learn and understand
           business in a fast-paced rhythm, being able to deliver high-grade
           software that fullfils the business domain's requirements."]]
     [:div (use-style craft-container)
      [:div (use-style craft-title-container)
       [:h3 (use-style craft-title) "Engineering"]]
      [:p (use-style craft-description)
       "From back-end, to front-end and finally full-stack development, I
           have the knowledge needed build scalable, robust, reliable software.
           Design Patterns, micro services, Object-Oriented and Functional
           Programming; Java, Javascript and Clojure(Script); Spring, Node and
           React (Native). The list is endless."]]
     [:div (use-style craft-container)
      [:div (use-style craft-title-container)
       [:h3 (use-style craft-title) "Desgin"]]
      [:p (use-style craft-description)
       "Each product is unique, and so are its user needs. I can easily build
           methods and run design thinking sessions, researches, build high and
           low-fidelity prototypes, as well do testing and validation of a
           product. All of that making rational decisions that impact the end
           user experience."]]]]
   [:div (use-style community-container)
    [:div (use-style community-contents)
     [:h2 (use-style community-title
                     {:class "highlight"})
      "Community"]
     [:p (use-style community-description)
      "As a human being, I’m always looking forward to build rich experiences
          for us as a community. "
      [:strong {:style {:font-weight "600"
                        :font-family "Playfair Display"
                        :font-size "24px"
                        :color "#191C24"}} "Sharing"]
      " and "
      [:strong {:style {:font-weight "600"
                        :font-family "Playfair Display"
                        :font-size "24px"
                        :color "#191C24"}} "collaborating"]
      " is an intrinsic part of me."]
     (let [latest-articles @(rf/subscribe [:latest-articles])]
       [:div (use-style latest-articles-container)
        [:div (use-style latest-articles-title-container)
         [:h3 (use-style latest-articles-title) "Latest Articles"]]
        [:div (use-style articles-container)
         (for [{:keys [id title subtitle href]} latest-articles]
           [:div (use-style article-container
                            {:key id})
            [:h4 (use-style article-title) title]
            [:p (use-style article-subtitle) subtitle]
            [:a {:href href}
             [:p (use-style article-link
                            {:class "highlight"})
              "Read it >"]]
            [:hr {:style {:border "1px solid #191C24"}}]])]])]]
   [:div (use-style more-container)
    [:div (use-style more-contents)
     [:div (use-style more-header-container)
      [:h2 (use-style more-header-title)
       "Human." [:br] "Learner." [:br] "Thinker."]
      [:p (use-style more-header-description)
       "There's more than that, though."]]]
    [:div (use-style groups-container)
     (let [more-list @(rf/subscribe [:more])]
       (for [{:keys [id title description link-text href]} more-list]
         [:div (use-style more-detail-container
                          {:key id})
          [:div (use-style craft-title-container)
           [:h3 (use-style more-title) title]]
          [:div (use-style more-description-container)
           [:p (use-style more-description) description]
           [:a {:href href}
            [:p (use-style more-link
                           {:class "highlight"})
             link-text]]
           [:hr {:style {:border "1px solid #191C24"
                         :width "100%"}}]]]))]
    [:div (use-style footer)
     [:p (use-sub-style footer :text)
      "Crafted with love by "
      [:strong (use-sub-style footer :strong) "Alexandre Severo."]]
     [:p (use-sub-style footer :text)
      "Built with "
      [:strong (use-sub-style footer :strong) "ClojureScript"]
      " and "
      [:strong (use-sub-style footer :strong) "Reagent."]]]]])