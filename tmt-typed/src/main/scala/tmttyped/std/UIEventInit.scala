package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIEventInit
  extends StObject
     with EventInit {
  
  /* standard DOM */
  var detail: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var view: js.UndefOr[org.scalajs.dom.Window | Null] = js.undefined
  
  /** @deprecated */
  /* standard DOM */
  var which: js.UndefOr[Double] = js.undefined
}
object UIEventInit {
  
  @scala.inline
  def apply(): UIEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIEventInit]
  }
  
  @scala.inline
  implicit class UIEventInitMutableBuilder[Self <: UIEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setView(value: org.scalajs.dom.Window): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewNull: Self = StObject.set(x, "view", null)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhichUndefined: Self = StObject.set(x, "which", js.undefined)
  }
}
