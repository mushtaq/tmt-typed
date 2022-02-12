package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeObserverOptions extends StObject {
  
  /* standard DOM */
  var box: js.UndefOr[ResizeObserverBoxOptions] = js.undefined
}
object ResizeObserverOptions {
  
  @scala.inline
  def apply(): ResizeObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeObserverOptions]
  }
  
  @scala.inline
  implicit class ResizeObserverOptionsMutableBuilder[Self <: ResizeObserverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBox(value: ResizeObserverBoxOptions): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
  }
}
