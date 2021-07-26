package tmttyped.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpcSocketConnectOpts
  extends StObject
     with ConnectOpts
     with SocketConnectOpts {
  
  var path: String
}
object IpcSocketConnectOpts {
  
  @scala.inline
  def apply(path: String): IpcSocketConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpcSocketConnectOpts]
  }
  
  @scala.inline
  implicit class IpcSocketConnectOptsMutableBuilder[Self <: IpcSocketConnectOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
