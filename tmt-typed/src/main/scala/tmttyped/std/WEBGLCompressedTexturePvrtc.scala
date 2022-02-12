package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBGLCompressedTexturePvrtc extends StObject {
  
  /* standard DOM */
  val COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: GLenum
  
  /* standard DOM */
  val COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: GLenum
  
  /* standard DOM */
  val COMPRESSED_RGB_PVRTC_2BPPV1_IMG: GLenum
  
  /* standard DOM */
  val COMPRESSED_RGB_PVRTC_4BPPV1_IMG: GLenum
}
object WEBGLCompressedTexturePvrtc {
  
  @scala.inline
  def apply(
    COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: GLenum,
    COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: GLenum,
    COMPRESSED_RGB_PVRTC_2BPPV1_IMG: GLenum,
    COMPRESSED_RGB_PVRTC_4BPPV1_IMG: GLenum
  ): WEBGLCompressedTexturePvrtc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = COMPRESSED_RGBA_PVRTC_2BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = COMPRESSED_RGBA_PVRTC_4BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGB_PVRTC_2BPPV1_IMG = COMPRESSED_RGB_PVRTC_2BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGB_PVRTC_4BPPV1_IMG = COMPRESSED_RGB_PVRTC_4BPPV1_IMG.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLCompressedTexturePvrtc]
  }
  
  @scala.inline
  implicit class WEBGLCompressedTexturePvrtcMutableBuilder[Self <: WEBGLCompressedTexturePvrtc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCOMPRESSED_RGBA_PVRTC_2BPPV1_IMG(value: GLenum): Self = StObject.set(x, "COMPRESSED_RGBA_PVRTC_2BPPV1_IMG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMPRESSED_RGBA_PVRTC_4BPPV1_IMG(value: GLenum): Self = StObject.set(x, "COMPRESSED_RGBA_PVRTC_4BPPV1_IMG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMPRESSED_RGB_PVRTC_2BPPV1_IMG(value: GLenum): Self = StObject.set(x, "COMPRESSED_RGB_PVRTC_2BPPV1_IMG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMPRESSED_RGB_PVRTC_4BPPV1_IMG(value: GLenum): Self = StObject.set(x, "COMPRESSED_RGB_PVRTC_4BPPV1_IMG", value.asInstanceOf[js.Any])
  }
}
