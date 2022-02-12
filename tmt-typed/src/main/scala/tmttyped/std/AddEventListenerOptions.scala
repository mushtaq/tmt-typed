package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// Window APIs
/////////////////////////////
trait AddEventListenerOptions
  extends StObject
     with EventListenerOptions {
  
  /* standard DOM */
  var once: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var passive: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var signal: js.UndefOr[org.scalajs.dom.AbortSignal] = js.undefined
}
object AddEventListenerOptions {
  
  @scala.inline
  def apply(): AddEventListenerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddEventListenerOptions]
  }
  
  @scala.inline
  implicit class AddEventListenerOptionsMutableBuilder[Self <: AddEventListenerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnce(value: scala.Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    @scala.inline
    def setPassive(value: scala.Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
    
    @scala.inline
    def setSignal(value: org.scalajs.dom.AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
