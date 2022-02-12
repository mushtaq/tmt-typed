package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowRootInit extends StObject {
  
  /* standard DOM */
  var delegatesFocus: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var mode: ShadowRootMode
  
  /* standard DOM */
  var slotAssignment: js.UndefOr[SlotAssignmentMode] = js.undefined
}
object ShadowRootInit {
  
  @scala.inline
  def apply(mode: ShadowRootMode): ShadowRootInit = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootInit]
  }
  
  @scala.inline
  implicit class ShadowRootInitMutableBuilder[Self <: ShadowRootInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegatesFocus(value: scala.Boolean): Self = StObject.set(x, "delegatesFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatesFocusUndefined: Self = StObject.set(x, "delegatesFocus", js.undefined)
    
    @scala.inline
    def setMode(value: ShadowRootMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotAssignment(value: SlotAssignmentMode): Self = StObject.set(x, "slotAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotAssignmentUndefined: Self = StObject.set(x, "slotAssignment", js.undefined)
  }
}
