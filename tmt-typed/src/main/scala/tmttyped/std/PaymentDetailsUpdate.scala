package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsUpdate
  extends StObject
     with PaymentDetailsBase {
  
  /* standard DOM */
  var paymentMethodErrors: js.UndefOr[Any] = js.undefined
  
  /* standard DOM */
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
    def setPaymentMethodErrors(value: Any): Self = StObject.set(x, "paymentMethodErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodErrorsUndefined: Self = StObject.set(x, "paymentMethodErrors", js.undefined)
    
    @scala.inline
    def setTotal(value: PaymentItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
