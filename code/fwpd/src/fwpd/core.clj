(ns fwpd.core)
(def filename "suspects.csv")

(def vamp-keys [:name :glitter-index])

(defn str->int
  [str]
  (Integer. str))

(def conversions {:name identity
                  :glitter-index str->int})

(defn convert
  [vamp-key value]
  ((get conversions vamp-key) value))

(defn parse
  "Convert a CSV into rows of columns"
  [string]
  (map #(clojure.string/split % #",")
       (clojure.string/split string #"\n")))

(defn mapify
  "Return a seq of maps like {:name \"Edward Cullen\" :glitter-index 10}"
  [rows]
  (map (fn [unmapped-row]
         (reduce (fn [row-map [vamp-key value]]
                   (assoc row-map vamp-key (convert vamp-key value)))
                 {}
                 (map vector vamp-keys unmapped-row)))
       rows))

(defn glitter-filter
  [minimum-glitter records]
  (filter #(>= (:glitter-index %) minimum-glitter) records))

(defn extract-names
  [records]
  (map #(:name %) records))

(defn append
  [records new-suspect]
  (conj records new-suspect))

(defn validate
  [keyword-to-validating-function record]
  (apply = true (map (fn [key] ((key keyword-to-validating-function) (key record))) (keys keyword-to-validating-function))))

(defn convert-to-csv
  [records]
  (clojure.string/join "\n" (map (fn [record] (clojure.string/join "," (map str (vals record)))) records)))