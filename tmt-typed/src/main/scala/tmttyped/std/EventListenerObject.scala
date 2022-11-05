package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventListenerObject extends StObject {
  
  /* standard DOM */
  def handleEvent(`object`: org.scalajs.dom.Event): Unit
}
object EventListenerObject {
  
  inline def apply(handleEvent: org.scalajs.dom.Event => Unit): EventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[EventListenerObject]
  }
  
  extension [Self <: EventListenerObject](x: Self) {
    
    inline def setHandleEvent(value: org.scalajs.dom.Event => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
  }
}
