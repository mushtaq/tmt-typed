package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBGLCompressedTextureEtc1 extends StObject {
  
  /* standard DOM */
  val COMPRESSED_RGB_ETC1_WEBGL: GLenum
}
object WEBGLCompressedTextureEtc1 {
  
  @scala.inline
  def apply(COMPRESSED_RGB_ETC1_WEBGL: GLenum): WEBGLCompressedTextureEtc1 = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGB_ETC1_WEBGL = COMPRESSED_RGB_ETC1_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLCompressedTextureEtc1]
  }
  
  @scala.inline
  implicit class WEBGLCompressedTextureEtc1MutableBuilder[Self <: WEBGLCompressedTextureEtc1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCOMPRESSED_RGB_ETC1_WEBGL(value: GLenum): Self = StObject.set(x, "COMPRESSED_RGB_ETC1_WEBGL", value.asInstanceOf[js.Any])
  }
}
