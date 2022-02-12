package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeechSynthesisUtteranceEventMap extends StObject {
  
  /* standard DOM */
  var boundary: SpeechSynthesisEvent
  
  /* standard DOM */
  var end: SpeechSynthesisEvent
  
  /* standard DOM */
  var error: SpeechSynthesisErrorEvent
  
  /* standard DOM */
  var mark: SpeechSynthesisEvent
  
  /* standard DOM */
  var pause: SpeechSynthesisEvent
  
  /* standard DOM */
  var resume: SpeechSynthesisEvent
  
  /* standard DOM */
  var start: SpeechSynthesisEvent
}
object SpeechSynthesisUtteranceEventMap {
  
  @scala.inline
  def apply(
    boundary: SpeechSynthesisEvent,
    end: SpeechSynthesisEvent,
    error: SpeechSynthesisErrorEvent,
    mark: SpeechSynthesisEvent,
    pause: SpeechSynthesisEvent,
    resume: SpeechSynthesisEvent,
    start: SpeechSynthesisEvent
  ): SpeechSynthesisUtteranceEventMap = {
    val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisUtteranceEventMap]
  }
  
  @scala.inline
  implicit class SpeechSynthesisUtteranceEventMapMutableBuilder[Self <: SpeechSynthesisUtteranceEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundary(value: SpeechSynthesisEvent): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: SpeechSynthesisEvent): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: SpeechSynthesisErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMark(value: SpeechSynthesisEvent): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: SpeechSynthesisEvent): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: SpeechSynthesisEvent): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: SpeechSynthesisEvent): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
