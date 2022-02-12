package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebkitURL extends StObject {
  
  var webkitURL: /* import warning: importer.ImportType#apply Failed type conversion: infer URL */ js.Any
}
object WebkitURL {
  
  @scala.inline
  def apply(
    webkitURL: /* import warning: importer.ImportType#apply Failed type conversion: infer URL */ js.Any
  ): WebkitURL = {
    val __obj = js.Dynamic.literal(webkitURL = webkitURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebkitURL]
  }
  
  @scala.inline
  implicit class WebkitURLMutableBuilder[Self <: WebkitURL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebkitURL(value: /* import warning: importer.ImportType#apply Failed type conversion: infer URL */ js.Any): Self = StObject.set(x, "webkitURL", value.asInstanceOf[js.Any])
  }
}
