(ns rabbit-hole.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Im Late!!"))

(defn rabbit-cry
  "I'm late!"
  [n]
  (dotimes [i n]
    (println "I'm late!")))

;;;; Notes:
;;; These notes are most likely going to be moved out into another document. This is just a temperary place for them to live. I am doing this so I can feel ok writing notes and making the code look ugly. If I can return and clean it up later. That is good because I can get the ideas out of my head and into a place where I can see them.

(defn rabbit-hole
  "This is the main function that will be called to start the game."
  []
  (println "Welcome to the Rabbit Hole!")
  (println "You are Alice and you have fallen down the rabbit hole. This is the start of your adventure.")
  (println "You are sitting on the branch bored and you see a rabbit run by.")
  (println "Do you follow the rabbit? (yes/no)"))

;; There are many characters in the story. She goes on an adventure. It is filled with small interactions with many characters. They each have big personalitys. They are all very different. They are all very strange. They are all very interesting. They are all very fun. They are all very scary. I think this is one of the things that makes it a good story. I guess on the grounds that all the characters are scary. I would have to push back. I think they are all definitly strange. I think some are scary. Some are just interesting.
(def characters ["Alice" "Rabbit" "Mad Hatter" "Queen of Hearts" "Cheshire Cat" "Caterpillar" "Dormouse" "March Hare" "Tweedledee" "Tweedledum"])

;; Questions I can ask about the data of characters
;; How many characters are there?
;; What are the names of the characters?

(defn number-of-characters
  "This function will return the number of characters in the characters list."
  []
  (count characters))

(def alice {:name       "Alice"
            :age        7
            :size       "small"
            :location   "England"
            :adventures 0
            :cat        "Dinah"
            :sister     "Lorina"
            :bio        "Alice is a curious and imaginative"
            :stats      {:strength     5
                         :intelligence 7
                         :wisdom       6
                         :dexterity    4
                         :constitution 5
                         :charisma     6}})

(def rabbit {:name "Rabbit" :size "small" :location "Wonderland" :adventures 0})

(defn random-character
  "This function will return a random character from the characters list."
  []
  (rand-nth characters))


;;;; Notes:
;; Think about what you are trying to make. It needs to have data. It needs to have a little bit of randomness. But enough aspects that you can control to make it a game. Is that What I am thinking about? Is it a game? I have always been bad at games. I have always been bad at making games. I have always been bad at playing games. I have always been bad at understanding.

