package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorNetworkInformation extends StObject {
  
  /* standard DOM */
  val connection: NetworkInformation
}
object NavigatorNetworkInformation {
  
  @scala.inline
  def apply(connection: NetworkInformation): NavigatorNetworkInformation = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorNetworkInformation]
  }
  
  @scala.inline
  implicit class NavigatorNetworkInformationMutableBuilder[Self <: NavigatorNetworkInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: NetworkInformation): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
  }
}
