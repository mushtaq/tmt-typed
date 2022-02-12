package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceMarkOptions extends StObject {
  
  /* standard DOM */
  var detail: js.UndefOr[Any] = js.undefined
  
  /* standard DOM */
  var startTime: js.UndefOr[DOMHighResTimeStamp] = js.undefined
}
object PerformanceMarkOptions {
  
  @scala.inline
  def apply(): PerformanceMarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMarkOptions]
  }
  
  @scala.inline
  implicit class PerformanceMarkOptionsMutableBuilder[Self <: PerformanceMarkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setStartTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
