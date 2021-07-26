package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentValidationErrors extends StObject {
  
  var error: js.UndefOr[java.lang.String] = js.undefined
  
  var payer: js.UndefOr[PayerErrors] = js.undefined
  
  var paymentMethod: js.UndefOr[js.Any] = js.undefined
  
  var shippingAddress: js.UndefOr[AddressErrors] = js.undefined
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
    def setPayer(value: PayerErrors): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayerUndefined: Self = StObject.set(x, "payer", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: js.Any): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    @scala.inline
    def setShippingAddress(value: AddressErrors): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
  }
}
