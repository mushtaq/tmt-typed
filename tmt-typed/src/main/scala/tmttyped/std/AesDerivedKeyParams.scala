package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesDerivedKeyParams
  extends StObject
     with Algorithm {
  
  /* standard DOM */
  var length: Double
}
object AesDerivedKeyParams {
  
  @scala.inline
  def apply(length: Double, name: java.lang.String): AesDerivedKeyParams = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesDerivedKeyParams]
  }
  
  @scala.inline
  implicit class AesDerivedKeyParamsMutableBuilder[Self <: AesDerivedKeyParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
