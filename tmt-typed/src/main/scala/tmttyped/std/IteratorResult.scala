package tmttyped.std

import tmttyped.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - tmttyped.std.IteratorYieldResult[T]
  - tmttyped.std.IteratorReturnResult[TReturn]
*/
trait IteratorResult[T, TReturn] extends StObject
object IteratorResult {
  
  @scala.inline
  def IteratorReturnResult[TReturn](done: `true`, value: TReturn): tmttyped.std.IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.IteratorReturnResult[TReturn]]
  }
  
  @scala.inline
  def IteratorYieldResult[T](value: T): tmttyped.std.IteratorYieldResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.IteratorYieldResult[T]]
  }
}
