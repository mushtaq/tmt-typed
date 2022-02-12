package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCCertificateExpiration extends StObject {
  
  /* standard DOM */
  var expires: js.UndefOr[DOMTimeStamp] = js.undefined
}
object RTCCertificateExpiration {
  
  @scala.inline
  def apply(): RTCCertificateExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCCertificateExpiration]
  }
  
  @scala.inline
  implicit class RTCCertificateExpirationMutableBuilder[Self <: RTCCertificateExpiration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires(value: DOMTimeStamp): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
  }
}
