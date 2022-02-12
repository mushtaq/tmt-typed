package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaCapabilities extends StObject {
  
  /* standard DOM */
  def decodingInfo(configuration: MediaDecodingConfiguration): js.Promise[MediaCapabilitiesDecodingInfo]
  
  /* standard DOM */
  def encodingInfo(configuration: MediaEncodingConfiguration): js.Promise[MediaCapabilitiesEncodingInfo]
}
object MediaCapabilities {
  
  @scala.inline
  def apply(
    decodingInfo: MediaDecodingConfiguration => js.Promise[MediaCapabilitiesDecodingInfo],
    encodingInfo: MediaEncodingConfiguration => js.Promise[MediaCapabilitiesEncodingInfo]
  ): MediaCapabilities = {
    val __obj = js.Dynamic.literal(decodingInfo = js.Any.fromFunction1(decodingInfo), encodingInfo = js.Any.fromFunction1(encodingInfo))
    __obj.asInstanceOf[MediaCapabilities]
  }
  
  @scala.inline
  implicit class MediaCapabilitiesMutableBuilder[Self <: MediaCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecodingInfo(value: MediaDecodingConfiguration => js.Promise[MediaCapabilitiesDecodingInfo]): Self = StObject.set(x, "decodingInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodingInfo(value: MediaEncodingConfiguration => js.Promise[MediaCapabilitiesEncodingInfo]): Self = StObject.set(x, "encodingInfo", js.Any.fromFunction1(value))
  }
}
