package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDetailsBase extends StObject {
  
  /* standard DOM */
  var displayItems: js.UndefOr[js.Array[PaymentItem]] = js.undefined
  
  /* standard DOM */
  var modifiers: js.UndefOr[js.Array[PaymentDetailsModifier]] = js.undefined
}
object PaymentDetailsBase {
  
  @scala.inline
  def apply(): PaymentDetailsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetailsBase]
  }
  
  @scala.inline
  implicit class PaymentDetailsBaseMutableBuilder[Self <: PaymentDetailsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayItems(value: js.Array[PaymentItem]): Self = StObject.set(x, "displayItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayItemsUndefined: Self = StObject.set(x, "displayItems", js.undefined)
    
    @scala.inline
    def setDisplayItemsVarargs(value: PaymentItem*): Self = StObject.set(x, "displayItems", js.Array(value :_*))
    
    @scala.inline
    def setModifiers(value: js.Array[PaymentDetailsModifier]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setModifiersVarargs(value: PaymentDetailsModifier*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
  }
}
