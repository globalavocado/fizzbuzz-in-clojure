(ns fizzbuzz-in-clojure.core)

(defn divisible-by-three [number]
		(zero? (mod number 3))
		)

(defn divisible-by-five [number]
		(zero? (mod number 5))
		)

(defn divisible-by-fifteen [number]
		(zero? (mod number 15))
		)


