package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortSignal extends StObject {
  
  var AbortSignal: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  
  var onmessage: Any
}
object AbortSignal {
  
  inline def apply(
    AbortSignal: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any,
    onmessage: Any
  ): AbortSignal = {
    val __obj = js.Dynamic.literal(AbortSignal = AbortSignal.asInstanceOf[js.Any], onmessage = onmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortSignal]
  }
  
  extension [Self <: AbortSignal](x: Self) {
    
    inline def setAbortSignal(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "AbortSignal", value.asInstanceOf[js.Any])
    
    inline def setOnmessage(value: Any): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
  }
}
