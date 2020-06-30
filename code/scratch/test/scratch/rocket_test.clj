(ns scratch.rocket-test
  (:require [clojure.test :refer [deftest testing is]]
            [scratch.rocket2 :refer [cartesian->spherical spherical->cartesian]]))

(deftest spherical-coordinate-test

  (testing "spherical->cartesian"
    (is (= (spherical->cartesian {:r 2
                                  :phi 0
                                  :theta 0})
           {:x 0.0 :y 0.0 :z 2.0})))

  (testing "roundtrip"
    (let [pos {:x 1 :y 2 :z 3}]
      (is (= pos (-> pos cartesian->spherical spherical->cartesian))))))
