package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiquadFilterOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard DOM */
  var Q: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var detune: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var gain: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var `type`: js.UndefOr[BiquadFilterType] = js.undefined
}
object BiquadFilterOptions {
  
  @scala.inline
  def apply(): BiquadFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiquadFilterOptions]
  }
  
  @scala.inline
  implicit class BiquadFilterOptionsMutableBuilder[Self <: BiquadFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetune(value: Double): Self = StObject.set(x, "detune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetuneUndefined: Self = StObject.set(x, "detune", js.undefined)
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    @scala.inline
    def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
    
    @scala.inline
    def setQ(value: Double): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "Q", js.undefined)
    
    @scala.inline
    def setType(value: BiquadFilterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
