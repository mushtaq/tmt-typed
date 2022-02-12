package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyDescriptor extends StObject {
  
  /* standard es5 */
  var configurable: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard es5 */
  var enumerable: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard es5 */
  var get: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /* standard es5 */
  var set: js.UndefOr[js.Function1[/* v */ Any, Unit]] = js.undefined
  
  /* standard es5 */
  var value: js.UndefOr[Any] = js.undefined
  
  /* standard es5 */
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}
object PropertyDescriptor {
  
  @scala.inline
  def apply(): PropertyDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyDescriptor]
  }
  
  @scala.inline
  implicit class PropertyDescriptorMutableBuilder[Self <: PropertyDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurable(value: scala.Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
    
    @scala.inline
    def setEnumerable(value: scala.Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
    
    @scala.inline
    def setGet(value: () => Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setSet(value: /* v */ Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWritable(value: scala.Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
