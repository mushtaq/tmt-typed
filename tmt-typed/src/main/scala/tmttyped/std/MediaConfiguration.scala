package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaConfiguration extends StObject {
  
  /* standard DOM */
  var audio: js.UndefOr[AudioConfiguration] = js.undefined
  
  /* standard DOM */
  var video: js.UndefOr[VideoConfiguration] = js.undefined
}
object MediaConfiguration {
  
  @scala.inline
  def apply(): MediaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaConfiguration]
  }
  
  @scala.inline
  implicit class MediaConfigurationMutableBuilder[Self <: MediaConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: AudioConfiguration): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setVideo(value: VideoConfiguration): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
