package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBTransactionEventMap extends StObject {
  
  /* standard DOM */
  var abort: org.scalajs.dom.Event
  
  /* standard DOM */
  var complete: org.scalajs.dom.Event
  
  /* standard DOM */
  var error: org.scalajs.dom.Event
}
object IDBTransactionEventMap {
  
  @scala.inline
  def apply(abort: org.scalajs.dom.Event, complete: org.scalajs.dom.Event, error: org.scalajs.dom.Event): IDBTransactionEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBTransactionEventMap]
  }
  
  @scala.inline
  implicit class IDBTransactionEventMapMutableBuilder[Self <: IDBTransactionEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: org.scalajs.dom.Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: org.scalajs.dom.Event): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
