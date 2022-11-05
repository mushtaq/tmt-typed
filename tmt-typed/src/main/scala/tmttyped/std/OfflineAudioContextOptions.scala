package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineAudioContextOptions extends StObject {
  
  /* standard DOM */
  var length: Double
  
  /* standard DOM */
  var numberOfChannels: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var sampleRate: Double
}
object OfflineAudioContextOptions {
  
  inline def apply(length: Double, sampleRate: Double): OfflineAudioContextOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioContextOptions]
  }
  
  extension [Self <: OfflineAudioContextOptions](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNumberOfChannels(value: Double): Self = StObject.set(x, "numberOfChannels", value.asInstanceOf[js.Any])
    
    inline def setNumberOfChannelsUndefined: Self = StObject.set(x, "numberOfChannels", js.undefined)
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
  }
}
