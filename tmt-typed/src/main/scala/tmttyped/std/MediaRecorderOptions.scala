package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaRecorderOptions extends StObject {
  
  /* standard DOM */
  var audioBitsPerSecond: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var bitsPerSecond: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var videoBitsPerSecond: js.UndefOr[Double] = js.undefined
}
object MediaRecorderOptions {
  
  @scala.inline
  def apply(): MediaRecorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaRecorderOptions]
  }
  
  @scala.inline
  implicit class MediaRecorderOptionsMutableBuilder[Self <: MediaRecorderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioBitsPerSecond(value: Double): Self = StObject.set(x, "audioBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioBitsPerSecondUndefined: Self = StObject.set(x, "audioBitsPerSecond", js.undefined)
    
    @scala.inline
    def setBitsPerSecond(value: Double): Self = StObject.set(x, "bitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitsPerSecondUndefined: Self = StObject.set(x, "bitsPerSecond", js.undefined)
    
    @scala.inline
    def setMimeType(value: java.lang.String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setVideoBitsPerSecond(value: Double): Self = StObject.set(x, "videoBitsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoBitsPerSecondUndefined: Self = StObject.set(x, "videoBitsPerSecond", js.undefined)
  }
}
