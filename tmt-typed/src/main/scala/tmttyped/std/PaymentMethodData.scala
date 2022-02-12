package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodData extends StObject {
  
  /* standard DOM */
  var data: js.UndefOr[Any] = js.undefined
  
  /* standard DOM */
  var supportedMethods: java.lang.String
}
object PaymentMethodData {
  
  @scala.inline
  def apply(supportedMethods: java.lang.String): PaymentMethodData = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
  
  @scala.inline
  implicit class PaymentMethodDataMutableBuilder[Self <: PaymentMethodData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setSupportedMethods(value: java.lang.String): Self = StObject.set(x, "supportedMethods", value.asInstanceOf[js.Any])
  }
}
