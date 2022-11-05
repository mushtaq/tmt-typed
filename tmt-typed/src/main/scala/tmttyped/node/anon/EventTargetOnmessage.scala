package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTargetOnmessage extends StObject {
  
  var EventTarget: Any
  
  var onmessage: Any
}
object EventTargetOnmessage {
  
  inline def apply(EventTarget: Any, onmessage: Any): EventTargetOnmessage = {
    val __obj = js.Dynamic.literal(EventTarget = EventTarget.asInstanceOf[js.Any], onmessage = onmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetOnmessage]
  }
  
  extension [Self <: EventTargetOnmessage](x: Self) {
    
    inline def setEventTarget(value: Any): Self = StObject.set(x, "EventTarget", value.asInstanceOf[js.Any])
    
    inline def setOnmessage(value: Any): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
  }
}
