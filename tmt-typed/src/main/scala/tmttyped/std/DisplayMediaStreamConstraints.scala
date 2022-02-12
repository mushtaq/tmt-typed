package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayMediaStreamConstraints extends StObject {
  
  /* standard DOM */
  var audio: js.UndefOr[scala.Boolean | org.scalajs.dom.MediaTrackConstraints] = js.undefined
  
  /* standard DOM */
  var video: js.UndefOr[scala.Boolean | org.scalajs.dom.MediaTrackConstraints] = js.undefined
}
object DisplayMediaStreamConstraints {
  
  @scala.inline
  def apply(): DisplayMediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayMediaStreamConstraints]
  }
  
  @scala.inline
  implicit class DisplayMediaStreamConstraintsMutableBuilder[Self <: DisplayMediaStreamConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: scala.Boolean | org.scalajs.dom.MediaTrackConstraints): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setVideo(value: scala.Boolean | org.scalajs.dom.MediaTrackConstraints): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
