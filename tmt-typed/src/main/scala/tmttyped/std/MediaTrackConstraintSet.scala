package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackConstraintSet extends StObject {
  
  /* standard DOM */
  var aspectRatio: js.UndefOr[ConstrainDouble] = js.undefined
  
  /* standard DOM */
  var autoGainControl: js.UndefOr[ConstrainBoolean] = js.undefined
  
  /* standard DOM */
  var channelCount: js.UndefOr[ConstrainULong] = js.undefined
  
  /* standard DOM */
  var deviceId: js.UndefOr[ConstrainDOMString] = js.undefined
  
  /* standard DOM */
  var echoCancellation: js.UndefOr[ConstrainBoolean] = js.undefined
  
  /* standard DOM */
  var facingMode: js.UndefOr[ConstrainDOMString] = js.undefined
  
  /* standard DOM */
  var frameRate: js.UndefOr[ConstrainDouble] = js.undefined
  
  /* standard DOM */
  var groupId: js.UndefOr[ConstrainDOMString] = js.undefined
  
  /* standard DOM */
  var height: js.UndefOr[ConstrainULong] = js.undefined
  
  /* standard DOM */
  var latency: js.UndefOr[ConstrainDouble] = js.undefined
  
  /* standard DOM */
  var noiseSuppression: js.UndefOr[ConstrainBoolean] = js.undefined
  
  /* standard DOM */
  var sampleRate: js.UndefOr[ConstrainULong] = js.undefined
  
  /* standard DOM */
  var sampleSize: js.UndefOr[ConstrainULong] = js.undefined
  
  /* standard DOM */
  var suppressLocalAudioPlayback: js.UndefOr[ConstrainBoolean] = js.undefined
  
  /* standard DOM */
  var width: js.UndefOr[ConstrainULong] = js.undefined
}
object MediaTrackConstraintSet {
  
  inline def apply(): MediaTrackConstraintSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraintSet]
  }
  
  extension [Self <: MediaTrackConstraintSet](x: Self) {
    
    inline def setAspectRatio(value: ConstrainDouble): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setAutoGainControl(value: ConstrainBoolean): Self = StObject.set(x, "autoGainControl", value.asInstanceOf[js.Any])
    
    inline def setAutoGainControlUndefined: Self = StObject.set(x, "autoGainControl", js.undefined)
    
    inline def setChannelCount(value: ConstrainULong): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    inline def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    inline def setDeviceId(value: ConstrainDOMString): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceIdVarargs(value: java.lang.String*): Self = StObject.set(x, "deviceId", js.Array(value*))
    
    inline def setEchoCancellation(value: ConstrainBoolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
    
    inline def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
    
    inline def setFacingMode(value: ConstrainDOMString): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    inline def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    inline def setFacingModeVarargs(value: java.lang.String*): Self = StObject.set(x, "facingMode", js.Array(value*))
    
    inline def setFrameRate(value: ConstrainDouble): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setGroupId(value: ConstrainDOMString): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setGroupIdVarargs(value: java.lang.String*): Self = StObject.set(x, "groupId", js.Array(value*))
    
    inline def setHeight(value: ConstrainULong): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLatency(value: ConstrainDouble): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    inline def setNoiseSuppression(value: ConstrainBoolean): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
    
    inline def setNoiseSuppressionUndefined: Self = StObject.set(x, "noiseSuppression", js.undefined)
    
    inline def setSampleRate(value: ConstrainULong): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    inline def setSampleSize(value: ConstrainULong): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    inline def setSuppressLocalAudioPlayback(value: ConstrainBoolean): Self = StObject.set(x, "suppressLocalAudioPlayback", value.asInstanceOf[js.Any])
    
    inline def setSuppressLocalAudioPlaybackUndefined: Self = StObject.set(x, "suppressLocalAudioPlayback", js.undefined)
    
    inline def setWidth(value: ConstrainULong): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
