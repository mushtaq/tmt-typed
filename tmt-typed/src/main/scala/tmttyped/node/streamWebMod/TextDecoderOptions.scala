package tmttyped.node.streamWebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecoderOptions extends StObject {
  
  var fatal: js.UndefOr[Boolean] = js.undefined
  
  var ignoreBOM: js.UndefOr[Boolean] = js.undefined
}
object TextDecoderOptions {
  
  @scala.inline
  def apply(): TextDecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDecoderOptions]
  }
  
  @scala.inline
  implicit class TextDecoderOptionsMutableBuilder[Self <: TextDecoderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
    
    @scala.inline
    def setIgnoreBOM(value: Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreBOMUndefined: Self = StObject.set(x, "ignoreBOM", js.undefined)
  }
}
