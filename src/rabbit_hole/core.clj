(ns rabbit-hole.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Im Late!!"))

;;; Make a function that takes a number and returns that number of lines saying "I'm late!"
(defn rabbit-cry
  "I'm late!"
  [n]
  (dotimes [i n]
    (println "I'm late!")))

;;;; Notes:
;;; These notes are most likely going to be moved out into another document. This is just a temperary place for them to live. I am doing this so I can feel ok writing notes and making the code look ugly. If I can return and clean it up later. That is good because I can get the ideas out of my head and into a place where I can see them.



