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
-   `let` to declare a symbol locally (within its expression)
-   `def` to declare a mutable variable
-   `fn` to declare a function
-   `defn` to declare a named function
-   `doc` to access the docstring of a function
-   `meta` to access the metadata of a function
-   `supers` returns a set of all the types that include a specific type

```clojure
 user=> (supers (type type))
#{clojure.lang.AFunction clojure.lang.IMeta java.util.concurrent.Callable clojure.lang.Fn clojure.lang.AFn java.util.Comparator java.lang.Object clojure.lang.RestFn clojure.lang.IObj java.lang.Runnable java.io.Serializable clojure.lang.IFn}
```

-   `fn?` returns whether the argument is a function or not
-   `source` retrieves the source code of a function
-   `empty?` returns true if a collection is empty
-   `cons` will return a list made of the first argument, and all the elements in the second argument
-   `if` will take a condition, then an expression to evaluate if it's true, and one if it isn't

-   `if` will take a condition, then an expression to evaluate if it's true, and one if it isn't
-   `keyword` takes a string and returns a keyword
-   `map` takes a function and a sequence, it applies the the function to every member of the sequence. It can also take more sequences, and will take an member from each sequence each time and pass it to the function (which should take these arguments). If one sequence is shorter than others, `map` will stop at the last element of that sequence.
-   `map-indexed` passes the index first and the element of the sequence to the function it is passed
-   `pos?` returns true if a number is positive
-   `iterate` takes a function and a starting number and will run that function indefinitely, each time taking the result of the previous function call
-   You can use `take` to limit the number of times the function is run. A good example would be `(take 10 (iterate inc 0))`
-   `repeat` returns a sequence where every element is the same, it just takes that member to return
-   `repeatedly` takes a function and returns a sequence of the result of these calls
-   `rand` generates a number between 0 and 1
-   `range` generates sequences of numbers between two points. With one argument (a number) it generates the sequences between 0 and that number. With two numbers as arguments, it will be between these two numbers. The last argument (optional) is the step.
-   `cycle` extends a sequence by repeating it forever. Here as well you can limit it with `take`
-   `concat` concatenate sequences together
-   `interleave` will combine two sequences together, one element of each at a time
-   `interpose` will add an element between every member of the sequence it is passed (member first argument, sequence second)
-   `reverse` will reverse sequences
-   `seq` breaks a sequence of characters
-   `apply` and `str` together can rebuild a string from a sequence of character
-   `shuffle` randomizes the members of a sequence
-   `drop` removes the first n elements of a sequence
-   `take-last`keeps the n elements at the end of the sequence
-   `drop-last` removes the last n elements of a sequence
-   `take-while` keeps the elements until it doesn't satisfy a condition anymore. `(take-while pos? [3 2 1 0 -1 -2 10])` will return `(3 2 1)`
-   `drop-while` is the same as above with `drop`
-   `split-at` will split a sequence at an index
-   `split-with` will split where the function passed is no longer satisfied
-   `filter` takes a condition like `pos?` (a function) and sequence, and filters depending on that condition (if it returns a truthy value)
-   `remove` is the opposite of `filter`
-   `partition` will take a number n and a sequence and return sequence grouped by n elements together
-   `partition-by` takes a function and a sequence and will group depending on whether the function returns a truthy value or not
-   `partition-all` will partition it all, maybe returning at shorter sequence at the end
-   `frequencies` will count how many times an element appears in a sequence. `(frequencies [:meow :mrrrow :meow :meow])` will return `{:meow 3, :mrrrow 1}`
-   `pprint` pretty print an object
-   `group-by` group sequences by a function, for instance

```clojure
user=> (pprint (group-by :first [{:first "Li"    :last "Zhou"}
                                 {:first "Sarah" :last "Lee"}
                                 {:first "Sarah" :last "Dunn"}
                                 {:first "Li"    :last "O'Toole"}])){"Li"    [{:last "Zhou", :first "Li"}   {:last "O'Toole", :first "Li"}],
 "Sarah" [{:last "Lee", :first "Sarah"} {:last "Dunn", :first "Sarah"}]}
```

Note here that the keyword is used as a function

-   `reduce` takes a function and will run it on the first two elements (unless you pass a starting value) and then run again on the result of that function and the next value.
-   `reductions` does the same but returns a sequence will all the steps
-   `into` reduces elements into a collection

```clojure
user=> (into {} [[:a 2] [:b 3]])
{:a 2, :b 3}
user=> (into (list) [1 2 3 4])
(4 3 2 1)
```

Adding an element to a list appears at the end, so it reverses the list

-   `reduced` lets you break out of reduce early
-   `lazy-seq` defers the execution of what is in the expression to when it is needed
-   `realized?` lets you figure out if a function is realized or not
-   `do` evaluate the expressions in order, and returns the value of the last
-   `prn` prints to the console
-   `dotime` will pass a parameter i to a function a n number of times
-   `merge` merges map, takes the value of the last map if there's a collision
-   `merge-with` merges maps with a function
-   `key`, `val` extracts the key and value of a map's element
-   `partial` takes a function and arguments, returns a new function which calls the original function, with the original arguments, followed by the new arguments passed to the new function
-   `cond` is like cases in JavaScript, it's a function returning a boolean first, then what we actually return, as many times as we want.
-   `contains?` checks if a key exists in a map, will be index if it's a vector or a list: `(contains? {:a 1} :a)` => true, and `(contains? '(4 5 6) 1)` => true
