(ns job-streamer.console.core
  (:require [om.core :as om :include-macros true])
  (:use [job-streamer.console.components.root :only [root-view]]))

(def app-state (atom {:query ""
                      :jobs nil
                      :agents nil
                      :system-error nil
                      :stats {:jobs-count 0 :agents-count 0}
                      :mode [:jobs]}))

(om/root root-view app-state
         {:target (.getElementById js/document "app")})
