package tmttyped.node

import tmttyped.node.anon.Options
import tmttyped.node.replMod.REPLWriter
import tmttyped.node.replMod.ReplOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeReplMod {
  
  @JSImport("node:repl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides a customizable Read-Eval-Print-Loop (REPL).
    *
    * Instances of `repl.REPLServer` will accept individual lines of user input, evaluate those
    * according to a user-defined evaluation function, then output the result. Input and output
    * may be from `stdin` and `stdout`, respectively, or may be connected to any Node.js `stream`.
    *
    * Instances of `repl.REPLServer` support automatic completion of inputs, simplistic Emacs-style
    * line editing, multi-line inputs, ANSI-styled output, saving and restoring current REPL session
    * state, error recovery, and customizable evaluation functions.
    *
    * Instances of `repl.REPLServer` are created using the `repl.start()` method and _should not_
    * be created directly using the JavaScript `new` keyword.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_repl
    */
  @JSImport("node:repl", "REPLServer")
  @js.native
  /**
    * NOTE: According to the documentation:
    *
    * > Instances of `repl.REPLServer` are created using the `repl.start()` method and
    * > _should not_ be created directly using the JavaScript `new` keyword.
    *
    * `REPLServer` cannot be subclassed due to implementation specifics in NodeJS.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_class_replserver
    */
  class REPLServer protected ()
    extends tmttyped.node.replMod.REPLServer
  
  /**
    * A flag passed in the REPL options. Evaluates expressions in sloppy mode.
    */
  @JSImport("node:repl", "REPL_MODE_SLOPPY")
  @js.native
  val REPL_MODE_SLOPPY: js.Symbol = js.native
  
  /**
    * A flag passed in the REPL options. Evaluates expressions in strict mode.
    * This is equivalent to prefacing every repl statement with `'use strict'`.
    */
  @JSImport("node:repl", "REPL_MODE_STRICT")
  @js.native
  val REPL_MODE_STRICT: js.Symbol = js.native
  
  /**
    * Indicates a recoverable error that a `REPLServer` can use to support multi-line input.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_recoverable_errors
    */
  @JSImport("node:repl", "Recoverable")
  @js.native
  class Recoverable protected ()
    extends tmttyped.node.replMod.Recoverable {
    def this(err: js.Error) = this()
  }
  
  /**
    * Creates and starts a `repl.REPLServer` instance.
    *
    * @param options The options for the `REPLServer`. If `options` is a string, then it specifies
    * the input prompt.
    */
  @scala.inline
  def start(): tmttyped.node.replMod.REPLServer = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[tmttyped.node.replMod.REPLServer]
  @scala.inline
  def start(options: java.lang.String): tmttyped.node.replMod.REPLServer = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.replMod.REPLServer]
  @scala.inline
  def start(options: ReplOptions): tmttyped.node.replMod.REPLServer = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.replMod.REPLServer]
  
  /**
    * This is the default "writer" value, if none is passed in the REPL options,
    * and it can be overridden by custom print functions.
    */
  @JSImport("node:repl", "writer")
  @js.native
  val writer: REPLWriter with Options = js.native
}
