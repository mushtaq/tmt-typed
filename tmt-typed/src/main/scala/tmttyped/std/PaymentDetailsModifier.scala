package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsModifier extends StObject {
  
  /* standard DOM */
  var additionalDisplayItems: js.UndefOr[js.Array[PaymentItem]] = js.undefined
  
  /* standard DOM */
  var data: js.UndefOr[Any] = js.undefined
  
  /* standard DOM */
  var supportedMethods: java.lang.String
  
  /* standard DOM */
  var total: js.UndefOr[PaymentItem] = js.undefined
}
object PaymentDetailsModifier {
  
  @scala.inline
  def apply(supportedMethods: java.lang.String): PaymentDetailsModifier = {
    val __obj = js.Dynamic.literal(supportedMethods = supportedMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetailsModifier]
  }
  
  @scala.inline
  implicit class PaymentDetailsModifierMutableBuilder[Self <: PaymentDetailsModifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalDisplayItems(value: js.Array[PaymentItem]): Self = StObject.set(x, "additionalDisplayItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDisplayItemsUndefined: Self = StObject.set(x, "additionalDisplayItems", js.undefined)
    
    @scala.inline
    def setAdditionalDisplayItemsVarargs(value: PaymentItem*): Self = StObject.set(x, "additionalDisplayItems", js.Array(value :_*))
    
    @scala.inline
    def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setSupportedMethods(value: java.lang.String): Self = StObject.set(x, "supportedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: PaymentItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
