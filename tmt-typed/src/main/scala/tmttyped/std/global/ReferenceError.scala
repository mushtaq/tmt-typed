package tmttyped.std.global

import tmttyped.std.ReferenceErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ReferenceError")
@js.native
/* standard es5 */
class ReferenceError ()
  extends StObject
     with tmttyped.std.Error {
  def this(message: java.lang.String) = this()
  
  /* standard es5 */
  /* CompleteClass */
  override var message: java.lang.String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  override var name: java.lang.String = js.native
}
object ReferenceError {
  
  @scala.inline
  def apply: ReferenceErrorConstructor = js.Dynamic.global.selectDynamic("ReferenceError").asInstanceOf[ReferenceErrorConstructor]
}
