package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ULongRange extends StObject {
  
  /* standard DOM */
  var max: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var min: js.UndefOr[Double] = js.undefined
}
object ULongRange {
  
  inline def apply(): ULongRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ULongRange]
  }
  
  extension [Self <: ULongRange](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
