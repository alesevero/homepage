(ns app.state.db
  (:require [re-frame.core :as rf]))

(def db {:active-nav :about
         :articles [{:id 1
                     :title "Creating a ClojureScript App for the First Time - Pt.1"
                     :subtitle "Understanding the stack and building the project's foundation"
                     :href "https://aleseverojr.medium.com/creating-a-clojurescript-spa-for-the-first-time-pt-1-d3012c42e622"}
                    {:id 2
                     :title "Error Handling Made Composable with Vavr"
                     :subtitle "A functional approach to exception handling in Java."
                     :href "https://medium.com/swlh/error-handling-made-composable-with-vavr-1684e94a6f4e"}
                    {:id 3
                     :title "Null-Checking Done Right with Optionals"
                     :subtitle "Optional monad to better null-checks in your code"
                     :href "https://medium.com/swlh/null-checking-done-right-with-optionals-78003c9329a7"}]
         :more [{:id 1
                 :title "Projects"
                 :description "Because software engineers need to engineer."
                 :link-text "Take a look"
                 :href "#work"}
                {:id 2
                 :title "Writing"
                 :description "Talk about a dev that likes to write, eh?"
                 :link-text "Read them all"
                 :href "https://aleseverojr.medium.com"}
                {:id 3
                 :title "Find Me"
                 :description "Let's have a conversation."
                 :link-text "Where am I?"
                 :href "#find-me"}]
         :crafts [{:id 1
                   :title "Business"
                   :description "There is no such thing as engineering without
                                 business. Having worked in large and small
                                 companies, I am able to learn and understand
                                 business in a fast-paced rhythm, being able to
                                 deliver high-grade software that fullfils the
                                 business domain's requirements."}
                  {:id 2
                   :title "Engineering"
                   :description "From back-end, to front-end and finally
                                 full-stack development, I have the knowledge
                                 needed build scalable, robust, reliable
                                 software. Design Patterns, micro services,
                                 Object-Oriented and Functional Programming;
                                 Java, Javascript and Clojure(Script); Spring,
                                 Node and React (Native). The list is endless."}
                  {:id 3
                   :title "Design"
                   :description "Each product is unique, and so are its user
                                 needs. I can easily build methods and run
                                 design thinking sessions, researches, build
                                 high and low-fidelity prototypes, as well do
                                 testing and validation of a product. All of
                                 that making rational decisions that impact the
                                 end user experience."}]
         :social-links [{:id 1
                         :title "Linkedin"
                         :href "https://www.linkedin.com/in/alesevero/"}
                        {:id 2
                         :title "Medium"
                         :href "https://aleseverojr.medium.com"}
                        {:id 3
                         :title "Github"
                         :href "https://github.com/alesevero"}
                        {:id 4
                         :title "Instagram"
                         :href "https://www.instagram.com/eu.alesevero/"}]})

(rf/reg-event-db
 :initialize-db
 (fn [_ _]
   db))
