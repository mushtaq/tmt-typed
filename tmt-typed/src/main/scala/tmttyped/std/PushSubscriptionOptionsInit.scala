package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushSubscriptionOptionsInit extends StObject {
  
  /* standard DOM */
  var applicationServerKey: js.UndefOr[BufferSource | java.lang.String | Null] = js.undefined
  
  /* standard DOM */
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
}
object PushSubscriptionOptionsInit {
  
  @scala.inline
  def apply(): PushSubscriptionOptionsInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSubscriptionOptionsInit]
  }
  
  @scala.inline
  implicit class PushSubscriptionOptionsInitMutableBuilder[Self <: PushSubscriptionOptionsInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationServerKey(value: BufferSource | java.lang.String): Self = StObject.set(x, "applicationServerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationServerKeyNull: Self = StObject.set(x, "applicationServerKey", null)
    
    @scala.inline
    def setApplicationServerKeyUndefined: Self = StObject.set(x, "applicationServerKey", js.undefined)
    
    @scala.inline
    def setUserVisibleOnly(value: scala.Boolean): Self = StObject.set(x, "userVisibleOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVisibleOnlyUndefined: Self = StObject.set(x, "userVisibleOnly", js.undefined)
  }
}
