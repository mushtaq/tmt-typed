package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGURIReference extends StObject {
  
  val href: org.scalajs.dom.raw.SVGAnimatedString
}
object SVGURIReference {
  
  @scala.inline
  def apply(href: org.scalajs.dom.raw.SVGAnimatedString): SVGURIReference = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGURIReference]
  }
  
  @scala.inline
  implicit class SVGURIReferenceMutableBuilder[Self <: SVGURIReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: org.scalajs.dom.raw.SVGAnimatedString): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}
