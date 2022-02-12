package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorAutomationInformation extends StObject {
  
  /* standard DOM */
  val webdriver: scala.Boolean
}
object NavigatorAutomationInformation {
  
  @scala.inline
  def apply(webdriver: scala.Boolean): NavigatorAutomationInformation = {
    val __obj = js.Dynamic.literal(webdriver = webdriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorAutomationInformation]
  }
  
  @scala.inline
  implicit class NavigatorAutomationInformationMutableBuilder[Self <: NavigatorAutomationInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebdriver(value: scala.Boolean): Self = StObject.set(x, "webdriver", value.asInstanceOf[js.Any])
  }
}
