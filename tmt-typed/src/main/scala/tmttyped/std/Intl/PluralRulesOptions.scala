package tmttyped.std.Intl

import tmttyped.std.stdStrings.`best fit`
import tmttyped.std.stdStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluralRulesOptions extends StObject {
  
  /* standard es2018.intl */
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  
  /* standard es2018.intl */
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2018.intl */
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2018.intl */
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2018.intl */
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2018.intl */
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2018.intl */
  var `type`: js.UndefOr[PluralRuleType] = js.undefined
}
object PluralRulesOptions {
  
  @scala.inline
  def apply(): PluralRulesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluralRulesOptions]
  }
  
  @scala.inline
  implicit class PluralRulesOptionsMutableBuilder[Self <: PluralRulesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
    
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
    
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumIntegerDigitsUndefined: Self = StObject.set(x, "minimumIntegerDigits", js.undefined)
    
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    @scala.inline
    def setType(value: PluralRuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
