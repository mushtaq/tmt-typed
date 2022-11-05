package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blob extends StObject {
  
  var Blob: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  
  var onmessage: Any
}
object Blob {
  
  inline def apply(
    Blob: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any,
    onmessage: Any
  ): Blob = {
    val __obj = js.Dynamic.literal(Blob = Blob.asInstanceOf[js.Any], onmessage = onmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blob]
  }
  
  extension [Self <: Blob](x: Self) {
    
    inline def setBlob(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "Blob", value.asInstanceOf[js.Any])
    
    inline def setOnmessage(value: Any): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
  }
}
