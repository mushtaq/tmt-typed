package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodChangeEventInit
  extends StObject
     with EventInit {
  
  /* standard DOM */
  var methodDetails: js.UndefOr[Any] = js.undefined
  
  /* standard DOM */
  var methodName: js.UndefOr[java.lang.String] = js.undefined
}
object PaymentMethodChangeEventInit {
  
  @scala.inline
  def apply(): PaymentMethodChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentMethodChangeEventInit]
  }
  
  @scala.inline
  implicit class PaymentMethodChangeEventInitMutableBuilder[Self <: PaymentMethodChangeEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethodDetails(value: Any): Self = StObject.set(x, "methodDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodDetailsUndefined: Self = StObject.set(x, "methodDetails", js.undefined)
    
    @scala.inline
    def setMethodName(value: java.lang.String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
  }
}
