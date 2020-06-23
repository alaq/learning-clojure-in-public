# Functions

-   `inc` increments, `dec` decrements
-   `type`
-   `int`
-   `short`
-   `byte`
-   `bigint`
-   arithmetic functions like `+`, `-`, `*`, `/`
-   `=` and `==`
    -   `=` will be more accurate so `(= 3 3.0)` will return `false` (since floats are approximations)
    -   `==` considers the integer's equivalent in floating point form, so `(== 3 3.0)` will return `true`
    -   It can be applied to more than two numbers `(= 2 2 2)`
-   other comparison operators like `<`, `>`, `<=`, `>=`
-   `str` turns almost anything into a string
    -   It can also be used to concatenate strings together: `(str "hello " 3 " world" )` returns `hello 3 world`.
-   `re-find` finds the result of a regex in a string

```clojure
user=> (re-find #"cat" "mystic cat mouse")
"cat"
user=> (re-find #"cat" "only dogs here")
nil
```

-   `re-matches` will extract
-   `boolean` to return whether a value is truthy or not
-   `and` returns the first falsy value, or the last value if they are all truthy
-   `or` returns the first positive value
-   `not` inverts the logical sense of a value
-   `conj` prepends a list with a new member

```clojure
user=> (conj '(1 2 3) 4)
(4 1 2 3)
```

but also appends an element to a vector or add to a set (they are unordered anyway).

-   `list` to construct... lists
-   `first`, `last` and `nth` return the element at the nth index
-   `vec` turns other data structures into lists
-   `rest` returns everything but the first element, `()` if there are no more element
-   `next` returns everything but the first element, `nil` if there are no more element
-   `count` will tell us how big a vector is
-   `sort` will sort a set
-   `disj` will remove any element from a set
-   `contains?` to check if an element is in a set
-   `set` to create a set from any collection
-   `get` retrieves an element in a map

```clojure
(get {:name "maceo" :age 14} :name) ; "maceo"
(get {:name "maceo" :age 14} :name :weight) ; ":weight" this is a default element
```

-   `assoc` lets you add a key and a value to a map
-   `merge` will merge maps
-   `dissoc` will remove a value from a map
