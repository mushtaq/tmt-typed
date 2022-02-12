package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permissions extends StObject {
  
  /* standard DOM */
  def query(permissionDesc: PermissionDescriptor): js.Promise[PermissionStatus]
}
object Permissions {
  
  @scala.inline
  def apply(query: PermissionDescriptor => js.Promise[PermissionStatus]): Permissions = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[Permissions]
  }
  
  @scala.inline
  implicit class PermissionsMutableBuilder[Self <: Permissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: PermissionDescriptor => js.Promise[PermissionStatus]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
  }
}
