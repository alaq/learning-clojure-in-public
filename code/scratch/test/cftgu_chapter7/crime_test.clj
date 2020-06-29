(ns scratch
  .crime-test
  (:require [clojure.test :refer [deftest is]]
            [scratch
             .crime :refer [fips-code]]))

(deftest fips-code-test
  (is (= "12345" (fips-code {:fips_state_code "12" :fips_county_code "345"}))))