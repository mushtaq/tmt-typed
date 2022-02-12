package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitEventInit
  extends StObject
     with EventInit {
  
  /* standard DOM */
  var submitter: js.UndefOr[org.scalajs.dom.HTMLElement | Null] = js.undefined
}
object SubmitEventInit {
  
  @scala.inline
  def apply(): SubmitEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitEventInit]
  }
  
  @scala.inline
  implicit class SubmitEventInitMutableBuilder[Self <: SubmitEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubmitter(value: org.scalajs.dom.HTMLElement): Self = StObject.set(x, "submitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitterNull: Self = StObject.set(x, "submitter", null)
    
    @scala.inline
    def setSubmitterUndefined: Self = StObject.set(x, "submitter", js.undefined)
  }
}
