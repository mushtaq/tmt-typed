package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEncoder extends StObject {
  
  var TextEncoder: /* import warning: importer.ImportType#apply Failed type conversion: infer TextEncoder */ js.Any
  
  var onmessage: Any
}
object TextEncoder {
  
  inline def apply(
    TextEncoder: /* import warning: importer.ImportType#apply Failed type conversion: infer TextEncoder */ js.Any,
    onmessage: Any
  ): TextEncoder = {
    val __obj = js.Dynamic.literal(TextEncoder = TextEncoder.asInstanceOf[js.Any], onmessage = onmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoder]
  }
  
  extension [Self <: TextEncoder](x: Self) {
    
    inline def setOnmessage(value: Any): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
    
    inline def setTextEncoder(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer TextEncoder */ js.Any
    ): Self = StObject.set(x, "TextEncoder", value.asInstanceOf[js.Any])
  }
}
