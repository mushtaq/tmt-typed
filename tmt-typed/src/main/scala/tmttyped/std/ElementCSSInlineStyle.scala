package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementCSSInlineStyle extends StObject {
  
  /* standard DOM */
  val style: org.scalajs.dom.CSSStyleDeclaration
}
object ElementCSSInlineStyle {
  
  inline def apply(style: org.scalajs.dom.CSSStyleDeclaration): ElementCSSInlineStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCSSInlineStyle]
  }
  
  extension [Self <: ElementCSSInlineStyle](x: Self) {
    
    inline def setStyle(value: org.scalajs.dom.CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
