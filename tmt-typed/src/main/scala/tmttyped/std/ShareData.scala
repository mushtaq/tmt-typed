package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareData extends StObject {
  
  /* standard DOM */
  var files: js.UndefOr[js.Array[org.scalajs.dom.File]] = js.undefined
  
  /* standard DOM */
  var text: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var title: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var url: js.UndefOr[java.lang.String] = js.undefined
}
object ShareData {
  
  @scala.inline
  def apply(): ShareData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareData]
  }
  
  @scala.inline
  implicit class ShareDataMutableBuilder[Self <: ShareData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[org.scalajs.dom.File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: org.scalajs.dom.File*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
