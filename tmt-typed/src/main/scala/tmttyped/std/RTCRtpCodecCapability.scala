package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpCodecCapability extends StObject {
  
  /* standard DOM */
  var channels: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var clockRate: Double
  
  /* standard DOM */
  var mimeType: java.lang.String
  
  /* standard DOM */
  var sdpFmtpLine: js.UndefOr[java.lang.String] = js.undefined
}
object RTCRtpCodecCapability {
  
  @scala.inline
  def apply(clockRate: Double, mimeType: java.lang.String): RTCRtpCodecCapability = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecCapability]
  }
  
  @scala.inline
  implicit class RTCRtpCodecCapabilityMutableBuilder[Self <: RTCRtpCodecCapability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setClockRate(value: Double): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: java.lang.String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpFmtpLine(value: java.lang.String): Self = StObject.set(x, "sdpFmtpLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpFmtpLineUndefined: Self = StObject.set(x, "sdpFmtpLine", js.undefined)
  }
}
