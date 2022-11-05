package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceEventTiming
  extends StObject
     with PerformanceEntry {
  
  /* standard DOM */
  val cancelable: scala.Boolean
  
  /* standard DOM */
  val processingEnd: DOMHighResTimeStamp
  
  /* standard DOM */
  val processingStart: DOMHighResTimeStamp
  
  /* standard DOM */
  val target: org.scalajs.dom.Node | Null
}
object PerformanceEventTiming {
  
  inline def apply(
    cancelable: scala.Boolean,
    duration: DOMHighResTimeStamp,
    entryType: java.lang.String,
    name: java.lang.String,
    processingEnd: DOMHighResTimeStamp,
    processingStart: DOMHighResTimeStamp,
    startTime: DOMHighResTimeStamp,
    toJSON: () => Any
  ): PerformanceEventTiming = {
    val __obj = js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processingEnd = processingEnd.asInstanceOf[js.Any], processingStart = processingStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), target = null)
    __obj.asInstanceOf[PerformanceEventTiming]
  }
  
  extension [Self <: PerformanceEventTiming](x: Self) {
    
    inline def setCancelable(value: scala.Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setProcessingEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "processingEnd", value.asInstanceOf[js.Any])
    
    inline def setProcessingStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "processingStart", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: org.scalajs.dom.Node): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
  }
}
