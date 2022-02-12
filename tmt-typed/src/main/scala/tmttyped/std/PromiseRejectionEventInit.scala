package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromiseRejectionEventInit
  extends StObject
     with EventInit {
  
  /* standard DOM */
  var promise: js.Promise[Any]
  
  /* standard DOM */
  var reason: js.UndefOr[Any] = js.undefined
}
object PromiseRejectionEventInit {
  
  @scala.inline
  def apply(promise: js.Promise[Any]): PromiseRejectionEventInit = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseRejectionEventInit]
  }
  
  @scala.inline
  implicit class PromiseRejectionEventInitMutableBuilder[Self <: PromiseRejectionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromise(value: js.Promise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
