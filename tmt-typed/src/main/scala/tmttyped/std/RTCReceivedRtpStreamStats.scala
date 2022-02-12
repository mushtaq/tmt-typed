package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCReceivedRtpStreamStats
  extends StObject
     with RTCRtpStreamStats {
  
  /* standard DOM */
  var jitter: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var packetsDiscarded: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var packetsLost: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var packetsReceived: js.UndefOr[Double] = js.undefined
}
object RTCReceivedRtpStreamStats {
  
  @scala.inline
  def apply(
    id: java.lang.String,
    kind: java.lang.String,
    ssrc: Double,
    timestamp: DOMHighResTimeStamp,
    `type`: org.scalajs.dom.RTCStatsType
  ): RTCReceivedRtpStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCReceivedRtpStreamStats]
  }
  
  @scala.inline
  implicit class RTCReceivedRtpStreamStatsMutableBuilder[Self <: RTCReceivedRtpStreamStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
    
    @scala.inline
    def setPacketsDiscarded(value: Double): Self = StObject.set(x, "packetsDiscarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsDiscardedUndefined: Self = StObject.set(x, "packetsDiscarded", js.undefined)
    
    @scala.inline
    def setPacketsLost(value: Double): Self = StObject.set(x, "packetsLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsLostUndefined: Self = StObject.set(x, "packetsLost", js.undefined)
    
    @scala.inline
    def setPacketsReceived(value: Double): Self = StObject.set(x, "packetsReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsReceivedUndefined: Self = StObject.set(x, "packetsReceived", js.undefined)
  }
}
