package tmttyped.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - tmttyped.node.netMod.TcpNetConnectOpts
  - tmttyped.node.netMod.IpcNetConnectOpts
*/
trait NetConnectOpts extends StObject
object NetConnectOpts {
  
  @scala.inline
  def IpcNetConnectOpts(path: String): tmttyped.node.netMod.IpcNetConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.netMod.IpcNetConnectOpts]
  }
  
  @scala.inline
  def TcpNetConnectOpts(port: Double): tmttyped.node.netMod.TcpNetConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.netMod.TcpNetConnectOpts]
  }
}
