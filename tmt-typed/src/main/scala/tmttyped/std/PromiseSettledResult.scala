package tmttyped.std

import tmttyped.std.stdStrings.fulfilled
import tmttyped.std.stdStrings.rejected
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
  def PromiseFulfilledResult[T](status: fulfilled, value: T): tmttyped.std.PromiseFulfilledResult[T] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.PromiseFulfilledResult[T]]
  }
  
  @scala.inline
  def PromiseRejectedResult(reason: js.Any, status: rejected): tmttyped.std.PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[tmttyped.std.PromiseRejectedResult]
  }
}
