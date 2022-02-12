package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actual extends StObject {
  
  /** The `actual` property on the error instance. */
  var actual: js.UndefOr[Any] = js.undefined
  
  /** The `expected` property on the error instance. */
  var expected: js.UndefOr[Any] = js.undefined
  
  /** If provided, the error message is set to this value. */
  var message: js.UndefOr[String] = js.undefined
  
  /** The `operator` property on the error instance. */
  var operator: js.UndefOr[String] = js.undefined
  
  /** If provided, the generated stack trace omits frames before this function. */
  // tslint:disable-next-line:ban-types
  var stackStartFn: js.UndefOr[js.Function] = js.undefined
}
object Actual {
  
  @scala.inline
  def apply(): Actual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actual]
  }
  
  @scala.inline
  implicit class ActualMutableBuilder[Self <: Actual] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActual(value: Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    @scala.inline
    def setExpected(value: Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setStackStartFn(value: js.Function): Self = StObject.set(x, "stackStartFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackStartFnUndefined: Self = StObject.set(x, "stackStartFn", js.undefined)
  }
}
