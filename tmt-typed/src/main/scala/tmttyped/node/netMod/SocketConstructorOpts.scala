package tmttyped.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketConstructorOpts extends StObject {
  
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  
  var fd: js.UndefOr[Double] = js.undefined
  
  var readable: js.UndefOr[Boolean] = js.undefined
  
  var writable: js.UndefOr[Boolean] = js.undefined
}
object SocketConstructorOpts {
  
  @scala.inline
  def apply(): SocketConstructorOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketConstructorOpts]
  }
  
  @scala.inline
  implicit class SocketConstructorOptsMutableBuilder[Self <: SocketConstructorOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
    
    @scala.inline
    def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
    
    @scala.inline
    def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
    
    @scala.inline
    def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
