package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusEventInit
  extends StObject
     with UIEventInit {
  
  /* standard DOM */
  var relatedTarget: js.UndefOr[org.scalajs.dom.EventTarget | Null] = js.undefined
}
object FocusEventInit {
  
  @scala.inline
  def apply(): FocusEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusEventInit]
  }
  
  @scala.inline
  implicit class FocusEventInitMutableBuilder[Self <: FocusEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelatedTarget(value: org.scalajs.dom.EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
    
    @scala.inline
    def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
  }
}
