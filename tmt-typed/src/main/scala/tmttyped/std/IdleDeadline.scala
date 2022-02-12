package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleDeadline extends StObject {
  
  /* standard DOM */
  val didTimeout: scala.Boolean
  
  /* standard DOM */
  def timeRemaining(): DOMHighResTimeStamp
}
object IdleDeadline {
  
  @scala.inline
  def apply(didTimeout: scala.Boolean, timeRemaining: () => DOMHighResTimeStamp): IdleDeadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout.asInstanceOf[js.Any], timeRemaining = js.Any.fromFunction0(timeRemaining))
    __obj.asInstanceOf[IdleDeadline]
  }
  
  @scala.inline
  implicit class IdleDeadlineMutableBuilder[Self <: IdleDeadline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDidTimeout(value: scala.Boolean): Self = StObject.set(x, "didTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRemaining(value: () => DOMHighResTimeStamp): Self = StObject.set(x, "timeRemaining", js.Any.fromFunction0(value))
  }
}
