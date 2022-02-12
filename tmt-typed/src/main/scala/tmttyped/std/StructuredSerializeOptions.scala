package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructuredSerializeOptions extends StObject {
  
  /* standard DOM */
  var transfer: js.UndefOr[js.Array[Any]] = js.undefined
}
object StructuredSerializeOptions {
  
  @scala.inline
  def apply(): StructuredSerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredSerializeOptions]
  }
  
  @scala.inline
  implicit class StructuredSerializeOptionsMutableBuilder[Self <: StructuredSerializeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransfer(value: js.Array[Any]): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    @scala.inline
    def setTransferVarargs(value: Any*): Self = StObject.set(x, "transfer", js.Array(value :_*))
  }
}
