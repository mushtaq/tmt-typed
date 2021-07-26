package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsUpdate
  extends StObject
     with PaymentDetailsBase {
  
  var error: js.UndefOr[java.lang.String] = js.undefined
  
  var payerErrors: js.UndefOr[PayerErrors] = js.undefined
  
  var paymentMethodErrors: js.UndefOr[js.Any] = js.undefined
  
  var shippingAddressErrors: js.UndefOr[AddressErrors] = js.undefined
  
  var total: js.UndefOr[PaymentItem] = js.undefined
}
object PaymentDetailsUpdate {
  
  @scala.inline
  def apply(): PaymentDetailsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetailsUpdate]
  }
  
  @scala.inline
  implicit class PaymentDetailsUpdateMutableBuilder[Self <: PaymentDetailsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: java.lang.String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setPayerErrors(value: PayerErrors): Self = StObject.set(x, "payerErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayerErrorsUndefined: Self = StObject.set(x, "payerErrors", js.undefined)
    
    @scala.inline
    def setPaymentMethodErrors(value: js.Any): Self = StObject.set(x, "paymentMethodErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodErrorsUndefined: Self = StObject.set(x, "paymentMethodErrors", js.undefined)
    
    @scala.inline
    def setShippingAddressErrors(value: AddressErrors): Self = StObject.set(x, "shippingAddressErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAddressErrorsUndefined: Self = StObject.set(x, "shippingAddressErrors", js.undefined)
    
    @scala.inline
    def setTotal(value: PaymentItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
