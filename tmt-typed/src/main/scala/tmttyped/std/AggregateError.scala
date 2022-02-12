package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateError
  extends StObject
     with Error {
  
  /* standard es2021.promise */
  var errors: js.Array[Any]
}
object AggregateError {
  
  @scala.inline
  def apply(errors: js.Array[Any], message: java.lang.String, name: java.lang.String): AggregateError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateError]
  }
  
  @scala.inline
  implicit class AggregateErrorMutableBuilder[Self <: AggregateError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
