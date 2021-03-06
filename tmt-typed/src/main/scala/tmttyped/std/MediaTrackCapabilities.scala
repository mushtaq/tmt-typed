package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackCapabilities extends StObject {
  
  var aspectRatio: js.UndefOr[DoubleRange] = js.undefined
  
  var autoGainControl: js.UndefOr[js.Array[scala.Boolean]] = js.undefined
  
  var channelCount: js.UndefOr[ULongRange] = js.undefined
  
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  
  var echoCancellation: js.UndefOr[js.Array[scala.Boolean]] = js.undefined
  
  var facingMode: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var frameRate: js.UndefOr[DoubleRange] = js.undefined
  
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  
  var height: js.UndefOr[ULongRange] = js.undefined
  
  var latency: js.UndefOr[DoubleRange] = js.undefined
  
  var noiseSuppression: js.UndefOr[js.Array[scala.Boolean]] = js.undefined
  
  var resizeMode: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var sampleRate: js.UndefOr[ULongRange] = js.undefined
  
  var sampleSize: js.UndefOr[ULongRange] = js.undefined
  
  var width: js.UndefOr[ULongRange] = js.undefined
}
object MediaTrackCapabilities {
  
  @scala.inline
  def apply(): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
  
  @scala.inline
  implicit class MediaTrackCapabilitiesMutableBuilder[Self <: MediaTrackCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: DoubleRange): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setAutoGainControl(value: js.Array[scala.Boolean]): Self = StObject.set(x, "autoGainControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoGainControlUndefined: Self = StObject.set(x, "autoGainControl", js.undefined)
    
    @scala.inline
    def setAutoGainControlVarargs(value: scala.Boolean*): Self = StObject.set(x, "autoGainControl", js.Array(value :_*))
    
    @scala.inline
    def setChannelCount(value: ULongRange): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    @scala.inline
    def setDeviceId(value: java.lang.String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setEchoCancellation(value: js.Array[scala.Boolean]): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
    
    @scala.inline
    def setEchoCancellationVarargs(value: scala.Boolean*): Self = StObject.set(x, "echoCancellation", js.Array(value :_*))
    
    @scala.inline
    def setFacingMode(value: js.Array[java.lang.String]): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    @scala.inline
    def setFacingModeVarargs(value: java.lang.String*): Self = StObject.set(x, "facingMode", js.Array(value :_*))
    
    @scala.inline
    def setFrameRate(value: DoubleRange): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setGroupId(value: java.lang.String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setHeight(value: ULongRange): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLatency(value: DoubleRange): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    @scala.inline
    def setNoiseSuppression(value: js.Array[scala.Boolean]): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseSuppressionUndefined: Self = StObject.set(x, "noiseSuppression", js.undefined)
    
    @scala.inline
    def setNoiseSuppressionVarargs(value: scala.Boolean*): Self = StObject.set(x, "noiseSuppression", js.Array(value :_*))
    
    @scala.inline
    def setResizeMode(value: js.Array[java.lang.String]): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    @scala.inline
    def setResizeModeVarargs(value: java.lang.String*): Self = StObject.set(x, "resizeMode", js.Array(value :_*))
    
    @scala.inline
    def setSampleRate(value: ULongRange): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    @scala.inline
    def setSampleSize(value: ULongRange): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    @scala.inline
    def setWidth(value: ULongRange): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
