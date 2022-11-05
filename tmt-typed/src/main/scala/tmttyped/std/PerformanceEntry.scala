package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates a single performance metric that is part of the performance timeline. A performance entry can be directly created by making a performance mark or measure (for example by calling the mark() method) at an explicit point in an application. Performance entries are also created in indirect ways such as loading a resource (such as an image). */
trait PerformanceEntry extends StObject {
  
  /* standard DOM */
  val duration: DOMHighResTimeStamp
  
  /* standard DOM */
  val entryType: java.lang.String
  
  /* standard DOM */
  val name: java.lang.String
  
  /* standard DOM */
  val startTime: DOMHighResTimeStamp
  
  /* standard DOM */
  def toJSON(): Any
}
object PerformanceEntry {
  
  inline def apply(
    duration: DOMHighResTimeStamp,
    entryType: java.lang.String,
    name: java.lang.String,
    startTime: DOMHighResTimeStamp,
    toJSON: () => Any
  ): PerformanceEntry = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[PerformanceEntry]
  }
  
  extension [Self <: PerformanceEntry](x: Self) {
    
    inline def setDuration(value: DOMHighResTimeStamp): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEntryType(value: java.lang.String): Self = StObject.set(x, "entryType", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
