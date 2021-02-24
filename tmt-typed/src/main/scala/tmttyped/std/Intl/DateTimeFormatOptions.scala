package tmttyped.std.Intl

import tmttyped.std.stdNumbers.`0`
import tmttyped.std.stdNumbers.`1`
import tmttyped.std.stdNumbers.`2`
import tmttyped.std.stdNumbers.`3`
import tmttyped.std.stdStrings.`2-digit`
import tmttyped.std.stdStrings.`best fit`
import tmttyped.std.stdStrings.basic
import tmttyped.std.stdStrings.full
import tmttyped.std.stdStrings.h11
import tmttyped.std.stdStrings.h12
import tmttyped.std.stdStrings.h23
import tmttyped.std.stdStrings.h24
import tmttyped.std.stdStrings.long
import tmttyped.std.stdStrings.lookup
import tmttyped.std.stdStrings.medium
import tmttyped.std.stdStrings.narrow
import tmttyped.std.stdStrings.numeric
import tmttyped.std.stdStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeFormatOptions extends StObject {
  
  var calendar: js.UndefOr[String] = js.undefined
  
  var dateStyle: js.UndefOr[full | long | medium | short] = js.undefined
  
  var day: js.UndefOr[numeric | `2-digit`] = js.undefined
  
  var dayPeriod: js.UndefOr[narrow | short | long] = js.undefined
  
  var era: js.UndefOr[long | short | narrow] = js.undefined
  
  var formatMatcher: js.UndefOr[(`best fit`) | basic] = js.undefined
  
  var fractionalSecondDigits: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
  
  var hour: js.UndefOr[numeric | `2-digit`] = js.undefined
  
  var hour12: js.UndefOr[Boolean] = js.undefined
  
  var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.undefined
  
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
  
  var minute: js.UndefOr[numeric | `2-digit`] = js.undefined
  
  var month: js.UndefOr[numeric | `2-digit` | long | short | narrow] = js.undefined
  
  var numberingSystem: js.UndefOr[String] = js.undefined
  
  var second: js.UndefOr[numeric | `2-digit`] = js.undefined
  
  var timeStyle: js.UndefOr[full | long | medium | short] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
  
  var timeZoneName: js.UndefOr[long | short] = js.undefined
  
  var weekday: js.UndefOr[long | short | narrow] = js.undefined
  
  var year: js.UndefOr[numeric | `2-digit`] = js.undefined
}
object DateTimeFormatOptions {
  
  @scala.inline
  def apply(): DateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeFormatOptions]
  }
  
  @scala.inline
  implicit class DateTimeFormatOptionsMutableBuilder[Self <: DateTimeFormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendar(value: String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    @scala.inline
    def setDateStyle(value: full | long | medium | short): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
    
    @scala.inline
    def setDay(value: numeric | `2-digit`): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayPeriod(value: narrow | short | long): Self = StObject.set(x, "dayPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayPeriodUndefined: Self = StObject.set(x, "dayPeriod", js.undefined)
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setEra(value: long | short | narrow): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
    
    @scala.inline
    def setFormatMatcher(value: (`best fit`) | basic): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
    
    @scala.inline
    def setFractionalSecondDigits(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "fractionalSecondDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFractionalSecondDigitsUndefined: Self = StObject.set(x, "fractionalSecondDigits", js.undefined)
    
    @scala.inline
    def setHour(value: numeric | `2-digit`): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour12(value: Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
    
    @scala.inline
    def setHourCycle(value: h11 | h12 | h23 | h24): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    
    @scala.inline
    def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    @scala.inline
    def setMinute(value: numeric | `2-digit`): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    @scala.inline
    def setMonth(value: numeric | `2-digit` | long | short | narrow): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    @scala.inline
    def setSecond(value: numeric | `2-digit`): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    @scala.inline
    def setTimeStyle(value: full | long | medium | short): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneName(value: long | short): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setWeekday(value: long | short | narrow): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    @scala.inline
    def setYear(value: numeric | `2-digit`): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
