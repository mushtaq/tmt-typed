package tmttyped.node

import tmttyped.node.netMod.SocketConstructorOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeTtyMod {
  
  @JSImport("node:tty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def isatty(fd: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isatty")(fd.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
