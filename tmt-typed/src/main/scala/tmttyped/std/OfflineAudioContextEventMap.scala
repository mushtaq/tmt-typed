package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineAudioContextEventMap
  extends StObject
     with BaseAudioContextEventMap {
  
  /* standard DOM */
  var complete: org.scalajs.dom.OfflineAudioCompletionEvent
}
object OfflineAudioContextEventMap {
  
  @scala.inline
  def apply(complete: org.scalajs.dom.OfflineAudioCompletionEvent, statechange: org.scalajs.dom.Event): OfflineAudioContextEventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioContextEventMap]
  }
  
  @scala.inline
  implicit class OfflineAudioContextEventMapMutableBuilder[Self <: OfflineAudioContextEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: org.scalajs.dom.OfflineAudioCompletionEvent): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
  }
}
