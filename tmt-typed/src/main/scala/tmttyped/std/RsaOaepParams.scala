package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaOaepParams
  extends StObject
     with Algorithm {
  
  /* standard DOM */
  var label: js.UndefOr[BufferSource] = js.undefined
}
object RsaOaepParams {
  
  @scala.inline
  def apply(name: java.lang.String): RsaOaepParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOaepParams]
  }
  
  @scala.inline
  implicit class RsaOaepParamsMutableBuilder[Self <: RsaOaepParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: BufferSource): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
