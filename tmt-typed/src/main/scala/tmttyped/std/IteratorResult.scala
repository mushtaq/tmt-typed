package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - tmttyped.std.IteratorYieldResult[T]
  - tmttyped.std.IteratorReturnResult[TReturn]
*/
trait IteratorResult[T, TReturn] extends StObject
object IteratorResult {
  
  inline def IteratorReturnResult[TReturn](value: TReturn): tmttyped.std.IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.IteratorReturnResult[TReturn]]
  }
  
  inline def IteratorYieldResult[T](value: T): tmttyped.std.IteratorYieldResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.IteratorYieldResult[T]]
  }
}
