(ns map-utils.core-test
  (:require [expectations :refer :all]
            [map-utils.core :refer :all]))

(def m1 [{:name "Paul Bowler", :dob "01/01/1975"}
         {:name "Bob Smith",   :dob "17/07/1971"}
         {:name "Jim Brown",   :dob "20/02/1981"}
         {:name "Kate Jones",  :dob "31/12/1985"}
         {:name "Helen Pain",  :dob "09/10/1951"}])

(def m2 [{:name "Paul Bowler", :colour :red}
         {:name "Bob Smith",   :colour :orange}
         {:name "Jim Brown",   :colour :yellow}
         {:name "Kate Jones",  :colour :green}
         {:name "Helen Pain",  :colour :blue}])

(def m3 [{:name "Paul Bowler", :language :clojure}
         {:name "Bob Smith",   :language :java}
         {:name "Jim Brown",   :language :c++}
         {:name "Kate Jones",  :language :Python}
         {:name "Helen Pain",  :language :Ruby}])

(expect [{:language :clojure, :colour :red, :name "Paul Bowler", :dob "01/01/1975"}
         {:language :java, :colour :orange, :name "Bob Smith", :dob "17/07/1971"}
         {:language :c++, :colour :yellow, :name "Jim Brown", :dob "20/02/1981"}
         {:language :Python, :colour :green, :name "Kate Jones", :dob "31/12/1985"}
         {:language :Ruby, :colour :blue, :name "Helen Pain", :dob "09/10/1951"}]
    (key-join :name m1 m2 m3))
