package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeriodicWaveConstraints extends StObject {
  
  /* standard DOM */
  var disableNormalization: js.UndefOr[scala.Boolean] = js.undefined
}
object PeriodicWaveConstraints {
  
  @scala.inline
  def apply(): PeriodicWaveConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeriodicWaveConstraints]
  }
  
  @scala.inline
  implicit class PeriodicWaveConstraintsMutableBuilder[Self <: PeriodicWaveConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableNormalization(value: scala.Boolean): Self = StObject.set(x, "disableNormalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableNormalizationUndefined: Self = StObject.set(x, "disableNormalization", js.undefined)
  }
}
