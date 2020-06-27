(ns cftgu-chapter6.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn pow
  "Raises base to the given power. For instance (pow 3 2) returns three squared, or nine."
  [base power]
  (apply * (repeat power base)))
