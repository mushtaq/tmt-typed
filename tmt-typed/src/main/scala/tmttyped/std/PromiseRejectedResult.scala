package tmttyped.std

import tmttyped.std.stdStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromiseRejectedResult
  extends StObject
     with PromiseSettledResult[Any] {
  
  /* standard es2020.promise */
  var reason: Any
  
  /* standard es2020.promise */
  var status: rejected
}
object PromiseRejectedResult {
  
  @scala.inline
  def apply(reason: Any): PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
    __obj.asInstanceOf[PromiseRejectedResult]
  }
  
  @scala.inline
  implicit class PromiseRejectedResultMutableBuilder[Self <: PromiseRejectedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
