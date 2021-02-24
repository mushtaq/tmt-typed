package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCOutboundRTPStreamStats extends RTCRTPStreamStats {
  
  var bytesSent: js.UndefOr[Double] = js.undefined
  
  var packetsSent: js.UndefOr[Double] = js.undefined
  
  var roundTripTime: js.UndefOr[Double] = js.undefined
  
  var targetBitrate: js.UndefOr[Double] = js.undefined
}
object RTCOutboundRTPStreamStats {
  
  @scala.inline
  def apply(): RTCOutboundRTPStreamStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOutboundRTPStreamStats]
  }
  
  @scala.inline
  implicit class RTCOutboundRTPStreamStatsMutableBuilder[Self <: RTCOutboundRTPStreamStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    @scala.inline
    def setPacketsSent(value: Double): Self = StObject.set(x, "packetsSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsSentUndefined: Self = StObject.set(x, "packetsSent", js.undefined)
    
    @scala.inline
    def setRoundTripTime(value: Double): Self = StObject.set(x, "roundTripTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundTripTimeUndefined: Self = StObject.set(x, "roundTripTime", js.undefined)
    
    @scala.inline
    def setTargetBitrate(value: Double): Self = StObject.set(x, "targetBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBitrateUndefined: Self = StObject.set(x, "targetBitrate", js.undefined)
  }
}
