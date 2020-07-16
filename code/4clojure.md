# 4Clojure

## 1 Nothing but the Truth

```clojure
true
```

## 2 Simple Math

```clojure
4
```

## 3 Intro to Strings

```clojure
"HELLO WORLD"
```

## 4 Intro to Lists

```clojure
:a :b :c
```

## 5 Lists: conj

```clojure
(= ^^('(1 2 3 4))^^ (conj '(2 3 4) 1))
(= ^^('(1 2 3 4))^^ (conj '(3 4) 2 1))
```

## 6 Intro to Vectors

```clojure
:a :b :c
```

## 7 Vectors: conj

```clojure
[1, 2, 3, 4]
```

## 8 Intro to sets

```clojure
#{:a :b :c :d}
```

## 9 Sets conj

```clojure
2
```

## 10 Intro to maps

```clojure
20
```

## 11 Maps: conj

```clojure
{:b 2}
```

## 12 Intro to Sequences

```clojure
3
```

## 13 Sequences: rest

```clojure
[20 30 40]
```

## 14 Intro to Functions

```clojure
8
```

## 15 Double Down

```clojure
(fn double [x] (\* x 2))
```

## 16 Hello World

```clojure
(fn greet [x] (str "Hello, " x "!"))
```

## 17 Sequences: map

```clojure
'(6 7 8)
```

## 18 Sequences: filter

```clojure
'(6 7)
```

## 19 Last Element

```clojure
(fn lst [x] (nth x (- (count x) 1)))
```

## 20 Penultimate Element

```clojure
(fn penultimate [x] (nth x (- (count x) 2)))
```

## 21 Nth Element

### Recursive solution

```clojure
(fn nthel [l n]
    (if (= n 0)
        (first l)
        (nthel (rest l) (dec 1))))
```

### Non recursive solution

```clojure
(fn nthel [l n]
    ((vec l) n))
```

## 22 Count a Sequence

```clojure
(fn cnt [lst]
    (if (= lst nil)
        0
        (inc (cnt (next lst)))))
```

## 23 Reverse a Sequence

```clojure
(fn rev [coll]
    (if (empty? coll)
        []
        (conj (rev (rest coll)) (first coll))))
```

## 24 Sum It All Up

```clojure
(fn siap [l]
    (if (empty? l)
        0
        (+ (first l) (siap (rest l)))))
```

## 25 Find the odd numbers

```clojure
(fn [xs] (filter odd? xs))
```

## 26 Fibonacci Sequence

```clojure
(fn [n]
    (if (= n 0)
        []
        (if (= n 1)
            [1]
            (last (take (dec n) (iterate
                (fn [xs] (conj xs (+ (last xs) (nth xs (- (count xs) 2)))))
                [1 1]))))))
```

## 27 Palindrome Detector

```clojure
(fn [xs]
  (if (string? xs)
    (= (apply str (reverse xs) xs))
    (= (reverse xs) xs)))
```

## 28 Flatten a Sequence

```clojure
(fn my-flatten
  [xs]
  (if (empty? xs)
    '()
    (concat (if (coll? (first xs))
              (my-flatten (first xs))
              (list (first xs)))
            (my-flatten (rest xs)))))
```

## 29 Get the Caps

```clojure
(fn [string]
  (apply str (filter #(Character/isUpperCase %) string)))
```

## 30 Compress a Sequence

```clojure
(fn [xs]
  	(reduce
    	(fn [v e]
          (if
            (= e (last v))
            v
            (conj v e)))
                    [] xs))
```

## 31 Pack a Sequence

```clojure
(fn [xs] (partition-by identity xs))
```

## 32 Duplicate a sequence

```clojure
(fn [xs] (interleave xs xs))
```

## 33 Replicate a Sequence

My initial solution works locally in the REPL, but not on 4clojure. It may be because of 4clojure's clojure's version

```clojure
(fn replicate-a-sequence
  [xs n]
  (apply interleave (repeat n xs)))
```

