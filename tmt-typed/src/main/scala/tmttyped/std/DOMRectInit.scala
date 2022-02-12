package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMRectInit extends StObject {
  
  /* standard DOM */
  var height: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var width: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var x: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var y: js.UndefOr[Double] = js.undefined
}
object DOMRectInit {
  
  @scala.inline
  def apply(): DOMRectInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMRectInit]
  }
  
  @scala.inline
  implicit class DOMRectInitMutableBuilder[Self <: DOMRectInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
