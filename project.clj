(defproject clj-pdftoc "0.1.0-SNAPSHOT"
  :description "Generate XML with PDF's Table of Contents data."
  :url "http://courseload.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/data.json "0.1.2"]
                 [com.itextpdf/itextpdf "5.1.3"]
                 [com.itextpdf.tool/xmlworker "1.1.1"]]
  :main clj-pdftoc.core)
