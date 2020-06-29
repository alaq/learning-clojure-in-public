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

## 32 Duplicate a sequence

```clojure
(fn [xs] (interleave xs xs))
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

## 42 Factorial fun

```clojure
(fn my-factorial [n]
  (reduce * (range 1 (inc n))))
```

## 48 Intro to some

```clojure
6
```

## 52 Intro to Destructuring

```clojure
[c e]
```

## 57 Simple Recursion

```clojure
'(5 4 3 2 1)
```

## 64 Intro to Reduce

```clojure
+
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

## 134 A nil key

```clojure
(fn [ky mp]
  (=  (get mp ky :not-here) nil))
```

## 145 For the win

```clojure
'(1 5 9 13 17 21 25 29 33 37)
```

## 156 Map Defaults

```clojure
(fn [default xs]
  	(reduce (fn [v x] (into v [[x default]])) {} xs))
```

## 161 Subset and Superset

```clojure
#{1 2}
```

## 162 Logical falsity and truth

```clojure
1
```
