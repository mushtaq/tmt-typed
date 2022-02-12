package tmttyped.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeFormatPart extends StObject {
  
  /* standard es2017.intl */
  var `type`: DateTimeFormatPartTypes
  
  /* standard es2017.intl */
  var value: String
}
object DateTimeFormatPart {
  
  @scala.inline
  def apply(`type`: DateTimeFormatPartTypes, value: String): DateTimeFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeFormatPart]
  }
  
  @scala.inline
  implicit class DateTimeFormatPartMutableBuilder[Self <: DateTimeFormatPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DateTimeFormatPartTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
