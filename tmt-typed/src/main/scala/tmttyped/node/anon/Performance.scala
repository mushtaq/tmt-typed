package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Performance extends StObject {
  
  var onmessage: Any
  
  var performance: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}
object Performance {
  
  inline def apply(
    onmessage: Any,
    performance: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ): Performance = {
    val __obj = js.Dynamic.literal(onmessage = onmessage.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Performance]
  }
  
  extension [Self <: Performance](x: Self) {
    
    inline def setOnmessage(value: Any): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
    
    inline def setPerformance(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
  }
}
