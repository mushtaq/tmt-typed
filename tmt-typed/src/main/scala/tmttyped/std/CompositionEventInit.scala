package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionEventInit
  extends StObject
     with UIEventInit {
  
  /* standard DOM */
  var data: js.UndefOr[java.lang.String] = js.undefined
}
object CompositionEventInit {
  
  @scala.inline
  def apply(): CompositionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionEventInit]
  }
  
  @scala.inline
  implicit class CompositionEventInitMutableBuilder[Self <: CompositionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: java.lang.String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
