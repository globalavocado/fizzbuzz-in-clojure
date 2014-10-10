(ns fizzbuzz-in-clojure.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz-in-clojure.core :refer :all]))

(deftest is-divisible-by-three
	(testing "returns true for 3")
	(is (= true (divisible-by-three 3)))
)

(deftest is-not-divisible-by-three
	(testing "returns false for 1")
	(is (= false (divisible-by-three 1)))

)

(deftest is-divisible-by-five
	(testing "returns true for 5")
	(is (= true (divisible-by-five 5)))
)

(deftest is-not-divisible-by-five
	(testing "returns false for 4")
	(is (= false (divisible-by-five 4)))
)