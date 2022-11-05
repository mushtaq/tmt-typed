package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGTests extends StObject {
  
  /* standard DOM */
  val requiredExtensions: org.scalajs.dom.SVGStringList
  
  /* standard DOM */
  val systemLanguage: org.scalajs.dom.SVGStringList
}
object SVGTests {
  
  inline def apply(requiredExtensions: org.scalajs.dom.SVGStringList, systemLanguage: org.scalajs.dom.SVGStringList): SVGTests = {
    val __obj = js.Dynamic.literal(requiredExtensions = requiredExtensions.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTests]
  }
  
  extension [Self <: SVGTests](x: Self) {
    
    inline def setRequiredExtensions(value: org.scalajs.dom.SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    inline def setSystemLanguage(value: org.scalajs.dom.SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
  }
}
