package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentRequestEventMap extends StObject {
  
  /* standard DOM */
  var paymentmethodchange: org.scalajs.dom.Event
}
object PaymentRequestEventMap {
  
  @scala.inline
  def apply(paymentmethodchange: org.scalajs.dom.Event): PaymentRequestEventMap = {
    val __obj = js.Dynamic.literal(paymentmethodchange = paymentmethodchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestEventMap]
  }
  
  @scala.inline
  implicit class PaymentRequestEventMapMutableBuilder[Self <: PaymentRequestEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaymentmethodchange(value: org.scalajs.dom.Event): Self = StObject.set(x, "paymentmethodchange", value.asInstanceOf[js.Any])
  }
}
