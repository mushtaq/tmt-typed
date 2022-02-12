package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMotionEventInit
  extends StObject
     with EventInit {
  
  /* standard DOM */
  var acceleration: js.UndefOr[DeviceMotionEventAccelerationInit] = js.undefined
  
  /* standard DOM */
  var accelerationIncludingGravity: js.UndefOr[DeviceMotionEventAccelerationInit] = js.undefined
  
  /* standard DOM */
  var interval: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var rotationRate: js.UndefOr[DeviceMotionEventRotationRateInit] = js.undefined
}
object DeviceMotionEventInit {
  
  @scala.inline
  def apply(): DeviceMotionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMotionEventInit]
  }
  
  @scala.inline
  implicit class DeviceMotionEventInitMutableBuilder[Self <: DeviceMotionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleration(value: DeviceMotionEventAccelerationInit): Self = StObject.set(x, "acceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerationIncludingGravity(value: DeviceMotionEventAccelerationInit): Self = StObject.set(x, "accelerationIncludingGravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerationIncludingGravityUndefined: Self = StObject.set(x, "accelerationIncludingGravity", js.undefined)
    
    @scala.inline
    def setAccelerationUndefined: Self = StObject.set(x, "acceleration", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setRotationRate(value: DeviceMotionEventRotationRateInit): Self = StObject.set(x, "rotationRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationRateUndefined: Self = StObject.set(x, "rotationRate", js.undefined)
  }
}
