package tmttyped.node.dnsMod

import tmttyped.node.nodeStrings.TXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyTxtRecord extends AnyRecord {
  
  var entries: js.Array[String]
  
  var `type`: TXT
}
object AnyTxtRecord {
  
  @scala.inline
  def apply(entries: js.Array[String], `type`: TXT): AnyTxtRecord = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyTxtRecord]
  }
  
  @scala.inline
  implicit class AnyTxtRecordMutableBuilder[Self <: AnyTxtRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TXT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
