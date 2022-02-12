package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceBufferListEventMap extends StObject {
  
  /* standard DOM */
  var addsourcebuffer: org.scalajs.dom.Event
  
  /* standard DOM */
  var removesourcebuffer: org.scalajs.dom.Event
}
object SourceBufferListEventMap {
  
  @scala.inline
  def apply(addsourcebuffer: org.scalajs.dom.Event, removesourcebuffer: org.scalajs.dom.Event): SourceBufferListEventMap = {
    val __obj = js.Dynamic.literal(addsourcebuffer = addsourcebuffer.asInstanceOf[js.Any], removesourcebuffer = removesourcebuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferListEventMap]
  }
  
  @scala.inline
  implicit class SourceBufferListEventMapMutableBuilder[Self <: SourceBufferListEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddsourcebuffer(value: org.scalajs.dom.Event): Self = StObject.set(x, "addsourcebuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovesourcebuffer(value: org.scalajs.dom.Event): Self = StObject.set(x, "removesourcebuffer", value.asInstanceOf[js.Any])
  }
}
