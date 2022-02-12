package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait DeviceMotionEventRotationRate extends StObject {
  
  /* standard DOM */
  val alpha: Double | Null
  
  /* standard DOM */
  val beta: Double | Null
  
  /* standard DOM */
  val gamma: Double | Null
}
object DeviceMotionEventRotationRate {
  
  @scala.inline
  def apply(): DeviceMotionEventRotationRate = {
    val __obj = js.Dynamic.literal(alpha = null, beta = null, gamma = null)
    __obj.asInstanceOf[DeviceMotionEventRotationRate]
  }
  
  @scala.inline
  implicit class DeviceMotionEventRotationRateMutableBuilder[Self <: DeviceMotionEventRotationRate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaNull: Self = StObject.set(x, "alpha", null)
    
    @scala.inline
    def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetaNull: Self = StObject.set(x, "beta", null)
    
    @scala.inline
    def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGammaNull: Self = StObject.set(x, "gamma", null)
  }
}
