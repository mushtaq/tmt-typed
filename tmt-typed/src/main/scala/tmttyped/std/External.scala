package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated */
trait External extends StObject {
  
  /** @deprecated */
  /* standard DOM */
  def AddSearchProvider(): Unit
  
  /** @deprecated */
  /* standard DOM */
  def IsSearchProviderInstalled(): Unit
}
object External {
  
  inline def apply(AddSearchProvider: () => Unit, IsSearchProviderInstalled: () => Unit): External = {
    val __obj = js.Dynamic.literal(AddSearchProvider = js.Any.fromFunction0(AddSearchProvider), IsSearchProviderInstalled = js.Any.fromFunction0(IsSearchProviderInstalled))
    __obj.asInstanceOf[External]
  }
  
  extension [Self <: External](x: Self) {
    
    inline def setAddSearchProvider(value: () => Unit): Self = StObject.set(x, "AddSearchProvider", js.Any.fromFunction0(value))
    
    inline def setIsSearchProviderInstalled(value: () => Unit): Self = StObject.set(x, "IsSearchProviderInstalled", js.Any.fromFunction0(value))
  }
}
