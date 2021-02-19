package tmttyped.node

import tmttyped.node.netMod.SocketConstructorOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeTtyMod {
  
  @JSImport("node:tty", "ReadStream")
  @js.native
  class ReadStream protected ()
    extends tmttyped.node.ttyMod.ReadStream {
    def this(fd: Double) = this()
    def this(fd: Double, options: SocketConstructorOpts) = this()
  }
  
  @JSImport("node:tty", "WriteStream")
  @js.native
  class WriteStream protected ()
    extends tmttyped.node.ttyMod.WriteStream {
    def this(fd: Double) = this()
  }
  
  @JSImport("node:tty", "isatty")
  @js.native
  def isatty(fd: Double): Boolean = js.native
}
