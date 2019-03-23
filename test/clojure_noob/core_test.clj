(ns clojure-noob.core-test
  (:require [clojure.test :refer :all]
            [clojure-noob.core :refer :all]))

(deftest error-message-test
  (testing "MSG when true"
    (is (error-message :mild) "OH GOD! IT'S A DISASTER! WE'RE MILDLY INCONVENIENCED!"))
  (testing "MSG when false")
    (is (error-message :aloha) "OH GOD! IT'S A DISASTER! WE'RE DOOOOOOOMED!"))
