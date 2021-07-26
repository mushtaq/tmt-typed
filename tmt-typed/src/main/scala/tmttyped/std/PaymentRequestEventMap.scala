package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentRequestEventMap extends StObject {
  
  var paymentmethodchange: org.scalajs.dom.raw.Event
  
  var shippingaddresschange: org.scalajs.dom.raw.Event
  
  var shippingoptionchange: org.scalajs.dom.raw.Event
}
object PaymentRequestEventMap {
  
  @scala.inline
  def apply(
    paymentmethodchange: org.scalajs.dom.raw.Event,
    shippingaddresschange: org.scalajs.dom.raw.Event,
    shippingoptionchange: org.scalajs.dom.raw.Event
  ): PaymentRequestEventMap = {
    val __obj = js.Dynamic.literal(paymentmethodchange = paymentmethodchange.asInstanceOf[js.Any], shippingaddresschange = shippingaddresschange.asInstanceOf[js.Any], shippingoptionchange = shippingoptionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestEventMap]
  }
  
  @scala.inline
  implicit class PaymentRequestEventMapMutableBuilder[Self <: PaymentRequestEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaymentmethodchange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "paymentmethodchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingaddresschange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "shippingaddresschange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingoptionchange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "shippingoptionchange", value.asInstanceOf[js.Any])
  }
}
