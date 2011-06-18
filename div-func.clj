(defn div-by-3-or-5? [num]
  (or
    (== (mod num 3) 0)
    (== (mod num 5) 0)
  )
)

(println (reduce + (filter div-by-3-or-5? (range 100))))




