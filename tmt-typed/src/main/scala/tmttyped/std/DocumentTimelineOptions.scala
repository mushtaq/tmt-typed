package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentTimelineOptions extends StObject {
  
  /* standard DOM */
  var originTime: js.UndefOr[DOMHighResTimeStamp] = js.undefined
}
object DocumentTimelineOptions {
  
  @scala.inline
  def apply(): DocumentTimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTimelineOptions]
  }
  
  @scala.inline
  implicit class DocumentTimelineOptionsMutableBuilder[Self <: DocumentTimelineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "originTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginTimeUndefined: Self = StObject.set(x, "originTime", js.undefined)
  }
}
