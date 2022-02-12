package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - tmttyped.std.PromiseFulfilledResult[T]
  - tmttyped.std.PromiseRejectedResult
*/
trait PromiseSettledResult[T] extends StObject
object PromiseSettledResult {
  
  @scala.inline
  def PromiseFulfilledResult[T](value: T): tmttyped.std.PromiseFulfilledResult[T] = {
    val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.PromiseFulfilledResult[T]]
  }
  
  @scala.inline
  def PromiseRejectedResult(reason: Any): tmttyped.std.PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
    __obj.asInstanceOf[tmttyped.std.PromiseRejectedResult]
  }
}
