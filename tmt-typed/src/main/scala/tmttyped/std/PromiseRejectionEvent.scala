package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseRejectionEvent
  extends StObject
     with Event {
  
  /* standard DOM */
  val promise: js.Promise[Any] = js.native
  
  /* standard DOM */
  val reason: Any = js.native
}
