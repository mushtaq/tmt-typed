package tmttyped.node.dnsMod

import tmttyped.node.nodeStrings.CNAME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyCnameRecord extends AnyRecord {
  
  var `type`: CNAME
  
  var value: String
}
object AnyCnameRecord {
  
  @scala.inline
  def apply(`type`: CNAME, value: String): AnyCnameRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyCnameRecord]
  }
  
  @scala.inline
  implicit class AnyCnameRecordMutableBuilder[Self <: AnyCnameRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: CNAME): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
