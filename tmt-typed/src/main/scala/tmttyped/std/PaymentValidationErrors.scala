package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentValidationErrors extends StObject {
  
  /* standard DOM */
  var error: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var paymentMethod: js.UndefOr[Any] = js.undefined
}
object PaymentValidationErrors {
  
  @scala.inline
  def apply(): PaymentValidationErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentValidationErrors]
  }
  
  @scala.inline
  implicit class PaymentValidationErrorsMutableBuilder[Self <: PaymentValidationErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: java.lang.String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: Any): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
  }
}
