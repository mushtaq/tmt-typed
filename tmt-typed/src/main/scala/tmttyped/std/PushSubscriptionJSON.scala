package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushSubscriptionJSON extends StObject {
  
  /* standard DOM */
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var expirationTime: js.UndefOr[DOMTimeStamp | Null] = js.undefined
  
  /* standard DOM */
  var keys: js.UndefOr[Record[java.lang.String, java.lang.String]] = js.undefined
}
object PushSubscriptionJSON {
  
  @scala.inline
  def apply(): PushSubscriptionJSON = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSubscriptionJSON]
  }
  
  @scala.inline
  implicit class PushSubscriptionJSONMutableBuilder[Self <: PushSubscriptionJSON] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: java.lang.String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: DOMTimeStamp): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    @scala.inline
    def setKeys(value: Record[java.lang.String, java.lang.String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
  }
}
