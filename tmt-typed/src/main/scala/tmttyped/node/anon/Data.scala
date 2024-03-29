package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.Array[Double]
  
  var `type`: tmttyped.node.nodeStrings.Buffer
}
object Data {
  
  inline def apply(data: js.Array[Double]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Buffer")
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setType(value: tmttyped.node.nodeStrings.Buffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
