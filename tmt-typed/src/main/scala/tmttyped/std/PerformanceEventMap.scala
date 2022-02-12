package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceEventMap extends StObject {
  
  /* standard DOM */
  var resourcetimingbufferfull: org.scalajs.dom.Event
}
object PerformanceEventMap {
  
  @scala.inline
  def apply(resourcetimingbufferfull: org.scalajs.dom.Event): PerformanceEventMap = {
    val __obj = js.Dynamic.literal(resourcetimingbufferfull = resourcetimingbufferfull.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEventMap]
  }
  
  @scala.inline
  implicit class PerformanceEventMapMutableBuilder[Self <: PerformanceEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcetimingbufferfull(value: org.scalajs.dom.Event): Self = StObject.set(x, "resourcetimingbufferfull", value.asInstanceOf[js.Any])
  }
}
