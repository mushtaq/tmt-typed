package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasState extends StObject {
  
  /* standard DOM */
  def restore(): Unit
  
  /* standard DOM */
  def save(): Unit
}
object CanvasState {
  
  @scala.inline
  def apply(restore: () => Unit, save: () => Unit): CanvasState = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction0(restore), save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[CanvasState]
  }
  
  @scala.inline
  implicit class CanvasStateMutableBuilder[Self <: CanvasState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
  }
}
