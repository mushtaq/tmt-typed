package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaRecorderEventMap extends StObject {
  
  /* standard DOM */
  var dataavailable: BlobEvent
  
  /* standard DOM */
  var error: MediaRecorderErrorEvent
  
  /* standard DOM */
  var pause: org.scalajs.dom.Event
  
  /* standard DOM */
  var resume: org.scalajs.dom.Event
  
  /* standard DOM */
  var start: org.scalajs.dom.Event
  
  /* standard DOM */
  var stop: org.scalajs.dom.Event
}
object MediaRecorderEventMap {
  
  @scala.inline
  def apply(
    dataavailable: BlobEvent,
    error: MediaRecorderErrorEvent,
    pause: org.scalajs.dom.Event,
    resume: org.scalajs.dom.Event,
    start: org.scalajs.dom.Event,
    stop: org.scalajs.dom.Event
  ): MediaRecorderEventMap = {
    val __obj = js.Dynamic.literal(dataavailable = dataavailable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderEventMap]
  }
  
  @scala.inline
  implicit class MediaRecorderEventMapMutableBuilder[Self <: MediaRecorderEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataavailable(value: BlobEvent): Self = StObject.set(x, "dataavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: MediaRecorderErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: org.scalajs.dom.Event): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: org.scalajs.dom.Event): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: org.scalajs.dom.Event): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: org.scalajs.dom.Event): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