This solutions passes all the test cases:

```clojure
(fn replicate-a-sequence
  [xs n]
  (mapcat (fn [e] (repeat n e)) xs))
```

## 34 Implement range

```clojure
(fn my-range [start end]
  (if (= (inc start) end) (list start)
  	(conj (my-range (inc start) end) start)))
```

## 35 Local Bindings

```clojure
7
```

## 36 Let it Be

```clojure
[x 7 y 3 z 1]
```

## 37 Regular Expressions

```clojure
"ABC"
```

## 38 Maximum value

```clojure
(fn [& xs]
  (reduce (fn [mx e] (if (pos? (- mx e)) mx e)) xs))
```

## 39 Interleave two sequence

```clojure
(fn my-interleave [v1 v2]
  (when (and (first v1) (first v2))
    (concat [(first v1) (first v2)] (my-interleave (rest v1) (rest v2)))))
```

## 40 Interpose a Seq

```clojure
(fn [v xs] (drop-last (interleave xs (repeat (count xs) v))))
```

## 41 Drop Every Nth Item

```clojure
(fn drop-nth [xs n] (keep-indexed (fn [i e] (if (not= (mod (inc i) n) 0) e nil)) xs))
```

## 42 Factorial fun

```clojure
(fn my-factorial [n]
  (reduce * (range 1 (inc n))))
```

## 45 Intro to iterate

```clojure
'(1 4 7 10 13)
```

## 46. Flipping Out

```clojure
(fn [f]
  (fn [& args]
    (apply f (reverse args))))
```

## 47 Contain Yourself

```clojure
4
```

## 48 Intro to some

```clojure
6
```

## 49 Split a sequence

```clojure
(fn [s xs]
  [(take s xs) (drop s xs)])
```

## 51 Advanced Destructuring

```clojure
[1 2 3 4 5]
```

## 52 Intro to Destructuring

```clojure
[c e]
```

## 57 Simple Recursion

```clojure
'(5 4 3 2 1)
```

## 61 Map Construction

```clojure
#(apply hash-map (interleave %1 %2))
```

## 62 Re-implement Iterate

```clojure
(fn my-iterate
  [f x]
  (cons x (lazy-seq (my-iterate f (f x)))))
```

## 63 Group a Sequence

```clojure
(fn group-sequence [f coll]
  (reduce
   (fn [m e] (let [result (f e)]
               (assoc m result (conj (vec (get m result)) e))))
   {} coll))
```

## 64 Intro to Reduce

```clojure
+
```

## 66 Greatest Common Divisor

```clojure
(fn gcd
  [a b]
  (if (= a b)
    a
    (gcd (min a b) (- (max a b) (min a b)))))
```

## 68 Recurring Theme

```clojure
[7 6 5 4 3]
```

## 71 Rearranging Code: ->

```clojure
count
```

## 72 Rearranging Code: ->>

```clojure
reduce +
```

## 81 Set Intersection

```clojure
(fn my-intersection
  [s1 s2]
  (set (reverse (filter (into #{} s2) s1))))
```

## 83 A Half-Truth

```clojure
(fn half-truth [& args]
  (cond
    (every? true? args) false
    (some true? args) true
    :else false))
```

## 88. Symmetric Difference

```clojure
(fn symmetric-difference
  [s1 s2]
  (clojure.set/union (clojure.set/difference s1 s2) (clojure.set/difference s2 s1)))
```

## 90 Cartesian Product

```clojure
(fn cartesian-product
  [coll1 coll2]
  (into #{} (for [x coll1 y coll2] [x y])))
```

## 93. To tree, or not to tree?

```clojure
(fn tree? [xs]
  (cond
   (or (seq? xs) (vector? xs)) (and (= 3 (count xs)) (tree? (nth xs 1)) (tree? (nth xs 2)))
   (nil? xs) true
   :else false))
```

## 96. Beauty is Symmetry

