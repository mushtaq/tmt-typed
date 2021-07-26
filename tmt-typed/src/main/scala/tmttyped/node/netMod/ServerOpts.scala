package tmttyped.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOpts extends StObject {
  
  /**
    * Indicates whether half-opened TCP connections are allowed.
    * @default false
    */
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the socket should be paused on incoming connections.
    * @default false
    */
  var pauseOnConnect: js.UndefOr[Boolean] = js.undefined
}
object ServerOpts {
  
  @scala.inline
  def apply(): ServerOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOpts]
  }
  
  @scala.inline
  implicit class ServerOptsMutableBuilder[Self <: ServerOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
    
    @scala.inline
    def setPauseOnConnect(value: Boolean): Self = StObject.set(x, "pauseOnConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseOnConnectUndefined: Self = StObject.set(x, "pauseOnConnect", js.undefined)
  }
}
