(require 'cljs.repl)
(require 'cljs.build.api)
(require 'cljs.repl.node)

(cljs.build.api/build "src"
                      {:main 'plant-bot.core
                       :output-to "target/out/main.js"
                       :verbose true})

(cljs.repl/repl (cljs.repl.node/repl-env)
                :watch "src"
                :output-dir "target/out")