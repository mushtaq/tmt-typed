package tmttyped.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - tmttyped.node.netMod.TcpSocketConnectOpts
  - tmttyped.node.netMod.IpcSocketConnectOpts
*/
trait SocketConnectOpts extends StObject
object SocketConnectOpts {
  
  @scala.inline
  def IpcSocketConnectOpts(path: String): tmttyped.node.netMod.IpcSocketConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.netMod.IpcSocketConnectOpts]
  }
  
  @scala.inline
  def TcpSocketConnectOpts(port: Double): tmttyped.node.netMod.TcpSocketConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.netMod.TcpSocketConnectOpts]
  }
}
