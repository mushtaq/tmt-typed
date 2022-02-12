package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentAndElementEventHandlersEventMap extends StObject {
  
  /* standard DOM */
  var copy: org.scalajs.dom.ClipboardEvent
  
  /* standard DOM */
  var cut: org.scalajs.dom.ClipboardEvent
  
  /* standard DOM */
  var paste: org.scalajs.dom.ClipboardEvent
}
object DocumentAndElementEventHandlersEventMap {
  
  @scala.inline
  def apply(
    copy: org.scalajs.dom.ClipboardEvent,
    cut: org.scalajs.dom.ClipboardEvent,
    paste: org.scalajs.dom.ClipboardEvent
  ): DocumentAndElementEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAndElementEventHandlersEventMap]
  }
  
  @scala.inline
  implicit class DocumentAndElementEventHandlersEventMapMutableBuilder[Self <: DocumentAndElementEventHandlersEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: org.scalajs.dom.ClipboardEvent): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCut(value: org.scalajs.dom.ClipboardEvent): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaste(value: org.scalajs.dom.ClipboardEvent): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
  }
}
