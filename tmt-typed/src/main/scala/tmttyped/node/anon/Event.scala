package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var Event: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  
  var onmessage: Any
}
object Event {
  
  inline def apply(
    Event: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any,
    onmessage: Any
  ): Event = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], onmessage = onmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEvent(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setOnmessage(value: Any): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
  }
}
