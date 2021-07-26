package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentResponseEventMap extends StObject {
  
  var payerdetailchange: org.scalajs.dom.raw.Event
}
object PaymentResponseEventMap {
  
  @scala.inline
  def apply(payerdetailchange: org.scalajs.dom.raw.Event): PaymentResponseEventMap = {
    val __obj = js.Dynamic.literal(payerdetailchange = payerdetailchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentResponseEventMap]
  }
  
  @scala.inline
  implicit class PaymentResponseEventMapMutableBuilder[Self <: PaymentResponseEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayerdetailchange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "payerdetailchange", value.asInstanceOf[js.Any])
  }
}
