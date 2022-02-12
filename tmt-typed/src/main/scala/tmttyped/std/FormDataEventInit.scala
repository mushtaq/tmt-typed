package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormDataEventInit
  extends StObject
     with EventInit {
  
  /* standard DOM */
  var formData: org.scalajs.dom.FormData
}
object FormDataEventInit {
  
  @scala.inline
  def apply(formData: org.scalajs.dom.FormData): FormDataEventInit = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormDataEventInit]
  }
  
  @scala.inline
  implicit class FormDataEventInitMutableBuilder[Self <: FormDataEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormData(value: org.scalajs.dom.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
  }
}
