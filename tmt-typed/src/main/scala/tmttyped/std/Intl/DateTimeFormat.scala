package tmttyped.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeFormat extends StObject {
  
  /* standard es5 */
  def format(): String = js.native
  def format(date: js.Date): String = js.native
  def format(date: Double): String = js.native
  
  /* standard es2017.intl */
  def formatToParts(): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: js.Date): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: Double): js.Array[DateTimeFormatPart] = js.native
  
  /* standard es5 */
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}
