package tmttyped.node.anon

import tmttyped.node.nodeBooleans.`false`
import tmttyped.node.nodeStrings.buffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoding extends StObject {
  
  var encoding: buffer_
  
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}
object Encoding {
  
  inline def apply(): Encoding = {
    val __obj = js.Dynamic.literal(encoding = "buffer")
    __obj.asInstanceOf[Encoding]
  }
  
  extension [Self <: Encoding](x: Self) {
    
    inline def setEncoding(value: buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
