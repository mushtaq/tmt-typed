package tmttyped.std

import tmttyped.std.stdBooleans.`false`
import tmttyped.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - tmttyped.std.ReadableStreamDefaultReadValueResult[T]
  - tmttyped.std.ReadableStreamDefaultReadDoneResult
*/
trait ReadableStreamDefaultReadResult[T] extends StObject
object ReadableStreamDefaultReadResult {
  
  @scala.inline
  def ReadableStreamDefaultReadDoneResult(done: `true`): tmttyped.std.ReadableStreamDefaultReadDoneResult = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.ReadableStreamDefaultReadDoneResult]
  }
  
  @scala.inline
  def ReadableStreamDefaultReadValueResult[T](done: `false`, value: T): tmttyped.std.ReadableStreamDefaultReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.ReadableStreamDefaultReadValueResult[T]]
  }
}
