package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCInboundRtpStreamStats
  extends StObject
     with RTCReceivedRtpStreamStats {
  
  /* standard DOM */
  var firCount: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var framesDecoded: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var nackCount: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var pliCount: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var qpSum: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var remoteId: js.UndefOr[java.lang.String] = js.undefined
}
object RTCInboundRtpStreamStats {
  
  @scala.inline
  def apply(
    id: java.lang.String,
    kind: java.lang.String,
    ssrc: Double,
    timestamp: DOMHighResTimeStamp,
    `type`: org.scalajs.dom.RTCStatsType
  ): RTCInboundRtpStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCInboundRtpStreamStats]
  }
  
  @scala.inline
  implicit class RTCInboundRtpStreamStatsMutableBuilder[Self <: RTCInboundRtpStreamStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirCount(value: Double): Self = StObject.set(x, "firCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirCountUndefined: Self = StObject.set(x, "firCount", js.undefined)
    
    @scala.inline
    def setFramesDecoded(value: Double): Self = StObject.set(x, "framesDecoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesDecodedUndefined: Self = StObject.set(x, "framesDecoded", js.undefined)
    
    @scala.inline
    def setNackCount(value: Double): Self = StObject.set(x, "nackCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNackCountUndefined: Self = StObject.set(x, "nackCount", js.undefined)
    
    @scala.inline
    def setPliCount(value: Double): Self = StObject.set(x, "pliCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPliCountUndefined: Self = StObject.set(x, "pliCount", js.undefined)
    
    @scala.inline
    def setQpSum(value: Double): Self = StObject.set(x, "qpSum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQpSumUndefined: Self = StObject.set(x, "qpSum", js.undefined)
    
    @scala.inline
    def setRemoteId(value: java.lang.String): Self = StObject.set(x, "remoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIdUndefined: Self = StObject.set(x, "remoteId", js.undefined)
  }
}
