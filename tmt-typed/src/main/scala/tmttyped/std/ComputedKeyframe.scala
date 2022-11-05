package tmttyped.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedKeyframe
  extends StObject
     with /* standard DOM */
/* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] {
  
  /* standard DOM */
  var composite: CompositeOperationOrAuto
  
  /* standard DOM */
  var computedOffset: Double
  
  /* standard DOM */
  var easing: java.lang.String
  
  /* standard DOM */
  var offset: Double | Null
}
object ComputedKeyframe {
  
  inline def apply(composite: CompositeOperationOrAuto, computedOffset: Double, easing: java.lang.String): ComputedKeyframe = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], computedOffset = computedOffset.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], offset = null)
    __obj.asInstanceOf[ComputedKeyframe]
  }
  
  extension [Self <: ComputedKeyframe](x: Self) {
    
    inline def setComposite(value: CompositeOperationOrAuto): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    inline def setComputedOffset(value: Double): Self = StObject.set(x, "computedOffset", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: java.lang.String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
  }
}
