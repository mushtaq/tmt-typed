package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioTimestamp extends StObject {
  
  /* standard DOM */
  var contextTime: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var performanceTime: js.UndefOr[DOMHighResTimeStamp] = js.undefined
}
object AudioTimestamp {
  
  @scala.inline
  def apply(): AudioTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioTimestamp]
  }
  
  @scala.inline
  implicit class AudioTimestampMutableBuilder[Self <: AudioTimestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextTime(value: Double): Self = StObject.set(x, "contextTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextTimeUndefined: Self = StObject.set(x, "contextTime", js.undefined)
    
    @scala.inline
    def setPerformanceTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "performanceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceTimeUndefined: Self = StObject.set(x, "performanceTime", js.undefined)
  }
}
