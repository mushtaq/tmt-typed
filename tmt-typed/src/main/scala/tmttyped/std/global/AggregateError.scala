package tmttyped.std.global

import tmttyped.std.AggregateErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AggregateError")
@js.native
class AggregateError protected ()
  extends StObject
     with tmttyped.std.AggregateError {
  def this(errors: js.Iterable[js.Any]) = this()
  def this(errors: js.Iterable[js.Any], message: java.lang.String) = this()
  
  /* CompleteClass */
  override var errors: js.Array[js.Any] = js.native
  
  /* CompleteClass */
  override var message: java.lang.String = js.native
  
  /* CompleteClass */
  override var name: java.lang.String = js.native
}
object AggregateError {
  
  @scala.inline
  def apply: AggregateErrorConstructor = js.Dynamic.global.selectDynamic("AggregateError").asInstanceOf[AggregateErrorConstructor]
}
