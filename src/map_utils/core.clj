(ns map-utils.core)

(defn- merge-key-val [key val colls]
  (apply merge (filter #(= (key %) val)(apply concat colls))))

(defn key-join [key & colls]
  (map #(merge-key-val key % colls) (map key (first colls))))
