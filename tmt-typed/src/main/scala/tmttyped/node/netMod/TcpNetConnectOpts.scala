package tmttyped.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpNetConnectOpts
  extends StObject
     with TcpSocketConnectOpts
     with SocketConstructorOpts
     with NetConnectOpts {
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object TcpNetConnectOpts {
  
  @scala.inline
  def apply(port: Double): TcpNetConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpNetConnectOpts]
  }
  
  @scala.inline
  implicit class TcpNetConnectOptsMutableBuilder[Self <: TcpNetConnectOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
