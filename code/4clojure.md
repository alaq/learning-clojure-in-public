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
