package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBGLDebugShaders extends StObject {
  
  /* standard DOM */
  def getTranslatedShaderSource(shader: org.scalajs.dom.WebGLShader): java.lang.String
}
object WEBGLDebugShaders {
  
  @scala.inline
  def apply(getTranslatedShaderSource: org.scalajs.dom.WebGLShader => java.lang.String): WEBGLDebugShaders = {
    val __obj = js.Dynamic.literal(getTranslatedShaderSource = js.Any.fromFunction1(getTranslatedShaderSource))
    __obj.asInstanceOf[WEBGLDebugShaders]
  }
  
  @scala.inline
  implicit class WEBGLDebugShadersMutableBuilder[Self <: WEBGLDebugShaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTranslatedShaderSource(value: org.scalajs.dom.WebGLShader => java.lang.String): Self = StObject.set(x, "getTranslatedShaderSource", js.Any.fromFunction1(value))
  }
}
