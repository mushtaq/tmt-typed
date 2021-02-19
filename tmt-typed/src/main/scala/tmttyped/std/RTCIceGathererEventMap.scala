package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceGathererEventMap extends StObject {
  
  var error: org.scalajs.dom.raw.Event
  
  var localcandidate: RTCIceGathererEvent
}
object RTCIceGathererEventMap {
  
  @scala.inline
  def apply(error: org.scalajs.dom.raw.Event, localcandidate: RTCIceGathererEvent): RTCIceGathererEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], localcandidate = localcandidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceGathererEventMap]
  }
  
  @scala.inline
  implicit class RTCIceGathererEventMapMutableBuilder[Self <: RTCIceGathererEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalcandidate(value: RTCIceGathererEvent): Self = StObject.set(x, "localcandidate", value.asInstanceOf[js.Any])
  }
}
