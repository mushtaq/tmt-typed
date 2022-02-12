package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpHeaderExtensionParameters extends StObject {
  
  /* standard DOM */
  var encrypted: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var id: Double
  
  /* standard DOM */
  var uri: java.lang.String
}
object RTCRtpHeaderExtensionParameters {
  
  @scala.inline
  def apply(id: Double, uri: java.lang.String): RTCRtpHeaderExtensionParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpHeaderExtensionParameters]
  }
  
  @scala.inline
  implicit class RTCRtpHeaderExtensionParametersMutableBuilder[Self <: RTCRtpHeaderExtensionParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncrypted(value: scala.Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: java.lang.String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
