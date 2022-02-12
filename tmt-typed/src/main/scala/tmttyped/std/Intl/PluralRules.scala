package tmttyped.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluralRules extends StObject {
  
  /* standard es2018.intl */
  def resolvedOptions(): ResolvedPluralRulesOptions
  
  /* standard es2018.intl */
  def select(n: Double): LDMLPluralRule
}
object PluralRules {
  
  @scala.inline
  def apply(resolvedOptions: () => ResolvedPluralRulesOptions, select: Double => LDMLPluralRule): PluralRules = {
    val __obj = js.Dynamic.literal(resolvedOptions = js.Any.fromFunction0(resolvedOptions), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[PluralRules]
  }
  
  @scala.inline
  implicit class PluralRulesMutableBuilder[Self <: PluralRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolvedOptions(value: () => ResolvedPluralRulesOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelect(value: Double => LDMLPluralRule): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
  }
}
