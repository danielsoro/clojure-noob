(ns clojure-noob.core
  (:gen-class))

(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
       (if (= severity :mild)
         "MILDLY INCONVENIENCED!"
         "DOOOOOOOMED!")))
         
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (error-message :mild))
  (println "I'm a little teapot!"))