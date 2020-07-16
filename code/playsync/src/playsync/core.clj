(ns playsync.core
  (:require [clojure.core.async
             :as a
             :refer [>! <! >!! <!! go chan buffer close! thread
                     alts! alts!! timeout]]))

(defn -main
  []
  (def echo-chan (chan))
  (go (println (<! echo-chan)))
  (>!! echo-chan "stuff"))