package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTarget extends StObject {
  
  var EventTarget: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  
  var onmessage: Any
}
object EventTarget {
  
  inline def apply(
    EventTarget: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any,
    onmessage: Any
  ): EventTarget = {
    val __obj = js.Dynamic.literal(EventTarget = EventTarget.asInstanceOf[js.Any], onmessage = onmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTarget]
  }
  
  extension [Self <: EventTarget](x: Self) {
    
    inline def setEventTarget(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "EventTarget", value.asInstanceOf[js.Any])
    
    inline def setOnmessage(value: Any): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
  }
}
