package tmttyped.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - tmttyped.node.streamWebMod.ReadableStreamDefaultReadValueResult[T]
  - tmttyped.node.streamWebMod.ReadableStreamDefaultReadDoneResult
*/
trait ReadableStreamDefaultReadResult[T] extends StObject
object ReadableStreamDefaultReadResult {
  
  @scala.inline
  def ReadableStreamDefaultReadDoneResult(value: Unit): tmttyped.node.streamWebMod.ReadableStreamDefaultReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.streamWebMod.ReadableStreamDefaultReadDoneResult]
  }
  
  @scala.inline
  def ReadableStreamDefaultReadValueResult[T](value: T): tmttyped.node.streamWebMod.ReadableStreamDefaultReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.node.streamWebMod.ReadableStreamDefaultReadValueResult[T]]
  }
}
