package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMQuad extends StObject {
  
  /* standard DOM */
  def getBounds(): org.scalajs.dom.DOMRect
  
  /* standard DOM */
  val p1: DOMPoint
  
  /* standard DOM */
  val p2: DOMPoint
  
  /* standard DOM */
  val p3: DOMPoint
  
  /* standard DOM */
  val p4: DOMPoint
  
  /* standard DOM */
  def toJSON(): Any
}
object DOMQuad {
  
  inline def apply(
    getBounds: () => org.scalajs.dom.DOMRect,
    p1: DOMPoint,
    p2: DOMPoint,
    p3: DOMPoint,
    p4: DOMPoint,
    toJSON: () => Any
  ): DOMQuad = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any], p4 = p4.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[DOMQuad]
  }
  
  extension [Self <: DOMQuad](x: Self) {
    
    inline def setGetBounds(value: () => org.scalajs.dom.DOMRect): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    inline def setP1(value: DOMPoint): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
    
    inline def setP2(value: DOMPoint): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
    
    inline def setP3(value: DOMPoint): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
    
    inline def setP4(value: DOMPoint): Self = StObject.set(x, "p4", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
