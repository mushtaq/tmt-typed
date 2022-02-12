package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait PushSubscriptionOptions extends StObject {
  
  /* standard DOM */
  val applicationServerKey: js.typedarray.ArrayBuffer | Null
}
object PushSubscriptionOptions {
  
  @scala.inline
  def apply(): PushSubscriptionOptions = {
    val __obj = js.Dynamic.literal(applicationServerKey = null)
    __obj.asInstanceOf[PushSubscriptionOptions]
  }
  
  @scala.inline
  implicit class PushSubscriptionOptionsMutableBuilder[Self <: PushSubscriptionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationServerKey(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "applicationServerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationServerKeyNull: Self = StObject.set(x, "applicationServerKey", null)
  }
}
