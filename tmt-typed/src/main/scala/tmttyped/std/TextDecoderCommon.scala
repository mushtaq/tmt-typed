package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDecoderCommon extends StObject {
  
  /** Returns encoding's name, lowercased. */
  /* standard DOM */
  val encoding: java.lang.String
  
  /** Returns true if error mode is "fatal", otherwise false. */
  /* standard DOM */
  val fatal: scala.Boolean
  
  /** Returns the value of ignore BOM. */
  /* standard DOM */
  val ignoreBOM: scala.Boolean
}
object TextDecoderCommon {
  
  @scala.inline
  def apply(encoding: java.lang.String, fatal: scala.Boolean, ignoreBOM: scala.Boolean): TextDecoderCommon = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderCommon]
  }
  
  @scala.inline
  implicit class TextDecoderCommonMutableBuilder[Self <: TextDecoderCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: java.lang.String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatal(value: scala.Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreBOM(value: scala.Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
  }
}
