package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCStats extends StObject {
  
  /* standard DOM */
  var id: java.lang.String
  
  /* standard DOM */
  var timestamp: DOMHighResTimeStamp
  
  /* standard DOM */
  var `type`: org.scalajs.dom.RTCStatsType
}
object RTCStats {
  
  @scala.inline
  def apply(id: java.lang.String, timestamp: DOMHighResTimeStamp, `type`: org.scalajs.dom.RTCStatsType): RTCStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCStats]
  }
  
  @scala.inline
  implicit class RTCStatsMutableBuilder[Self <: RTCStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: org.scalajs.dom.RTCStatsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
