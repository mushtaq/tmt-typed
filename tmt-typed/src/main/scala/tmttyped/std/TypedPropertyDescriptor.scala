package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedPropertyDescriptor[T] extends StObject {
  
  /* standard es5 */
  var configurable: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard es5 */
  var enumerable: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard es5 */
  var get: js.UndefOr[js.Function0[T]] = js.undefined
  
  /* standard es5 */
  var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  
  /* standard es5 */
  var value: js.UndefOr[T] = js.undefined
  
  /* standard es5 */
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}
object TypedPropertyDescriptor {
  
  @scala.inline
  def apply[T](): TypedPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedPropertyDescriptor[T]]
  }
  
  @scala.inline
  implicit class TypedPropertyDescriptorMutableBuilder[Self <: TypedPropertyDescriptor[_], T] (val x: Self with TypedPropertyDescriptor[T]) extends AnyVal {
    
    @scala.inline
    def setConfigurable(value: scala.Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
    
    @scala.inline
    def setEnumerable(value: scala.Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
    
    @scala.inline
    def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setSet(value: /* value */ T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWritable(value: scala.Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
