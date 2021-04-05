package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationCoordinates extends StObject {
  
  val accuracy: Double
  
  val altitude: Double | Null
  
  val altitudeAccuracy: Double | Null
  
  val heading: Double | Null
  
  val latitude: Double
  
  val longitude: Double
  
  val speed: Double | Null
}
object GeolocationCoordinates {
  
  @scala.inline
  def apply(accuracy: Double, latitude: Double, longitude: Double): GeolocationCoordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], altitude = null, altitudeAccuracy = null, heading = null, speed = null)
    __obj.asInstanceOf[GeolocationCoordinates]
  }
  
  @scala.inline
  implicit class GeolocationCoordinatesMutableBuilder[Self <: GeolocationCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracyNull: Self = StObject.set(x, "altitudeAccuracy", null)
    
    @scala.inline
    def setAltitudeNull: Self = StObject.set(x, "altitude", null)
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingNull: Self = StObject.set(x, "heading", null)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedNull: Self = StObject.set(x, "speed", null)
  }
}
