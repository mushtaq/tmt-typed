package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGAnimatedNumber interface is used for attributes which take a list of numbers and which can be animated. */
trait SVGAnimatedNumberList extends StObject {
  
  /* standard DOM */
  val animVal: org.scalajs.dom.SVGNumberList
  
  /* standard DOM */
  val baseVal: org.scalajs.dom.SVGNumberList
}
object SVGAnimatedNumberList {
  
  inline def apply(animVal: org.scalajs.dom.SVGNumberList, baseVal: org.scalajs.dom.SVGNumberList): SVGAnimatedNumberList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedNumberList]
  }
  
  extension [Self <: SVGAnimatedNumberList](x: Self) {
    
    inline def setAnimVal(value: org.scalajs.dom.SVGNumberList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: org.scalajs.dom.SVGNumberList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
