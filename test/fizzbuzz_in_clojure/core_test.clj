(ns fizzbuzz-in-clojure.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz-in-clojure.core :refer :all]))

(deftest is-divisible-by-three
	(testing "returns true for 3")
	(is (= true (divisible-by-three 3)))
)