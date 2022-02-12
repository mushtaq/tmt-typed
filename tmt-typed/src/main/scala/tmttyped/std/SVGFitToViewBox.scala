package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGFitToViewBox extends StObject {
  
  /* standard DOM */
  val preserveAspectRatio: org.scalajs.dom.SVGAnimatedPreserveAspectRatio
  
  /* standard DOM */
  val viewBox: org.scalajs.dom.SVGAnimatedRect
}
object SVGFitToViewBox {
  
  @scala.inline
  def apply(
    preserveAspectRatio: org.scalajs.dom.SVGAnimatedPreserveAspectRatio,
    viewBox: org.scalajs.dom.SVGAnimatedRect
  ): SVGFitToViewBox = {
    val __obj = js.Dynamic.literal(preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFitToViewBox]
  }
  
  @scala.inline
  implicit class SVGFitToViewBoxMutableBuilder[Self <: SVGFitToViewBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreserveAspectRatio(value: org.scalajs.dom.SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBox(value: org.scalajs.dom.SVGAnimatedRect): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
  }
}
