package tmttyped.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyframe
  extends StObject
     with /* standard DOM */
/* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] {
  
  /* standard DOM */
  var composite: js.UndefOr[CompositeOperationOrAuto] = js.undefined
  
  /* standard DOM */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var offset: js.UndefOr[Double | Null] = js.undefined
}
object Keyframe {
  
  inline def apply(): Keyframe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Keyframe]
  }
  
  extension [Self <: Keyframe](x: Self) {
    
    inline def setComposite(value: CompositeOperationOrAuto): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
    
    inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    inline def setEasing(value: java.lang.String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
