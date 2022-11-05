package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecoder extends StObject {
  
  var TextDecoder: /* import warning: importer.ImportType#apply Failed type conversion: infer TextDecoder */ js.Any
  
  var onmessage: Any
}
object TextDecoder {
  
  inline def apply(
    TextDecoder: /* import warning: importer.ImportType#apply Failed type conversion: infer TextDecoder */ js.Any,
    onmessage: Any
  ): TextDecoder = {
    val __obj = js.Dynamic.literal(TextDecoder = TextDecoder.asInstanceOf[js.Any], onmessage = onmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoder]
  }
  
  extension [Self <: TextDecoder](x: Self) {
    
    inline def setOnmessage(value: Any): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
    
    inline def setTextDecoder(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer TextDecoder */ js.Any
    ): Self = StObject.set(x, "TextDecoder", value.asInstanceOf[js.Any])
  }
}
