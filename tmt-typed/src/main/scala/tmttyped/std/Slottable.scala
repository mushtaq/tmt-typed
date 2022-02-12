package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slottable extends StObject {
  
  /* standard DOM */
  val assignedSlot: HTMLSlotElement | Null
}
object Slottable {
  
  @scala.inline
  def apply(): Slottable = {
    val __obj = js.Dynamic.literal(assignedSlot = null)
    __obj.asInstanceOf[Slottable]
  }
  
  @scala.inline
  implicit class SlottableMutableBuilder[Self <: Slottable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedSlot(value: HTMLSlotElement): Self = StObject.set(x, "assignedSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedSlotNull: Self = StObject.set(x, "assignedSlot", null)
  }
}
