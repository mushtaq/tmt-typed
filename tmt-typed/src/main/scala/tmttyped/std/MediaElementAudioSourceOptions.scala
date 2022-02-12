package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaElementAudioSourceOptions extends StObject {
  
  /* standard DOM */
  var mediaElement: org.scalajs.dom.HTMLMediaElement
}
object MediaElementAudioSourceOptions {
  
  @scala.inline
  def apply(mediaElement: org.scalajs.dom.HTMLMediaElement): MediaElementAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaElement = mediaElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaElementAudioSourceOptions]
  }
  
  @scala.inline
  implicit class MediaElementAudioSourceOptionsMutableBuilder[Self <: MediaElementAudioSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaElement(value: org.scalajs.dom.HTMLMediaElement): Self = StObject.set(x, "mediaElement", value.asInstanceOf[js.Any])
  }
}
