package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEncoderCommon extends StObject {
  
  /** Returns "utf-8". */
  /* standard DOM */
  val encoding: java.lang.String
}
object TextEncoderCommon {
  
  @scala.inline
  def apply(encoding: java.lang.String): TextEncoderCommon = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderCommon]
  }
  
  @scala.inline
  implicit class TextEncoderCommonMutableBuilder[Self <: TextEncoderCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: java.lang.String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
