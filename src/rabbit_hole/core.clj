(ns rabbit-hole.core
  (:gen-class))

(defn rabbit-cry
  "I'm late!"
  [n]
  (dotimes [i n]
    (println "I'm late!")))

(defn rabbit-hole
  "This is the main function that will be called to start the game."
  []
  (println "Welcome to the Rabbit Hole!")
  (println "You are Alice and you have fallen down the rabbit hole. This is the start of your adventure.")
  (println "You are sitting on the branch bored and you see a rabbit run by.")
  (println "Do you follow the rabbit? (yes/no)"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Im Late!!"))