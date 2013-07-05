(defproject neko "3.0.0-SNAPSHOT"
  :description "Neko is a toolkit designed to make Android development using Clojure easier and more fun."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[android/clojure "1.5.0"]]
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]

  :android {:library true
            :target-sdk "15"})
