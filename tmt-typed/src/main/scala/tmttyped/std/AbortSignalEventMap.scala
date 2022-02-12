package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortSignalEventMap extends StObject {
  
  /* standard DOM */
  var abort: org.scalajs.dom.Event
}
object AbortSignalEventMap {
  
  @scala.inline
  def apply(abort: org.scalajs.dom.Event): AbortSignalEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortSignalEventMap]
  }
  
  @scala.inline
  implicit class AbortSignalEventMapMutableBuilder[Self <: AbortSignalEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: org.scalajs.dom.Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
  }
}
