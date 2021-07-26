package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGFitToViewBox extends StObject {
  
  val preserveAspectRatio: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio
  
  val viewBox: org.scalajs.dom.raw.SVGAnimatedRect
}
object SVGFitToViewBox {
  
  @scala.inline
  def apply(
    preserveAspectRatio: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio,
    viewBox: org.scalajs.dom.raw.SVGAnimatedRect
  ): SVGFitToViewBox = {
    val __obj = js.Dynamic.literal(preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFitToViewBox]
  }
  
  @scala.inline
  implicit class SVGFitToViewBoxMutableBuilder[Self <: SVGFitToViewBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreserveAspectRatio(value: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBox(value: org.scalajs.dom.raw.SVGAnimatedRect): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
  }
}
