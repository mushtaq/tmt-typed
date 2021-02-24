package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCStats extends StObject {
  
  var id: js.UndefOr[java.lang.String] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[org.scalajs.dom.experimental.webrtc.RTCStatsType] = js.undefined
}
object RTCStats {
  
  @scala.inline
  def apply(): org.scalajs.dom.experimental.webrtc.RTCStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.experimental.webrtc.RTCStats]
  }
  
  @scala.inline
  implicit class RTCStatsMutableBuilder[Self <: org.scalajs.dom.experimental.webrtc.RTCStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setType(value: org.scalajs.dom.experimental.webrtc.RTCStatsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
