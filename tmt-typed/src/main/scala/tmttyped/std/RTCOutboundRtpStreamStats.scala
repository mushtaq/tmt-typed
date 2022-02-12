package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCOutboundRtpStreamStats
  extends StObject
     with RTCSentRtpStreamStats {
  
  /* standard DOM */
  var firCount: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var framesEncoded: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var nackCount: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var pliCount: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var qpSum: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var remoteId: js.UndefOr[java.lang.String] = js.undefined
}
object RTCOutboundRtpStreamStats {
  
  @scala.inline
  def apply(
    id: java.lang.String,
    kind: java.lang.String,
    ssrc: Double,
    timestamp: DOMHighResTimeStamp,
    `type`: org.scalajs.dom.RTCStatsType
  ): RTCOutboundRtpStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOutboundRtpStreamStats]
  }
  
  @scala.inline
  implicit class RTCOutboundRtpStreamStatsMutableBuilder[Self <: RTCOutboundRtpStreamStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirCount(value: Double): Self = StObject.set(x, "firCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirCountUndefined: Self = StObject.set(x, "firCount", js.undefined)
    
    @scala.inline
    def setFramesEncoded(value: Double): Self = StObject.set(x, "framesEncoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesEncodedUndefined: Self = StObject.set(x, "framesEncoded", js.undefined)
    
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
