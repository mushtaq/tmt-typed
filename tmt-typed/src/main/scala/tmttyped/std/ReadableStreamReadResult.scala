package tmttyped.std

import tmttyped.std.stdBooleans.`false`
import tmttyped.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - tmttyped.std.ReadableStreamReadValueResult[T]
  - tmttyped.std.ReadableStreamReadDoneResult[T]
*/
trait ReadableStreamReadResult[T] extends StObject
object ReadableStreamReadResult {
  
  @scala.inline
  def ReadableStreamReadDoneResult[T](done: `true`): tmttyped.std.ReadableStreamReadDoneResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.ReadableStreamReadDoneResult[T]]
  }
  
  @scala.inline
  def ReadableStreamReadValueResult[T](done: `false`, value: T): tmttyped.std.ReadableStreamReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.ReadableStreamReadValueResult[T]]
  }
}
