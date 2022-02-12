package tmttyped.std.Intl

import tmttyped.std.stdStrings.code
import tmttyped.std.stdStrings.currency
import tmttyped.std.stdStrings.language
import tmttyped.std.stdStrings.none
import tmttyped.std.stdStrings.region
import tmttyped.std.stdStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayNamesOptions extends StObject {
  
  /* standard es2020.intl */
  var fallback: code | none
  
  /* standard es2020.intl */
  var localeMatcher: RelativeTimeFormatLocaleMatcher
  
  /* standard es2020.intl */
  var style: RelativeTimeFormatStyle
  
  /* standard es2020.intl */
  var `type`: language | region | script | currency
}
object DisplayNamesOptions {
  
  @scala.inline
  def apply(
    fallback: code | none,
    localeMatcher: RelativeTimeFormatLocaleMatcher,
    style: RelativeTimeFormatStyle,
    `type`: language | region | script | currency
  ): DisplayNamesOptions = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesOptions]
  }
  
  @scala.inline
  implicit class DisplayNamesOptionsMutableBuilder[Self <: DisplayNamesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallback(value: code | none): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMatcher(value: RelativeTimeFormatLocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: RelativeTimeFormatStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: language | region | script | currency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
