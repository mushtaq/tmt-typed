package tmttyped.node.anon

import tmttyped.node.cryptoMod.KeyFormat
import tmttyped.node.nodeStrings.pkcs1
import tmttyped.node.nodeStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format[PubF /* <: KeyFormat */] extends StObject {
  
  var format: PubF
  
  var `type`: pkcs1 | spki
}
object Format {
  
  inline def apply[PubF /* <: KeyFormat */](format: PubF, `type`: pkcs1 | spki): Format[PubF] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format[PubF]]
  }
  
  extension [Self <: Format[?], PubF /* <: KeyFormat */](x: Self & Format[PubF]) {
    
    inline def setFormat(value: PubF): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setType(value: pkcs1 | spki): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
