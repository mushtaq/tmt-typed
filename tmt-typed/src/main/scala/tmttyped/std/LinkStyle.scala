package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkStyle extends StObject {
  
  /* standard DOM */
  val sheet: org.scalajs.dom.CSSStyleSheet | Null
}
object LinkStyle {
  
  @scala.inline
  def apply(): LinkStyle = {
    val __obj = js.Dynamic.literal(sheet = null)
    __obj.asInstanceOf[LinkStyle]
  }
  
  @scala.inline
  implicit class LinkStyleMutableBuilder[Self <: LinkStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSheet(value: org.scalajs.dom.CSSStyleSheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetNull: Self = StObject.set(x, "sheet", null)
  }
}
