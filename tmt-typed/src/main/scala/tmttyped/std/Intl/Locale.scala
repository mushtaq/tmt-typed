package tmttyped.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale
  extends StObject
     with LocaleOptions {
  
  /** Gets the most likely values for the language, script, and region of the locale based on existing values. */
  /* standard es2020.intl */
  def maximize(): Locale
  
  /** Attempts to remove information about the locale that would be added by calling `Locale.maximize()`. */
  /* standard es2020.intl */
  def minimize(): Locale
}
object Locale {
  
  @scala.inline
  def apply(maximize: () => Locale, minimize: () => Locale): Locale = {
    val __obj = js.Dynamic.literal(maximize = js.Any.fromFunction0(maximize), minimize = js.Any.fromFunction0(minimize))
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximize(value: () => Locale): Self = StObject.set(x, "maximize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinimize(value: () => Locale): Self = StObject.set(x, "minimize", js.Any.fromFunction0(value))
  }
}
