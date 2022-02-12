package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleRequestOptions extends StObject {
  
  /* standard DOM */
  var timeout: js.UndefOr[Double] = js.undefined
}
object IdleRequestOptions {
  
  @scala.inline
  def apply(): IdleRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdleRequestOptions]
  }
  
  @scala.inline
  implicit class IdleRequestOptionsMutableBuilder[Self <: IdleRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
