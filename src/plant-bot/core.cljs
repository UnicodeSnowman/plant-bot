(ns plant-bot.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(def five (js/require "johnny-five"))
