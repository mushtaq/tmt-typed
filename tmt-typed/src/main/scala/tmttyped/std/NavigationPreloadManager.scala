package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait NavigationPreloadManager extends StObject {
  
  /* standard DOM */
  def disable(): js.Promise[Unit]
  
  /* standard DOM */
  def enable(): js.Promise[Unit]
  
  /* standard DOM */
  def getState(): js.Promise[NavigationPreloadState]
  
  /* standard DOM */
  def setHeaderValue(value: java.lang.String): js.Promise[Unit]
}
object NavigationPreloadManager {
  
  inline def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getState: () => js.Promise[NavigationPreloadState],
    setHeaderValue: java.lang.String => js.Promise[Unit]
  ): NavigationPreloadManager = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getState = js.Any.fromFunction0(getState), setHeaderValue = js.Any.fromFunction1(setHeaderValue))
    __obj.asInstanceOf[NavigationPreloadManager]
  }
  
  extension [Self <: NavigationPreloadManager](x: Self) {
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setGetState(value: () => js.Promise[NavigationPreloadState]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setSetHeaderValue(value: java.lang.String => js.Promise[Unit]): Self = StObject.set(x, "setHeaderValue", js.Any.fromFunction1(value))
  }
}