```clojure
(fn symmetric? [tree]
  (= tree ((fn mirror [t] (when t [(first t) (mirror (last t)) (mirror (second t))])) tree)))
```

## 97. Pascal's Triangle

```clojure
(fn pascal [n]
  (if (= n 1)
    [1]
    (last (take (dec n) (iterate (fn [xs]
                                   (concat
                                    (conj (map + (butlast xs) (rest xs)) 1)
                                    '(1)))
                                 [1 1])))))
```

## 99 Product Digits

```clojure
(fn [x y] (map #(Character/digit % 10) (seq (str (* x y)))))
```

### 100. Least Common Multiple

```clojure
(fn [& nums]
  (letfn [(gcd [a b] (if (= a b) a (gcd (min a b) (- (max a b) (min a b)))))]
  (/ (reduce * nums) (reduce gcd nums))))
```

## 107 Simple closures

```clojure
(fn [n]
  (fn [x] (reduce * (repeat n x))))
```

## 118. Reimplement Map

```clojure
(fn my-map
  [f coll]
  (if (empty? coll)
    nil
    (lazy-seq (cons (f (first coll)) (my-map f (rest coll))))))
```

## 120. Sum of square of digits

```clojure
(fn sum-of-sq-digits
  [coll]
  (let [digits (fn [n] (map #(- (int %) 48) (str n)))
        squared-component-digits (fn [digits] (reduce + (map #(* % %) digits)))]
        (count (filter #(< % (squared-component-digits (digits %))) coll))))
```

## 122. Read a binary number

```clojure
(fn [binary]
  (apply + (map-indexed (fn [i e] (int (* e (Math/pow 2 i)))) (map #(Character/digit % 10) (reverse (seq binary))))))
```

### 126. Through the Looking Glass

```clojure
java.lang.Class
```

## 128. Recognizing playing cards

```clojure
(fn recognize [card]
  (let [get-suit (fn [c] ((zipmap (map str "SHDC") [:spade :heart :diamond :club]) (str (first card))))
        get-rank (fn [c] ((zipmap (map str "23456789TJQKA") (range 13)) (str (last card))))]
    {:suit (get-suit card) :rank (get-rank card)}))
```

## 134 A nil key

```clojure
(fn [ky mp]
  (=  (get mp ky :not-here) nil))
```

## 135. Infix Calculator

```clojure
(fn infix
  [& xs]
  (reduce
    (fn [acc e]
      (if (fn? e)
        (partial e acc)
        (acc e)))
    (partial + 0) xs))
```

## 143. dot product

```clojure
(fn dot-product
  [v1 v2]
  (apply + (map-indexed (fn [i e] (* e (get v2 i))) v1)))
```

## 145 For the win

```clojure
'(1 5 9 13 17 21 25 29 33 37)
```

## 146. Trees into tables

```clojure
#(into {} (for [[k v] % [k2 v2] v] [[k k2] v2]))
```

## 147. Pascal Trapezoid

```clojure
(fn pascal-trapezoid [v]
  (iterate (fn [x] (vec (map +' (conj x 0) (concat [0] x)))) v))
```

### 153. Pairwise Disjoint Sets

```clojure
(fn [sets]
  (= (reduce + (map count sets))
     (count (reduce clojure.set/union sets))))
```

## 156 Map Defaults

```clojure
(fn [default xs]
  	(reduce (fn [v x] (into v [[x default]])) {} xs))
```

## 157. Indexing Sequences

```clojure
(fn indexing-sequences [xs]
  (map-indexed (fn [i e] [e i]) xs))
```

## 161 Subset and Superset

```clojure
#{1 2}
```

## 162 Logical falsity and truth

```clojure
1
```

## 166 Comparisons

```clojure
(fn comparison
  [c x y]
  (cond
   (c x y) :lt
   (c y x) :gt
   :else :eq))
```

## 173. Intro to Destructuring 2

```clojure
f xs
```
