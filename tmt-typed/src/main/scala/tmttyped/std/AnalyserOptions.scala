package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyserOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard DOM */
  var fftSize: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var maxDecibels: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var minDecibels: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var smoothingTimeConstant: js.UndefOr[Double] = js.undefined
}
object AnalyserOptions {
  
  @scala.inline
  def apply(): AnalyserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyserOptions]
  }
  
  @scala.inline
  implicit class AnalyserOptionsMutableBuilder[Self <: AnalyserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFftSize(value: Double): Self = StObject.set(x, "fftSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFftSizeUndefined: Self = StObject.set(x, "fftSize", js.undefined)
    
    @scala.inline
    def setMaxDecibels(value: Double): Self = StObject.set(x, "maxDecibels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDecibelsUndefined: Self = StObject.set(x, "maxDecibels", js.undefined)
    
    @scala.inline
    def setMinDecibels(value: Double): Self = StObject.set(x, "minDecibels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDecibelsUndefined: Self = StObject.set(x, "minDecibels", js.undefined)
    
    @scala.inline
    def setSmoothingTimeConstant(value: Double): Self = StObject.set(x, "smoothingTimeConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothingTimeConstantUndefined: Self = StObject.set(x, "smoothingTimeConstant", js.undefined)
  }
}
