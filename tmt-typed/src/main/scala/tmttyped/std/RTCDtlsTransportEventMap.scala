package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDtlsTransportEventMap extends StObject {
  
  /* standard DOM */
  var statechange: org.scalajs.dom.Event
}
object RTCDtlsTransportEventMap {
  
  @scala.inline
  def apply(statechange: org.scalajs.dom.Event): RTCDtlsTransportEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsTransportEventMap]
  }
  
  @scala.inline
  implicit class RTCDtlsTransportEventMapMutableBuilder[Self <: RTCDtlsTransportEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
