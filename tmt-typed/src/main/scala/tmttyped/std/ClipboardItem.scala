package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipboardItem extends StObject {
  
  /* standard DOM */
  def getType(`type`: java.lang.String): js.Promise[org.scalajs.dom.Blob]
  
  /* standard DOM */
  val types: js.Array[java.lang.String]
}
object ClipboardItem {
  
  @scala.inline
  def apply(getType: java.lang.String => js.Promise[org.scalajs.dom.Blob], types: js.Array[java.lang.String]): ClipboardItem = {
    val __obj = js.Dynamic.literal(getType = js.Any.fromFunction1(getType), types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardItem]
  }
  
  @scala.inline
  implicit class ClipboardItemMutableBuilder[Self <: ClipboardItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetType(value: java.lang.String => js.Promise[org.scalajs.dom.Blob]): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
