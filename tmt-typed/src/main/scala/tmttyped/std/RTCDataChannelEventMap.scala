package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDataChannelEventMap extends StObject {
  
  /* standard DOM */
  var bufferedamountlow: org.scalajs.dom.Event
  
  /* standard DOM */
  var close: org.scalajs.dom.Event
  
  /* standard DOM */
  var error: org.scalajs.dom.Event
  
  /* standard DOM */
  var message: org.scalajs.dom.MessageEvent
  
  /* standard DOM */
  var open: org.scalajs.dom.Event
}
object RTCDataChannelEventMap {
  
  @scala.inline
  def apply(
    bufferedamountlow: org.scalajs.dom.Event,
    close: org.scalajs.dom.Event,
    error: org.scalajs.dom.Event,
    message: org.scalajs.dom.MessageEvent,
    open: org.scalajs.dom.Event
  ): RTCDataChannelEventMap = {
    val __obj = js.Dynamic.literal(bufferedamountlow = bufferedamountlow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventMap]
  }
  
  @scala.inline
  implicit class RTCDataChannelEventMapMutableBuilder[Self <: RTCDataChannelEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferedamountlow(value: org.scalajs.dom.Event): Self = StObject.set(x, "bufferedamountlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: org.scalajs.dom.Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: org.scalajs.dom.Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
