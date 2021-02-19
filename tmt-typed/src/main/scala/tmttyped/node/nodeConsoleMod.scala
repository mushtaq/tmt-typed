package tmttyped.node

import org.scalablytyped.runtime.Shortcut
import tmttyped.node.NodeJS.WritableStream
import tmttyped.node.consoleMod.global.Console_
import tmttyped.node.consoleMod.global.NodeJS.ConsoleConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeConsoleMod extends Shortcut {
  
  @JSImport("node:console", JSImport.Namespace)
  @js.native
  val ^ : Console_ = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("node:console", "Console")
  @js.native
  class Console protected () extends Console_ {
    def this(options: ConsoleConstructorOptions) = this()
    def this(stdout: WritableStream) = this()
    def this(stdout: WritableStream, stderr: WritableStream) = this()
    def this(stdout: WritableStream, stderr: js.UndefOr[scala.Nothing], ignoreErrors: Boolean) = this()
    def this(stdout: WritableStream, stderr: WritableStream, ignoreErrors: Boolean) = this()
  }
  
  type _To = Console_
  
  /* This means you don't have to write `^`, but can instead just say `nodeConsoleMod.foo` */
  override def _to: Console_ = ^
}
