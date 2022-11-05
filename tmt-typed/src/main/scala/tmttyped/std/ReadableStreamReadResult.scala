package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - tmttyped.std.ReadableStreamReadValueResult[T]
  - tmttyped.std.ReadableStreamReadDoneResult
*/
trait ReadableStreamReadResult[T] extends StObject
object ReadableStreamReadResult {
  
  inline def ReadableStreamReadDoneResult(value: Unit): tmttyped.std.ReadableStreamReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.ReadableStreamReadDoneResult]
  }
  
  inline def ReadableStreamReadValueResult[T](value: T): tmttyped.std.ReadableStreamReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.ReadableStreamReadValueResult[T]]
  }
}
