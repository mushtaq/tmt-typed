package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementEventMap extends StObject {
  
  /* standard DOM */
  var fullscreenchange: org.scalajs.dom.Event
  
  /* standard DOM */
  var fullscreenerror: org.scalajs.dom.Event
}
object ElementEventMap {
  
  @scala.inline
  def apply(fullscreenchange: org.scalajs.dom.Event, fullscreenerror: org.scalajs.dom.Event): ElementEventMap = {
    val __obj = js.Dynamic.literal(fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementEventMap]
  }
  
  @scala.inline
  implicit class ElementEventMapMutableBuilder[Self <: ElementEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullscreenchange(value: org.scalajs.dom.Event): Self = StObject.set(x, "fullscreenchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenerror(value: org.scalajs.dom.Event): Self = StObject.set(x, "fullscreenerror", value.asInstanceOf[js.Any])
  }
}
