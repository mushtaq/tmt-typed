package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Onmessage extends StObject {
  
  var Event: Any
  
  var onmessage: Any
}
object Onmessage {
  
  inline def apply(Event: Any, onmessage: Any): Onmessage = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], onmessage = onmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Onmessage]
  }
  
  extension [Self <: Onmessage](x: Self) {
    
    inline def setEvent(value: Any): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setOnmessage(value: Any): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
  }
}
