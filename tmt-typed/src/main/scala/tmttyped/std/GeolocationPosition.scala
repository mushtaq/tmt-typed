package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait GeolocationPosition extends StObject {
  
  /* standard DOM */
  val coords: GeolocationCoordinates
  
  /* standard DOM */
  val timestamp: DOMTimeStamp
}
object GeolocationPosition {
  
  @scala.inline
  def apply(coords: GeolocationCoordinates, timestamp: DOMTimeStamp): GeolocationPosition = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationPosition]
  }
  
  @scala.inline
  implicit class GeolocationPositionMutableBuilder[Self <: GeolocationPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoords(value: GeolocationCoordinates): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: DOMTimeStamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
