package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBDatabaseInfo extends StObject {
  
  /* standard DOM */
  var name: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var version: js.UndefOr[Double] = js.undefined
}
object IDBDatabaseInfo {
  
  @scala.inline
  def apply(): IDBDatabaseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBDatabaseInfo]
  }
  
  @scala.inline
  implicit class IDBDatabaseInfoMutableBuilder[Self <: IDBDatabaseInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
