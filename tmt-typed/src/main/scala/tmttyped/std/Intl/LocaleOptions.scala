package tmttyped.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleOptions extends StObject {
  
  /** A string containing the language, and the script and region if available. */
  /* standard es2020.intl */
  var baseName: js.UndefOr[String] = js.undefined
  
  /** The part of the Locale that indicates the locale's calendar era. */
  /* standard es2020.intl */
  var calendar: js.UndefOr[String] = js.undefined
  
  /** Flag that defines whether case is taken into account for the locale's collation rules. */
  /* standard es2020.intl */
  var caseFirst: js.UndefOr[LocaleCollationCaseFirst] = js.undefined
  
  /** The collation type used for sorting */
  /* standard es2020.intl */
  var collation: js.UndefOr[String] = js.undefined
  
  /** The time keeping format convention used by the locale. */
  /* standard es2020.intl */
  var hourCycle: js.UndefOr[LocaleHourCycleKey] = js.undefined
  
  /** The primary language subtag associated with the locale. */
  /* standard es2020.intl */
  var language: js.UndefOr[String] = js.undefined
  
  /** The numeral system used by the locale. */
  /* standard es2020.intl */
  var numberingSystem: js.UndefOr[String] = js.undefined
  
  /** Flag that defines whether the locale has special collation handling for numeric characters. */
  /* standard es2020.intl */
  var numeric: js.UndefOr[Boolean] = js.undefined
  
  /** The region of the world (usually a country) associated with the locale. Possible values are region codes as defined by ISO 3166-1. */
  /* standard es2020.intl */
  var region: js.UndefOr[String] = js.undefined
  
  /** The script used for writing the particular language used in the locale. Possible values are script codes as defined by ISO 15924. */
  /* standard es2020.intl */
  var script: js.UndefOr[String] = js.undefined
}
object LocaleOptions {
  
  @scala.inline
  def apply(): LocaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleOptions]
  }
  
  @scala.inline
  implicit class LocaleOptionsMutableBuilder[Self <: LocaleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseName(value: String): Self = StObject.set(x, "baseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseNameUndefined: Self = StObject.set(x, "baseName", js.undefined)
    
    @scala.inline
    def setCalendar(value: String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    @scala.inline
    def setCaseFirst(value: LocaleCollationCaseFirst): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
    
    @scala.inline
    def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setHourCycle(value: LocaleHourCycleKey): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    @scala.inline
    def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
