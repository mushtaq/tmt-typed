package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionOptions extends StObject {
  
  /* standard DOM */
  var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var maximumAge: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var timeout: js.UndefOr[Double] = js.undefined
}
object PositionOptions {
  
  @scala.inline
  def apply(): PositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionOptions]
  }
  
  @scala.inline
  implicit class PositionOptionsMutableBuilder[Self <: PositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableHighAccuracy(value: scala.Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
    
    @scala.inline
    def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
