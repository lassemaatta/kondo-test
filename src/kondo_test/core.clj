(ns kondo-test.core
  (:gen-class))

(defn parse-long
  [_]
  42)

(defn parse-double
  [_]
  3.1)

(defn parse-uuid
  [_]
  1)

(defn -main
  "I don't do a whole lot ... yet."
  [& _args]
  (println "Hello, World!")
  (println (parse-int "a"))
  (println (parse-long "1.2"))
  (println (parse-uuid "foo")))
