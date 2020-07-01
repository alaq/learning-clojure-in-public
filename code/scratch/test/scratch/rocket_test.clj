(ns scratch.rocket-test
  (:require [clojure.test :refer [deftest testing is]]
            [scratch.rocket :refer [cartesian->spherical spherical->cartesian atlas-v prepare trajectory crashed? crash-time apoapsis apoapsis-time centaur]]))

(deftest spherical-coordinate-test

  (testing "spherical->cartesian"
    (is (= (spherical->cartesian {:r 2
                                  :phi 0
                                  :theta 0})
           {:x 0.0 :y 0.0 :z 2.0})))

  (testing "roundtrip"
    (let [pos {:x 1.0 :y 2.0 :z 3.0}]
      (is (= pos (-> pos cartesian->spherical spherical->cartesian))))))

(deftest makes-orbit
  (let [trajectory (->> (atlas-v (centaur))
                        prepare
                        (trajectory 1))]

    (when (crashed? trajectory)
      (println "Crashed at" (crash-time trajectory) "seconds")
      (println "Maximum altitude" (apoapsis trajectory)
               "meters at"        (apoapsis-time trajectory) "seconds"))

    ; Assert that the rocket eventually made it to orbit.
    (is (not (crashed? trajectory)))))
