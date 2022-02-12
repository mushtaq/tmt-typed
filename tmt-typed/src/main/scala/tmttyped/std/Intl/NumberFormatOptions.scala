package tmttyped.std.Intl

import tmttyped.std.stdStrings.always
import tmttyped.std.stdStrings.auto
import tmttyped.std.stdStrings.compact
import tmttyped.std.stdStrings.engineering
import tmttyped.std.stdStrings.long
import tmttyped.std.stdStrings.narrow
import tmttyped.std.stdStrings.never
import tmttyped.std.stdStrings.scientific
import tmttyped.std.stdStrings.short
import tmttyped.std.stdStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormatOptions extends StObject {
  
  /* standard es2020.intl */
  var compactDisplay: js.UndefOr[short | long] = js.undefined
  
  /* standard es5 */
  var currency: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var currencyDisplay: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var currencySign: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var localeMatcher: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es5 */
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es5 */
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es5 */
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es5 */
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2020.intl */
  var notation: js.UndefOr[standard | scientific | engineering | compact] = js.undefined
  
  /* standard es2020.intl */
  var signDisplay: js.UndefOr[auto | never | always] = js.undefined
  
  /* standard es5 */
  var style: js.UndefOr[String] = js.undefined
  
  /* standard es2020.intl */
  var unit: js.UndefOr[String] = js.undefined
  
  /* standard es2020.intl */
  var unitDisplay: js.UndefOr[short | long | narrow] = js.undefined
  
  /* standard es5 */
  var useGrouping: js.UndefOr[Boolean] = js.undefined
}
object NumberFormatOptions {
  
  @scala.inline
  def apply(): NumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatOptions]
  }
  
  @scala.inline
  implicit class NumberFormatOptionsMutableBuilder[Self <: NumberFormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompactDisplay(value: short | long): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactDisplayUndefined: Self = StObject.set(x, "compactDisplay", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplay(value: String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    @scala.inline
    def setCurrencySign(value: String): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySignUndefined: Self = StObject.set(x, "currencySign", js.undefined)
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
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
    def setNotation(value: standard | scientific | engineering | compact): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotationUndefined: Self = StObject.set(x, "notation", js.undefined)
    
    @scala.inline
    def setSignDisplay(value: auto | never | always): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignDisplayUndefined: Self = StObject.set(x, "signDisplay", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplay(value: short | long | narrow): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplayUndefined: Self = StObject.set(x, "unitDisplay", js.undefined)
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
  }
}
